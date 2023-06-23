package com.example.projekmoprolaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private FirebaseUser firebaseUser;
    private TextView textName, textLayanan;
    private View  viewCuciaja, viewCuciSetrika, viewDryCleaning, viewKarpet, viewKasur, viewSepatudanTas, viewsettinguser,viewhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.name);
        textLayanan = findViewById(R.id.layanan);
        viewCuciaja = findViewById(R.id.viewcuciaja);
        viewCuciSetrika = findViewById(R.id.viewcucisetrika);
        viewDryCleaning = findViewById(R.id.viewdrycleaning);
        viewKarpet = findViewById(R.id.viewkarpet);
        viewsettinguser = findViewById(R.id.settinguser);


        firebaseUser =FirebaseAuth.getInstance().getCurrentUser();

        if (firebaseUser!=null){
            textName.setText(firebaseUser.getDisplayName());
        }else{
            textName.setText("Login Gagal");
        }

        viewCuciaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CuciAja.class));
            }
        });

        viewCuciSetrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CuciSetrika.class));
            }
        });

        viewDryCleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DryCleaning.class));
            }
        });

        viewKarpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Karpet.class));
            }
        });

        viewsettinguser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SettingUser.class));
            }
        });

        viewhome = findViewById(R.id.home);
        viewhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });


    }
}