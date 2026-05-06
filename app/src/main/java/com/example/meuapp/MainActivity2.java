package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        voltar = findViewById(R.id.Voltar);
        TextView tv = findViewById(R.id.textView);

        String nome = getIntent().getStringExtra("nome");

        if (nome != null) {
            tv.setText(nome);
        }

        voltar.setOnClickListener(v -> finish());
    }
}