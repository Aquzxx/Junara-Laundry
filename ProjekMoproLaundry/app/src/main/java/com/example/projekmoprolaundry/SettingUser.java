package com.example.projekmoprolaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SettingUser extends AppCompatActivity {
    private FirebaseUser firebaseUser;
    private TextView textName;
    private View viewlistback, viewLogout, viewhome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_user);
        textName = findViewById(R.id.name);

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if (firebaseUser!=null){
            textName.setText(firebaseUser.getDisplayName());
        }else{
            textName.setText("Login Gagal");
        }

        viewlistback = findViewById(R.id.listback);
        viewlistback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingUser.this, MainActivity.class));
            }
        });

        viewLogout  =findViewById(R.id.logoutbutton);
        viewLogout.setOnClickListener(v ->{
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();
        });

        viewhome = findViewById(R.id.home);
        viewhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingUser.this, MainActivity.class));
            }
        });

    }
}