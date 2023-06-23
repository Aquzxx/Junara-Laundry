package com.example.projekmoprolaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Karpet extends AppCompatActivity {
    private View viewlistback, viewkarpet1tambah, viewkarpet1kurang,viewkarpet2tambah, viewkarpet2kurang, viewkarpet3tambah, viewkarpet3kurang, viewkarpet4tambah, viewkarpet4kurang;
    private TextView textkarpet1jumlah, textkarpet2jumlah, textkarpet3jumlah, textkarpet4jumlah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karpet);
        viewlistback = findViewById(R.id.listback);

        viewlistback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Karpet.this, MainActivity.class));
            }
        });

        //            karpet1
        viewkarpet1kurang = findViewById(R.id.karpet1kurang);
        textkarpet1jumlah = findViewById(R.id.karpet1jumlah);
        viewkarpet1kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet1jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textkarpet1jumlah.setText(String.valueOf(value));
            }
        });

        viewkarpet1tambah= findViewById(R.id.karpet1tambah);
        viewkarpet1tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet1jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textkarpet1jumlah.setText(String.valueOf(value));
            }
        });
//            endkarpet1
//            karpet2
        viewkarpet2kurang = findViewById(R.id.karpet2kurang);
        textkarpet2jumlah = findViewById(R.id.karpet2jumlah);
        viewkarpet2kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet2jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textkarpet2jumlah.setText(String.valueOf(value));
            }
        });

        viewkarpet2tambah= findViewById(R.id.karpet2tambah);
        viewkarpet2tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet2jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textkarpet2jumlah.setText(String.valueOf(value));
            }
        });
//          endkarpet2
//        karpet3
        viewkarpet3kurang = findViewById(R.id.karpet3kurang);
        textkarpet3jumlah = findViewById(R.id.karpet3jumlah);
        viewkarpet3kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet3jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textkarpet3jumlah.setText(String.valueOf(value));
            }
        });

        viewkarpet3tambah= findViewById(R.id.karpet3tambah);
        viewkarpet3tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet3jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textkarpet3jumlah.setText(String.valueOf(value));
            }
        });
//            end karpet3
//            karpet4
        viewkarpet4kurang = findViewById(R.id.karpet4kurang);
        textkarpet4jumlah = findViewById(R.id.karpet4jumlah);
        viewkarpet4kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet4jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textkarpet4jumlah.setText(String.valueOf(value));
            }
        });

        viewkarpet4tambah= findViewById(R.id.karpet4tambah);
        viewkarpet4tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textkarpet4jumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textkarpet4jumlah.setText(String.valueOf(value));
            }
        });
//        endkarpet4
    }
}