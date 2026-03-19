package com.example.meuapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button b;

TextView tv;

EditText edmin, edmax;
    int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        b=findViewById(R.id.button);

        tv = findViewById(R.id.tv);
        edmin = findViewById(R.id.edMin);
        edmax=findViewById(R.id.edMax);

        b.setOnClickListener(v -> {
            //int min= Integer.parseInt (edmin.getText().toString());
            //int max = Integer.parseInt(edmax.getText().toString());
            String minStr=edmin.getText().toString();
            String maxStr=edmax.getText().toString();
            if(minStr.isEmpty()){
                edmin.setError("informe o valor Minimo");
                return;
            }
            if(maxStr.isEmpty()){
                edmin.setError("informe o valor Maximo");
                return;
            }


            int min=Integer.parseInt(minStr);
            int max=Integer.parseInt(maxStr);


            contador++;

            Random random=new Random();
            int r= random.nextInt(min,max);

            tv.setText(Integer.toString(r));
        });
    }
    }
