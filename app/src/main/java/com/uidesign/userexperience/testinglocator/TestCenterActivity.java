package com.uidesign.userexperience.testinglocator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.uidesign.userexperience.R;

public class TestCenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_center);

        Bundle b = getIntent().getExtras();
        final String name = b.getString("CenterName");
        setTitle(name+" Testing Site");
    }
}