package com.iapps.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sayhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhi);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("nama");

        String teks = "Beres! Sekarang " + nama + " udah bisa ngecek penggunaan HP "+nama+" tiap hari buat bantu " + nama + " ngatur waktu :)";

        TextView textView = findViewById(R.id.teks);
        textView.setText(teks);
    }
}