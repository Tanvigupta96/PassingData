package com.example.tryingbroadcastfordatapassing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        text1 = findViewById(R.id.text1);
        LocalBroadcastManager.getInstance(this).registerReceiver(mReceiver,new IntentFilter("com.example.tryingbroadcastfordatapassing"));




    }

    private BroadcastReceiver mReceiver =new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String receivedName = intent.getStringExtra("name");
            text1.setText(receivedName);



        }
    };
}
