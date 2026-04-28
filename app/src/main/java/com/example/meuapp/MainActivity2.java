package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView ResultIMC, ResultPeso, ResultAltura, resultNome;
    ImageView img;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ResultIMC = findViewById(R.id.ResultIMC);
        ResultPeso = findViewById(R.id.ResultPeso);
        ResultAltura = findViewById(R.id.ResultAltura);
        resultNome= findViewById(R.id.resultNome);
        img = findViewById(R.id.ImgObsesidade);
        voltar = findViewById(R.id.Voltar);

        float imc = getIntent().getFloatExtra("imc", 0);
        float peso = getIntent().getFloatExtra("peso", 0);
        float altura = getIntent().getFloatExtra("altura", 0);
        String classificacao = getIntent().getStringExtra("classificacao");

        ResultIMC.setText(String.format("IMC: %.2f", imc));
        ResultPeso.setText("Peso: " + peso + " kg");
        ResultAltura.setText("Altura: " + altura + " m");
        resultNome.setText(classificacao);

        if (imc < 18.5) {
            img.setImageResource(R.drawable.abaixopeso);
        } else if (imc <= 24.9) {
            img.setImageResource(R.drawable.normal);
        } else if (imc <= 29.9) {
            img.setImageResource(R.drawable.sobrepeso);
        } else if (imc <= 34.9) {
            img.setImageResource(R.drawable.obesidade1);
        } else if (imc <= 39.9) {
            img.setImageResource(R.drawable.obesidade2);
        } else {
            img.setImageResource(R.drawable.obesidade3);
        }
        voltar.setOnClickListener(v -> finish());
    }
}