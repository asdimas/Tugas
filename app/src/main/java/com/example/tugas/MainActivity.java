package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SEGITIGA(View view) {
        Intent intent = new Intent(MainActivity.this, segitiga.class);
        startActivity(intent);
    }

    public void LINGKARAN(View view) {
        Intent intent = new Intent(MainActivity.this, lingkaran.class);
        startActivity(intent);
    }

    public void PERSEGI(View view) {
        Intent intent = new Intent(MainActivity.this, persegi.class);
        startActivity(intent);
    }
}
