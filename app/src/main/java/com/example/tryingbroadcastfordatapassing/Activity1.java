package com.example.tryingbroadcastfordatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);




        Intent ToActivity2 = new Intent(Activity1.this,Activity2.class);
        startActivity(ToActivity2);
    }
}
