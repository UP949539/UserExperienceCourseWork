package com.uidesign.userexperience.eventlocator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.uidesign.userexperience.R;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

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

        Bundle b = getIntent().getExtras();
        final String name = b.getString("EventName");
        setTitle(name);

        ((TextView)findViewById(R.id.txtCount)).setText(b.getString("EventCount"));
        ((TextView)findViewById(R.id.txtDate)).setText(b.getString("EventDate"));
        ((TextView)findViewById(R.id.txtTime)).setText(b.getString("EventTime"));
    }
}