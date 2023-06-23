package com.example.projekmoprolaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmOrder extends AppCompatActivity {
    private View viewlistback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        viewlistback = findViewById(R.id.listback);
        viewlistback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConfirmOrder.this, MainActivity.class));
            }
        });
    }
}