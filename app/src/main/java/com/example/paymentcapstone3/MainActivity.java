package com.example.paymentcapstone3;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //private String[] p_method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gcashButton = findViewById(R.id.gcashButton);
        Button paymayaButton = findViewById(R.id.paymayaButton);
        Button paypalButton = findViewById(R.id.paypalButton);

        gcashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gcashIntent = getPackageManager().getLaunchIntentForPackage("com.globe.gcash.android");
                if (gcashIntent != null){
                    gcashIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(gcashIntent);
                }else {

                }
            }
        });

        paymayaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymayaIntent = getPackageManager().getLaunchIntentForPackage("com.paymaya");
                if (paymayaIntent != null){
                    paymayaIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(paymayaIntent);
                }else {

                }

            }
        });
        paypalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paypalIntent = getPackageManager().getLaunchIntentForPackage("com.paypal.android.p2pmobile");
                if (paypalIntent != null){
                    paypalIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(paypalIntent);
                }else {

                }
            }
        });

    }

}