package com.uidesign.userexperience;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CovidTestingActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_testing);

        setTitle("Business Locator");
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng portsUni = new LatLng(50.795291, -1.093834);
        mMap.addMarker(new MarkerOptions()
                .position(portsUni)
                .title("University of Portsmouth"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(portsUni));
    }
}