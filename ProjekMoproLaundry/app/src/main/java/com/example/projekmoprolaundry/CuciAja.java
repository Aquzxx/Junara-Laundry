package com.example.projekmoprolaundry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CuciAja extends AppCompatActivity {
    private View viewlistback, viewtshirtkurang, viewtshirttambah, viewshirtkurang, viewshirttambah, viewsleevelesskurang, viewsleevelesstambah, viewskirttambah, viewskirtkurang, viewpolotambah, viewpolokurang, viewsuittambah, viewsuitkurang, viewjeanstambah, viewjeanskurang;
    private TextView texttshirtjumlah, textshirtjumlah, textsleevelessjumlah, textskirtjumlah ,textpolojumlah, textsuitjumlah,textjeansjumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuci_aja);

        viewlistback = findViewById(R.id.listback);
        viewlistback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CuciAja.this, MainActivity.class));
            }
        });
//            tshirt
        viewtshirtkurang = findViewById(R.id.tshirtkurang);
        texttshirtjumlah = findViewById(R.id.tshirtjumlah);
        viewtshirtkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = texttshirtjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                texttshirtjumlah.setText(String.valueOf(value));
            }
        });

        viewtshirttambah= findViewById(R.id.tshirttambah);
        viewtshirttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = texttshirtjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                texttshirtjumlah.setText(String.valueOf(value));
            }
        });
//            endtshirt
//            shirt
        viewshirtkurang = findViewById(R.id.shirtkurang);
        textshirtjumlah = findViewById(R.id.shirtjumlah);
        viewshirtkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textshirtjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textshirtjumlah.setText(String.valueOf(value));
            }
        });

        viewshirttambah= findViewById(R.id.shirttambah);
        viewshirttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textshirtjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textshirtjumlah.setText(String.valueOf(value));
            }
        });
//          endshirt
//        sleeveless
        viewsleevelesskurang = findViewById(R.id.sleevelesskurang);
        textsleevelessjumlah = findViewById(R.id.sleevelessjumlah);
        viewsleevelesskurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textsleevelessjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textsleevelessjumlah.setText(String.valueOf(value));
            }
        });

        viewsleevelesstambah= findViewById(R.id.sleevelesstambah);
        viewsleevelesstambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textsleevelessjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textsleevelessjumlah.setText(String.valueOf(value));
            }
        });
//            end sleeveless
//            skirt
        viewskirtkurang = findViewById(R.id.skirtkurang);
        textskirtjumlah = findViewById(R.id.skirtjumlah);
        viewskirtkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textskirtjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textskirtjumlah.setText(String.valueOf(value));
            }
        });

        viewskirttambah= findViewById(R.id.skirttambah);
        viewskirttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textskirtjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textskirtjumlah.setText(String.valueOf(value));
            }
        });
//        endskirt
//        polo
        viewpolokurang = findViewById(R.id.polokurang);
        textpolojumlah = findViewById(R.id.polojumlah);
        viewpolokurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textpolojumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textpolojumlah.setText(String.valueOf(value));
            }
        });

        viewpolotambah= findViewById(R.id.polotambah);
        viewpolotambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textpolojumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textpolojumlah.setText(String.valueOf(value));
            }
        });

//        end polo
//        suit
        viewsuitkurang = findViewById(R.id.suitkurang);
        textsuitjumlah = findViewById(R.id.suitjumlah);
        viewsuitkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textsuitjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textsuitjumlah.setText(String.valueOf(value));
            }
        });

        viewsuittambah= findViewById(R.id.suittambah);
        viewsuittambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textsuitjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textsuitjumlah.setText(String.valueOf(value));
            }
        });
//        end suit
//        jeans
        viewjeanskurang = findViewById(R.id.jeanskurang);
        textjeansjumlah = findViewById(R.id.jeansjumlah);
        viewjeanskurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textjeansjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value--;
                textjeansjumlah.setText(String.valueOf(value));
            }
        });

        viewjeanstambah= findViewById(R.id.jeanstambah);
        viewjeanstambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = textjeansjumlah.getText().toString();
                int value = Integer.parseInt(currentValue);
                value++;
                textjeansjumlah.setText(String.valueOf(value));
            }
        });
//        end jeans
    }
}