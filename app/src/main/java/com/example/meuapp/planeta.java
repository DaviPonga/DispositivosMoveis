package com.example.meuapp;

import android.graphics.Bitmap;

import java.io.File;

public class planeta {
    String nome;
    int img;

    public planeta(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }
}
//exemplo de como criar um objeto desta classe
//planeta p = new planeta();
//p.nome="Planeta"
//p.img=R.drawable.earth