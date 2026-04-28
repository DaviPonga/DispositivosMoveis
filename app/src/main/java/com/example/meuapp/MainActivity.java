package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    Button Calcular;

    EditText Peso,Altura;

    TextView Result,classi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imgView);
        Calcular = findViewById(R.id.Calcular);
        Altura = findViewById(R.id.Altura);
        Peso = findViewById(R.id.Peso);
        Result = findViewById(R.id.Result);
        classi = findViewById(R.id.Classi);

        Calcular.setOnClickListener(v -> {
            String pesoStr = Peso.getText().toString();
            String alturaStr = Altura.getText().toString();

            if (pesoStr.isEmpty() || alturaStr.isEmpty()) {
                return;
            }

            float valorPeso = Float.parseFloat(pesoStr);
            float valorAltura = Float.parseFloat(alturaStr);

            float imc = valorPeso / (valorAltura * valorAltura);

            String classificacao;

            if (imc < 18.5) {
                classificacao = "Abaixo do peso";
            } else if (imc <= 24.9) {
                classificacao = "Peso normal";
            } else if (imc <= 29.9) {
                classificacao = "Sobrepeso";
            } else if (imc <= 34.9) {
                classificacao = "Obesidade Grau 1";
            } else if (imc <= 39.9) {
                classificacao = "Obesidade Grau 2";
            } else {
                classificacao = "Obesidade Grau 3";
            }

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);

            intent.putExtra("imc", imc);
            intent.putExtra("peso", valorPeso);
            intent.putExtra("altura", valorAltura);
            intent.putExtra("classificacao", classificacao);

            startActivity(intent);
        });
    }
}