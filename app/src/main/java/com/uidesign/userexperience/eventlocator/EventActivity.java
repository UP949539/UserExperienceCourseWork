package com.uidesign.userexperience.eventlocator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.uidesign.userexperience.R;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Bundle b = getIntent().getExtras();
        final String name = b.getString("EventName");
        setTitle(name);

        ((TextView)findViewById(R.id.txtCount)).setText(b.getString("EventCount"));
        ((TextView)findViewById(R.id.txtDate)).setText(b.getString("EventDate"));
        ((TextView)findViewById(R.id.txtTime)).setText(b.getString("EventTime"));
    }
}