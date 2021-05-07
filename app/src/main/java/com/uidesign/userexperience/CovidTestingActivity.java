package com.uidesign.userexperience;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.uidesign.userexperience.businerlocator.BusinessActivity;
import com.uidesign.userexperience.testinglocator.TestCenterActivity;

public class CovidTestingActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_testing);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        setTitle("Business Locator");

        final Activity ctx = this;

        findViewById(R.id.lyt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, TestCenterActivity.class);
                i.putExtra("CenterName", "Portsmouth");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, TestCenterActivity.class);
                i.putExtra("CenterName", "Fratton");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, TestCenterActivity.class);
                i.putExtra("CenterName", "Gosport");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, TestCenterActivity.class);
                i.putExtra("CenterName", "Southampton");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, TestCenterActivity.class);
                i.putExtra("CenterName", "Winchester");
                ctx.startActivity(i);
            }
        });
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