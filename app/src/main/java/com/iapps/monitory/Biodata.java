package com.iapps.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText nama = findViewById(R.id.nama);
        Button button = findViewById(R.id.btnSelanjutnya);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Biodata.this, sayhi.class);
                intent.putExtra("nama", nama.getText().toString());
                startActivity(intent);
            }
        });
    }
}