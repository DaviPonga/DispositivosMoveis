package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

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

            }

            float valorPeso = Float.parseFloat(pesoStr);
            float valorAltura = Float.parseFloat(alturaStr);

            float imc = valorPeso / (valorAltura * valorAltura);

            Result.setText(String.format("IMC: %.2f", imc));

            if (imc < 18.5) {
                classi.setText("Abaixo do peso");
                imageView.setImageResource(R.drawable.abaixopeso);
            } else if (imc >= 18.5 && imc <= 24.9) {
                classi.setText("Peso normal");
                imageView.setImageResource(R.drawable.normal);
            } else if (imc >= 25 && imc <= 29.9) {
                classi.setText("Sobrepeso");
                imageView.setImageResource(R.drawable.sobrepeso);
            } else if (imc >= 30 && imc <= 34.9) {
                classi.setText("Obesidade Grau 1");
                imageView.setImageResource(R.drawable.obesidade1);
            } else if (imc >= 35 && imc <= 39.9) {
                classi.setText("Obesidade Grau 2");
                imageView.setImageResource(R.drawable.obesidade2);
            } else {
                classi.setText("Obesidade Grau 3");
                imageView.setImageResource(R.drawable.obesidade3);
            }
        });
    }
}
