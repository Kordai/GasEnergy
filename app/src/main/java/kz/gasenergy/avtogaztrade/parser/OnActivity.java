package kz.gasenergy.avtogaztrade.parser;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import kz.gasenergy.avtogaztrade.MainActivity;

import java.util.concurrent.TimeUnit;


public class OnActivity extends AppCompatActivity {

    private final int PERMISSION_REQUEST_CODE = 0;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED&&i==0) {
            i = 1;
            requestMultiplePermissions();

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        super.onCreate(savedInstanceState);




        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void requestMultiplePermissions() {
        ActivityCompat.requestPermissions(this,
                new String[]{
                        Manifest.permission.ACCESS_FINE_LOCATION
                },
                PERMISSION_REQUEST_CODE);
    }
}
