package com.uidesign.userexperience.businerlocator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.uidesign.userexperience.BusinessLocatorActivity;
import com.uidesign.userexperience.CovidTestingActivity;
import com.uidesign.userexperience.EventLocatorActivity;
import com.uidesign.userexperience.R;

public class BusinessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business);
    }
}