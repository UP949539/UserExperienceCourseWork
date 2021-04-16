package com.uidesign.userexperience;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.uidesign.userexperience.businerlocator.BusinessActivity;
import com.uidesign.userexperience.eventlocator.EventActivity;

public class EventLocatorActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_locator);

        setTitle("Event Locator");

        final Activity ctx = this;

        findViewById(R.id.lyt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, EventActivity.class);
                i.putExtra("EventName", "Event A");
                i.putExtra("EventCount", "20");
                i.putExtra("EventDate", "10/05/2021");
                i.putExtra("EventTime", "16:00");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, EventActivity.class);
                i.putExtra("EventName", "Event B");
                i.putExtra("EventCount", "5");
                i.putExtra("EventDate", "11/05/2021");
                i.putExtra("EventTime", "14:00");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, EventActivity.class);
                i.putExtra("EventName", "Event C");
                i.putExtra("EventCount", "12");
                i.putExtra("EventDate", "01/05/2021");
                i.putExtra("EventTime", "11:00");
                ctx.startActivity(i);
            }
        });

        findViewById(R.id.lyt4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ctx, EventActivity.class);
                i.putExtra("EventName", "Event D");
                i.putExtra("EventCount", "6");
                i.putExtra("EventDate", "15/05/2021");
                i.putExtra("EventTime", "01:30");
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