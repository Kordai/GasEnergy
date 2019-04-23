package kz.gasenergy.avtogaztrade;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import kz.gasenergy.avtogaztrade.parser.JSONParser;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class SvjazActivity extends Activity{

    private ProgressDialog pDialog;

    JSONParser jsonParser = new JSONParser();
    public EditText inputName;
    EditText inputMail;
    AutoCompleteTextView inputText;

    private static String url_create_product = "http://gasenergy.kz/create_otziv.php";

    private static final String TAG_SUCCESS = "success";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.svjaz_layout);

        inputName = (EditText) findViewById(R.id.inputName);
        inputMail = (EditText) findViewById(R.id.editText2);
        inputText = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        Button btnCreateProduct = (Button) findViewById(R.id.button2);

        btnCreateProduct.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new CreateNewProduct().execute();
            }
        });

    }


    class CreateNewProduct extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(SvjazActivity.this);
            pDialog.setMessage("Создание отзыва...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }


        protected String doInBackground(String[] args) {

            String name = inputName.getText().toString();
            String email = inputMail.getText().toString();
            String text = inputText.getText().toString();


            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("name", URLEncoder.encode(name)));
            params.add(new BasicNameValuePair("email", email));
            params.add(new BasicNameValuePair("text", URLEncoder.encode(text)));



            JSONObject json = jsonParser.makeHttpRequest(url_create_product, "POST", params);

            Log.d("Create Response", json.toString());

            try {
                int success = json.getInt(TAG_SUCCESS);

                if (success == 1) {

                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);


                    finish();
                }
            } catch (JSONException e) {

            }
                return null;
            }


        protected void onPostExecute(String file_url) {
            pDialog.dismiss();
        }

    }
}
