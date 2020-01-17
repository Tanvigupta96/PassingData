package com.example.tryingbroadcastfordatapassing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String name="Tannu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = new Intent("com.example.tryingbroadcastfordatapassing").putExtra("name",name);
        LocalBroadcastManager.getInstance(MainActivity.this).sendBroadcast(intent);

        Intent ToActivity1 = new Intent(MainActivity.this,Activity1.class);
        startActivity(ToActivity1);

    }
}
