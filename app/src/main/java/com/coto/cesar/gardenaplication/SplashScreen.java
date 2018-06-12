package com.coto.cesar.gardenaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent startActivity = new Intent(this, MainActivity.class);
        startActivity(startActivity);
        finish();
    }
}
