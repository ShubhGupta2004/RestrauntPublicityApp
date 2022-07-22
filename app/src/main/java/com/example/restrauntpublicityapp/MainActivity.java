package com.example.restrauntpublicityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loc(View v){
        Uri linkUrl = Uri.parse("https://www.google.com/maps/dir//location+of+dominos+in+vellore/@12.954836,79.1447554,17.59z/data=!4m9!4m8!1m1!4e2!1m5!1m1!1s0x3bad47666f6919c7:0xda263781c72e4f02!2m2!1d79.1369881!2d12.9558546");
        Intent in = new Intent(Intent.ACTION_VIEW,linkUrl);
        startActivity(in);
    }

    public void site(View v){
        Uri linkUrl = Uri.parse("https://www.dominos.co.in/store-locations/vellore/vellore-tamil-nadu");
        Intent in = new Intent(Intent.ACTION_VIEW,linkUrl);
        startActivity(in);
    }
}