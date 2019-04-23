package kz.gasenergy.avtogaztrade;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, OnMapReadyCallback {


    private GoogleMap mMap;
    private SupportMapFragment mapFragment;
    private double v = 42.383359;
    private double v1 = 69.629181;
    private ProgressDialog pDialog1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLocationListener.SetUpLocationListener(this);
        if (MyLocationListener.imHere!=null){
            v = MyLocationListener.imHere.getLatitude();
            v1 = MyLocationListener.imHere.getLongitude();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.Nalichi_Gas) {

        } else if (id == R.id.News) {

        } else if (id == R.id.karti_taloni) {
            Intent intent1 = new Intent(this, KartyActivity.class);
            startActivity(intent1);
        } else if (id == R.id.taloni) {
            Intent intent3 = new Intent(this, TalonyActivity.class);
            startActivity(intent3);
        } else if (id == R.id.svjaz) {
            Intent intent2 = new Intent(this, SvjazActivity.class);
            startActivity(intent2);

        } else if (id == R.id.taloni_karti_nal) {

        } else if (id == R.id.nal) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {


        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

//Астана
// Z-1
      //  LatLng AstanaZ1= new LatLng(51.147504, 71.502267);
      //  mMap.addMarker(new MarkerOptions().position(AstanaZ1).title("г. Астана АГЗС № Z-1").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-2
        LatLng AstanaZ2= new LatLng(51.111538, 71.684076);
        mMap.addMarker(new MarkerOptions().position(AstanaZ2).title("г. Астана АГЗС № Z-2").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-3
        LatLng AstanaZ3= new LatLng(51.098315, 71.413089);
        mMap.addMarker(new MarkerOptions().position(AstanaZ3).title("г. Астана АГЗС № Z-3").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-4
        LatLng AstanaZ4= new LatLng(51.068443, 71.394008);
        mMap.addMarker(new MarkerOptions().position(AstanaZ4).title("г. Астана АГЗС № Z-4").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-5
        LatLng AstanaZ5= new LatLng(51.145990, 71.374239);
        mMap.addMarker(new MarkerOptions().position(AstanaZ5).title("г. Астана АГЗС № Z-5").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-6
        LatLng AstanaZ6= new LatLng(51.122057, 71.285112);
        mMap.addMarker(new MarkerOptions().position(AstanaZ6).title("г. Астана АГЗС № Z-6").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-7
        LatLng AstanaZ7= new LatLng(51.202132, 71.305404);
        mMap.addMarker(new MarkerOptions().position(AstanaZ7).title("г. Астана АГЗС № Z-7").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-8
        LatLng AstanaZ8= new LatLng(51.268426, 71.369605);
        mMap.addMarker(new MarkerOptions().position(AstanaZ8).title("г. Астана АГЗС № Z-8").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-9
        LatLng AstanaZ9= new LatLng(50.997128, 71.371816);
        mMap.addMarker(new MarkerOptions().position(AstanaZ9).title("г. Астана АГЗС № Z-9").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-10
        LatLng AstanaZ10= new LatLng(51.215943, 71.516605);
        mMap.addMarker(new MarkerOptions().position(AstanaZ10).title("г. Астана АГЗС № Z-10").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-11
        LatLng AstanaZ11= new LatLng(51.179278, 71.489900);
        mMap.addMarker(new MarkerOptions().position(AstanaZ11).title("г. Астана АГЗС № Z-11").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-12
        LatLng AstanaZ12= new LatLng(51.156393, 71.527277);
        mMap.addMarker(new MarkerOptions().position(AstanaZ12).title("г. Астана АГЗС № Z-12").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-13
        LatLng AstanaZ13= new LatLng(51.166658, 71.464059);
        mMap.addMarker(new MarkerOptions().position(AstanaZ13).title("г. Астана АГЗС № Z-13").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-14
        LatLng AstanaZ14= new LatLng(51.202553, 71.487001);
        mMap.addMarker(new MarkerOptions().position(AstanaZ14).title("г. Астана АГЗС № Z-14").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-15
        LatLng AstanaZ15= new LatLng(51.175675, 71.475968);
        mMap.addMarker(new MarkerOptions().position(AstanaZ15).title("г. Астана АГЗС № Z-15").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-16
        LatLng AstanaZ16= new LatLng(51.156445, 71.450791);
        mMap.addMarker(new MarkerOptions().position(AstanaZ16).title("г. Астана АГЗС № Z-16").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-17
        LatLng AstanaZ17= new LatLng(51.043034, 71.477071);
        mMap.addMarker(new MarkerOptions().position(AstanaZ17).title("г. Астана АГЗС № Z-17").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-18
        LatLng AstanaZ18= new LatLng(51.101162, 71.717609);
        mMap.addMarker(new MarkerOptions().position(AstanaZ18).title("г. Астана АГЗС № Z-18").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-19
        LatLng AstanaZ19= new LatLng(51.166973, 71.477118);
        mMap.addMarker(new MarkerOptions().position(AstanaZ19).title("г. Астана АГЗС № Z-19").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// Z-20
        LatLng AstanaZ20= new LatLng(51.134500, 71.577282);
        mMap.addMarker(new MarkerOptions().position(AstanaZ20).title("г. Астана АГЗС № Z-20").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));




//Шимкент
// X-1
        LatLng ShimkentX1= new LatLng(42.383359, 69.629181);
        mMap.addMarker(new MarkerOptions().position(ShimkentX1).title("г. Шимкент АГЗС № X-1").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// X-2
        LatLng ShimkentX2= new LatLng(42.286269, 69.562872);
        mMap.addMarker(new MarkerOptions().position(ShimkentX2).title("г. Шимкент АГЗС № X-2").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// X-3
        LatLng ShimkentX3= new LatLng(42.306159, 69.602465);
        mMap.addMarker(new MarkerOptions().position(ShimkentX3).title("г. Шимкент АГЗС № X-3").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// X-4
        LatLng ShimkentX4= new LatLng(42.276191, 69.555474);
        mMap.addMarker(new MarkerOptions().position(ShimkentX4).title("г. Шимкент АГЗС № X-4").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// X-5
        LatLng ShimkentX5= new LatLng(42.413258, 69.629803);
        mMap.addMarker(new MarkerOptions().position(ShimkentX5).title("г. Шимкент АГЗС № X-5").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-6
        LatLng ShimkentX6= new LatLng(42.541797, 70.337674);
        mMap.addMarker(new MarkerOptions().position(ShimkentX6).title("г. Шимкент АГЗС № X-6").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-7
        LatLng ShimkentX7= new LatLng(41.403842, 69.048883);
        mMap.addMarker(new MarkerOptions().position(ShimkentX7).title("трасса Сарыагаш-Абай АГЗС № X-7").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-8
        LatLng ShimkentX8= new LatLng(42.480151, 69.813354);
        mMap.addMarker(new MarkerOptions().position(ShimkentX8).title("с. Аксу АГЗС № X-8").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-9
        LatLng ShimkentX9= new LatLng(42.353184, 69.614211);
        mMap.addMarker(new MarkerOptions().position(ShimkentX9).title("г. Шимкент АГЗС № X-9").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-10
        LatLng ShimkentX10= new LatLng(41.497182 , 69.356837);
        mMap.addMarker(new MarkerOptions().position(ShimkentX10).title("с.Жибек-Жолы АГЗС № X-10").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-11
        LatLng ShimkentX11= new LatLng(43.330083, 68.195028);
        mMap.addMarker(new MarkerOptions().position(ShimkentX11).title("г. Туркестан, трасса Кызылорда-Шымкент АГЗС № X-11").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-12
        LatLng ShimkentX12= new LatLng(41.473393, 69.184151);
        mMap.addMarker(new MarkerOptions().position(ShimkentX12).title("г. Сарыагаш АГЗС № X-12").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-13
        LatLng ShimkentX13= new LatLng(42.328124, 69.631513);
        mMap.addMarker(new MarkerOptions().position(ShimkentX13).title("г. Шимкент АГЗС № X-13").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-14
        LatLng ShimkentX14= new LatLng(42.289443, 69.627898);
        mMap.addMarker(new MarkerOptions().position(ShimkentX14).title("г. Шимкент АГЗС № X-14").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-15
        LatLng ShimkentX15= new LatLng(43.292452, 68.289451);
        mMap.addMarker(new MarkerOptions().position(ShimkentX15).title("г. Туркестан АГЗС № X-15").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-16
        LatLng ShimkentX16= new LatLng(43.307509, 68.243819);
        mMap.addMarker(new MarkerOptions().position(ShimkentX16).title("г. Туркестан АГЗС № X-16").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-17
        LatLng ShimkentX17= new LatLng(43.319066, 68.309314);
        mMap.addMarker(new MarkerOptions().position(ShimkentX17).title("г. Туркестан АГЗС № X-17").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-18
        LatLng ShimkentX18= new LatLng(41.337119, 68.946655);
        mMap.addMarker(new MarkerOptions().position(ShimkentX18).title("с. Абай АГЗС № X-18").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-19
        LatLng ShimkentX19= new LatLng(41.490951, 69.286605);
        mMap.addMarker(new MarkerOptions().position(ShimkentX19).title("с. Кабыланбек АГЗС № X-19").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-20
        LatLng ShimkentX20= new LatLng(42.181000, 69.847580);
        mMap.addMarker(new MarkerOptions().position(ShimkentX20).title("г. Ленгер АГЗС № X-20").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// X-21
        LatLng ShimkentX21= new LatLng(42.383822, 69.487349);
        mMap.addMarker(new MarkerOptions().position(ShimkentX21).title("г. Шимкент АГЗС № X-21").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));


//Кызылорда

// N-1
        LatLng KizilordaN1= new LatLng(44.788805, 65.532035);
        mMap.addMarker(new MarkerOptions().position(KizilordaN1).title("г. Кызылорда АГЗС № N-1").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-2
        LatLng KizilordaN2= new LatLng(44.793949, 65.541140);
        mMap.addMarker(new MarkerOptions().position(KizilordaN2).title("г. Кызылорда АГЗС № N-2").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-3
        LatLng KizilordaN3= new LatLng(44.875241, 65.541615);
        mMap.addMarker(new MarkerOptions().position(KizilordaN3).title("Трасса Кызылорда-Жезказган АГЗС № N-3").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-4
        LatLng KizilordaN4= new LatLng(44.871981, 65.451880);
        mMap.addMarker(new MarkerOptions().position(KizilordaN4).title("Трасса Кызылорда-Теренозек АГЗС № N-4").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-5
        LatLng KizilordaN5= new LatLng(44.818778, 65.573680);
        mMap.addMarker(new MarkerOptions().position(KizilordaN5).title("Трасса Кызылорда-Шиели АГЗС № N-5").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-6
        LatLng KizilordaN6= new LatLng(44.775615, 65.485825);
        mMap.addMarker(new MarkerOptions().position(KizilordaN6).title("Трасса Кызылорда-Казалы АГЗС № N-6").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-7
        LatLng KizilordaN7= new LatLng(44.856216, 65.476366);
        mMap.addMarker(new MarkerOptions().position(KizilordaN7).title("г. Кызылорда АГЗС № N-7").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-8
        LatLng KizilordaN8= new LatLng(45.038489, 64.986716);
        mMap.addMarker(new MarkerOptions().position(KizilordaN8).title("пос. Теренозек АГЗС № N-8").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-9
        LatLng KizilordaN9= new LatLng(45.078369, 64.684584);
        mMap.addMarker(new MarkerOptions().position(KizilordaN9).title("пос. Жалагаш АГЗС № N-9").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-10
        LatLng KizilordaN10= new LatLng(45.479442, 64.067607);
        mMap.addMarker(new MarkerOptions().position(KizilordaN10).title("пос. Жосалы АГЗС № N-10").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-11
        LatLng KizilordaN11= new LatLng(44.187286, 66.708168);
        mMap.addMarker(new MarkerOptions().position(KizilordaN11).title("Пос. Шиели АГЗС № N-11").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-12
        LatLng KizilordaN12= new LatLng(43.930976, 67.250403);
        mMap.addMarker(new MarkerOptions().position(KizilordaN12).title("Пос. Жанакорган АГЗС № N-12").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-13
        LatLng KizilordaN13= new LatLng(44.846143, 65.529780);
        mMap.addMarker(new MarkerOptions().position(KizilordaN13).title("г. Кызылорда АГЗС № N-13").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-14
        LatLng KizilordaN14= new LatLng(44.868490, 65.480737);
        mMap.addMarker(new MarkerOptions().position(KizilordaN14).title("г. Кызылорда АГЗС № N-14").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// N-15
        LatLng KizilordaN15= new LatLng(44.856369, 65.476969);
        mMap.addMarker(new MarkerOptions().position(KizilordaN15).title("г. Кызылорда АГЗС № N-15").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// N-16
        LatLng KizilordaN16= new LatLng(44.824127, 65.526990);
        mMap.addMarker(new MarkerOptions().position(KizilordaN16).title("г. Кызылорда АГЗС № N-16").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// N-17
        LatLng KizilordaN17= new LatLng(44.810971, 65.517860);
        mMap.addMarker(new MarkerOptions().position(KizilordaN17).title("г. Кызылорда АГЗС № N-17").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));

//Караганда
// М-1
        LatLng KaragandaM1= new LatLng(49.833613, 73.065686);
        mMap.addMarker(new MarkerOptions().position(KaragandaM1).title("г. Караанда АГЗС № М-1").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-2
        LatLng KaragandaM2= new LatLng(49.888967, 73.042893);
        mMap.addMarker(new MarkerOptions().position(KaragandaM2).title("г. Караанда АГЗС № М-2").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-3
        LatLng KaragandaM3= new LatLng(49.942877, 73.050687);

        mMap.addMarker(new MarkerOptions().position(KaragandaM3).title("г. Караанда АГЗС № М-3").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-4
        LatLng KaragandaM4= new LatLng(50.031942, 72.980236);
        mMap.addMarker(new MarkerOptions().position(KaragandaM4).title("г. Темиртау АГЗС № М-4").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-5
        LatLng KaragandaM5= new LatLng(49.789847, 73.12249);
        mMap.addMarker(new MarkerOptions().position(KaragandaM5).title("г. Караанда АГЗС № М-5").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-6
        LatLng KaragandaM6= new LatLng(49.807478, 73.145251);
        mMap.addMarker(new MarkerOptions().position(KaragandaM6).title("г. Караанда АГЗС № М-6").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-17
        LatLng KaragandaM17= new LatLng(49.803196, 73.11293);
        mMap.addMarker(new MarkerOptions().position(KaragandaM17).title("г. Караанда АГЗС № М-7").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-18
        LatLng KaragandaM18= new LatLng(50.057356, 72.983718);
        mMap.addMarker(new MarkerOptions().position(KaragandaM18).title("г. Темиртау АГЗС № М-8").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-9
        LatLng KaragandaM9= new LatLng(49.789688, 72.953242);
        mMap.addMarker(new MarkerOptions().position(KaragandaM9).title("г. Сарань, пос. Актас АГЗС № М-9").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-10
        LatLng KaragandaM10= new LatLng(49.832568, 73.107748);
        mMap.addMarker(new MarkerOptions().position(KaragandaM10).title("г. Караанда АГЗС № М-10").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-11
        LatLng KaragandaM11= new LatLng(49.909288, 73.197388);
        mMap.addMarker(new MarkerOptions().position(KaragandaM11).title("г. Караанда АГЗС № М-11").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-12
        LatLng KaragandaM12= new LatLng(49.879645, 73.182496);
        mMap.addMarker(new MarkerOptions().position(KaragandaM12).title("г. Караанда АГЗС № М-12").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-13
        LatLng KaragandaM13= new LatLng(49.826689, 73.16776);
        mMap.addMarker(new MarkerOptions().position(KaragandaM13).title("г. Караанда АГЗС № М-13").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-14
        LatLng KaragandaM14= new LatLng(49.776834, 73.160491);
        mMap.addMarker(new MarkerOptions().position(KaragandaM14).title("г. Караанда АГЗС № М-14").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-15
        LatLng KaragandaM15= new LatLng(49.778233, 73.082385);
        mMap.addMarker(new MarkerOptions().position(KaragandaM15).title("г. Караанда АГЗС № М-15").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// М-16
        LatLng KaragandaM16= new LatLng(49.7862, 73.079424);
        mMap.addMarker(new MarkerOptions().position(KaragandaM16).title("г. Караанда АГЗС № М-16").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));


//Павлодар

// S-1
        LatLng PavlodarS1= new LatLng(52.301798, 77.025542);
        mMap.addMarker(new MarkerOptions().position(PavlodarS1).title("г. Павлодар АГЗС № S-1").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-2
        LatLng PavlodarS2= new LatLng(52.28792, 77.030673);
        mMap.addMarker(new MarkerOptions().position(PavlodarS2).title("г. Павлодар АГЗС № S-2").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-3
        LatLng PavlodarS3= new LatLng(52.183084, 77.03977);
        mMap.addMarker(new MarkerOptions().position(PavlodarS3).title("пос. Кенжеколь АГЗС № S-3").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-4
       // LatLng PavlodarS4= new LatLng(52.323487, 76.906702);
       // mMap.addMarker(new MarkerOptions().position(PavlodarS4).title("г. Павлодар АГЗС № S-4").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-5
        LatLng PavlodarS5= new LatLng(52.323487, 76.906702);
        mMap.addMarker(new MarkerOptions().position(PavlodarS5).title("г. Павлодар АГЗС № S-5").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-6
        LatLng PavlodarS6= new LatLng(52.325186, 76.905044);
        mMap.addMarker(new MarkerOptions().position(PavlodarS6).title("г. Павлодар АГЗС № S-6").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-7
        LatLng PavlodarS7= new LatLng(52.259428, 76.766912);
        mMap.addMarker(new MarkerOptions().position(PavlodarS7).title("пос. Ленинский АГЗС № S-7").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-8
        LatLng PavlodarS8= new LatLng(51.707832, 74.665022);
        mMap.addMarker(new MarkerOptions().position(PavlodarS8).title("г.Экибастуз, пос.Шидерты АГЗС № S-8").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-9
        LatLng PavlodarS9= new LatLng(53.083192, 76.083533);
        mMap.addMarker(new MarkerOptions().position(PavlodarS9).title("Качирский р-н, с.Теренколь АГЗС № S-9").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-10
        LatLng PavlodarS10= new LatLng(53.139474, 77.645297);
        mMap.addMarker(new MarkerOptions().position(PavlodarS10).title("Успенский р-н, с.Ковалевка АГЗС № S-10").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-11
        LatLng PavlodarS11= new LatLng(52.277352, 76.983728);
        mMap.addMarker(new MarkerOptions().position(PavlodarS11).title("г. Павлодар АГЗС № S-11").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-12
        LatLng PavlodarS12= new LatLng(52.249012, 76.758222);
        mMap.addMarker(new MarkerOptions().position(PavlodarS12).title("г. Павлодар АГЗС № S-12").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-13
        LatLng PavlodarS13= new LatLng(52.306634, 76.927326);
        mMap.addMarker(new MarkerOptions().position(PavlodarS13).title("г. Павлодар АГЗС № S-13").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-14
        LatLng PavlodarS14= new LatLng(52.310356, 76.925440);
        mMap.addMarker(new MarkerOptions().position(PavlodarS14).title("г. Павлодар АГЗС № S-14").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-15
        LatLng PavlodarS15= new LatLng(52.274878, 76.997097);
        mMap.addMarker(new MarkerOptions().position(PavlodarS15).title("г. Павлодар АГЗС № S-15").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-16
        LatLng PavlodarS16= new LatLng(52.477805, 78.135878);
        mMap.addMarker(new MarkerOptions().position(PavlodarS16).title("ст.Шарбакты АГЗС № S-16").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-17
        LatLng PavlodarS17= new LatLng(52.054903, 76.910786);
        mMap.addMarker(new MarkerOptions().position(PavlodarS17).title("г. Аксу АГЗС № S-17").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-18
        LatLng PavlodarS18= new LatLng(51.788488, 75.333926);
        mMap.addMarker(new MarkerOptions().position(PavlodarS18).title("г. Экибастуз АГЗС № S-18").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// S-19
        LatLng PavlodarS19= new LatLng(51.717448, 75.339719);
        mMap.addMarker(new MarkerOptions().position(PavlodarS19).title("г. Экибастуз АГЗС № S-19").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));


//Алматы

// А-1
        LatLng AlmatyA1= new LatLng(43.296373, 76.987176);
        mMap.addMarker(new MarkerOptions().position(AlmatyA1).title("г. Алматы АГЗС № A-1").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-2
        LatLng AlmatyA2= new LatLng(43.312394, 76.967724);
        mMap.addMarker(new MarkerOptions().position(AlmatyA2).title("г. Алматы АГЗС № A-2").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-3
        LatLng AlmatyA3= new LatLng(43.338725, 76.933167);
        mMap.addMarker(new MarkerOptions().position(AlmatyA3).title("г. Алматы АГЗС № A-3").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-4
        LatLng AlmatyA4= new LatLng(43.313218, 76.901522);
        mMap.addMarker(new MarkerOptions().position(AlmatyA4).title("г. Алматы АГЗС № A-4").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-5
        LatLng AlmatyA5= new LatLng(43.330302, 76.849739);
        mMap.addMarker(new MarkerOptions().position(AlmatyA5).title("г. Алматы АГЗС № A-5").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-6
        LatLng AlmatyA6= new LatLng(43.226422, 76.741153);
        mMap.addMarker(new MarkerOptions().position(AlmatyA6).title("Трасса Алматы-Бишкек 19.6км АГЗС № A-6").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-7
        LatLng AlmatyA7= new LatLng(43.212308, 76.857517);
        mMap.addMarker(new MarkerOptions().position(AlmatyA7).title("г. Алматы АГЗС № A-7").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-8
        LatLng AlmatyA8= new LatLng(43.332908, 76.913021);
        mMap.addMarker(new MarkerOptions().position(AlmatyA8).title("г. Алматы АГЗС № A-8").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-9
        LatLng AlmatyA9= new LatLng(43.218, 76.88758);
        mMap.addMarker(new MarkerOptions().position(AlmatyA9).title("г. Алматы АГЗС № A-9").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-10
        LatLng AlmatyA10= new LatLng(43.225813, 76.9104);
        mMap.addMarker(new MarkerOptions().position(AlmatyA10).title("г. Алматы АГЗС № A-10").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-11
        LatLng AlmatyA11= new LatLng(43.263053, 76.89828);
        mMap.addMarker(new MarkerOptions().position(AlmatyA11).title("г. Алматы АГЗС № A-11").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-12
        LatLng AlmatyA12= new LatLng(43.274274, 76.977287);
        mMap.addMarker(new MarkerOptions().position(AlmatyA12).title("г. Алматы АГЗС № A-12").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-13
        LatLng AlmatyA13= new LatLng(43.178449, 76.803045);
        mMap.addMarker(new MarkerOptions().position(AlmatyA13).title("Карасайский  р-н, трасса Алматы–Жандосова АГЗС № A-13").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-14
        LatLng AlmatyA14= new LatLng(43.201807, 76.646106);
        mMap.addMarker(new MarkerOptions().position(AlmatyA14).title("г. Каскелен АГЗС № A-14").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-15
        LatLng AlmatyA15= new LatLng(43.228641, 76.757895);
        mMap.addMarker(new MarkerOptions().position(AlmatyA15).title("Трасса Алматы-Бишкек 13,2 км АГЗС № A-15").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-16
        LatLng AlmatyA16= new LatLng(43.241917, 76.820758);
        mMap.addMarker(new MarkerOptions().position(AlmatyA16).title("г. Алматы АГЗС № A-16").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-17
        LatLng AlmatyA17= new LatLng(43.402868, 77.1888);
        mMap.addMarker(new MarkerOptions().position(AlmatyA17).title("Енбекшиказахский р-он, с. Батерек АГЗС № A-17").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-18
        LatLng AlmatyA18= new LatLng(43.377611, 76.639506);
        mMap.addMarker(new MarkerOptions().position(AlmatyA18).title("п. Шамалган АГЗС № A-18").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-19
        LatLng AlmatyA19= new LatLng(43.473586, 76.808205);
        mMap.addMarker(new MarkerOptions().position(AlmatyA19).title("с. Чапай АГЗС № A-19").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-20
        LatLng AlmatyA20= new LatLng(43.856656, 77.041565);
        mMap.addMarker(new MarkerOptions().position(AlmatyA20).title("г. Капчагай АГЗС № A-20").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-21
        LatLng AlmatyA21= new LatLng(43.432685, 77.027181);
        mMap.addMarker(new MarkerOptions().position(AlmatyA21).title("Илийский р-н,с.Отеген Батыр АГЗС № A-21").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-22
        LatLng AlmatyA22= new LatLng(43.366768, 76.86745);
        mMap.addMarker(new MarkerOptions().position(AlmatyA22).title("р-он Боролдай, мкр. Водник АГЗС № A-22").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-23
        LatLng AlmatyA23= new LatLng(43.370488, 76.992559);
        mMap.addMarker(new MarkerOptions().position(AlmatyA23).title("г. Алматы АГЗС № A-23").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-24
        LatLng AlmatyA24= new LatLng(43.307741, 76.93015);
        mMap.addMarker(new MarkerOptions().position(AlmatyA24).title("г. Алматы АГЗС № A-24").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-25
        LatLng AlmatyA25= new LatLng(43.179219, 76.80371);
        mMap.addMarker(new MarkerOptions().position(AlmatyA25).title("Трасса Алматы-Жандосова АГЗС № A-25").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-26
        LatLng AlmatyA26= new LatLng(43.27158, 76.882701);
        mMap.addMarker(new MarkerOptions().position(AlmatyA26).title("г. Алматы АГЗС № A-26").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-27
        LatLng AlmatyA27= new LatLng(43.195614, 76.837753);
        mMap.addMarker(new MarkerOptions().position(AlmatyA27).title("г. Алматы АГЗС № A-27").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-28
        LatLng AlmatyA28= new LatLng(43.303545, 77.22294);
        mMap.addMarker(new MarkerOptions().position(AlmatyA28).title("г. Талгар АГЗС № A-28").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-29
        LatLng AlmatyA29= new LatLng(43.288221, 77.001501);
        mMap.addMarker(new MarkerOptions().position(AlmatyA29).title("г. Алматы АГЗС № A-29").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-30
        LatLng AlmatyA30= new LatLng(43.334938, 76.915432);
        mMap.addMarker(new MarkerOptions().position(AlmatyA30).title("г. Алматы АГЗС № A-30").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker1)));
// А-31
        LatLng AlmatyA31= new LatLng(43.292646, 77.009449);
        mMap.addMarker(new MarkerOptions().position(AlmatyA31).title("г. Алматы АГЗС № A-31").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// А-32
        LatLng AlmatyA32= new LatLng(43.347252, 76.900775);
        mMap.addMarker(new MarkerOptions().position(AlmatyA32).title("Трасса Алмата-Боролдай, 1км АГЗС № A-32").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// А-33
        LatLng AlmatyA33= new LatLng(43.308461, 76.944632);
        mMap.addMarker(new MarkerOptions().position(AlmatyA33).title("г. Алматы АГЗС № A-33").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// А-34
        LatLng AlmatyA34= new LatLng(43.366029, 76.712857);
        mMap.addMarker(new MarkerOptions().position(AlmatyA34).title("Карасайский рн.,с.Береке АГЗС № A-34").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// А-35
        LatLng AlmatyA35= new LatLng(43.372224, 77.428276);
        mMap.addMarker(new MarkerOptions().position(AlmatyA35).title("Енбек.рн., с.Есик АГЗС № A-35").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));
// А-36
        LatLng AlmatyA36= new LatLng(43.2206, 76.312718);
        mMap.addMarker(new MarkerOptions().position(AlmatyA36).title("Жамбылский рн.,с.Узынагаш АГЗС № A-36").icon(BitmapDescriptorFactory.fromResource(R.mipmap.mapmarker2)));


        CameraPosition pos = CameraPosition.builder().target(new LatLng(v, v1)).zoom(10).bearing(0).tilt(0).build();

        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(pos));


    }


    static class MyLocationListener implements LocationListener {

        static Location imHere; // здесь будет всегда доступна самая последняя информация о местоположении пользователя.



        public static void SetUpLocationListener(Context context) // это нужно запустить в самом начале работы программы
        {
            LocationManager locationManager = (LocationManager)
                    context.getSystemService(Context.LOCATION_SERVICE);

            LocationListener locationListener = new MyLocationListener();

            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                //ActivityCompat.requestPermissions(context, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
            } else  {
                locationManager.requestLocationUpdates(
                        LocationManager.GPS_PROVIDER,
                        5000,
                        10,
                        locationListener); // здесь можно указать другие более подходящие вам параметры

                imHere = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);


            }

        }

        @Override
        public void onLocationChanged(Location loc) {
            imHere = loc;
        }

        @Override
        public void onProviderDisabled(String provider) {
        }

        @Override
        public void onProviderEnabled(String provider) {
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
        }

        private static class REQUEST_LOCATION {
        }
    }

    }
