package com.uidesign.userexperience;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.uidesign.userexperience.businerlocator.BusinessActivity;

public class BusinessLocatorActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_locator);

        setTitle("Business Locator");

        final Activity ctx = this;

        findViewById(R.id.lyt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, BusinessActivity.class);
                i.putExtra("BusinessName", "Business A");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, BusinessActivity.class);
                i.putExtra("BusinessName", "Business B");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, BusinessActivity.class);
                i.putExtra("BusinessName", "Business C");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, BusinessActivity.class);
                i.putExtra("BusinessName", "Business D");
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