package com.example.meuapp;

import java.util.ArrayList;

public class planetaDAO {
    ArrayList<planeta>listaPlanetas;
    public planetaDAO() {
        listaPlanetas=new ArrayList<>();
        listaPlanetas.add(new planeta("Mercurio",R.drawable.mercury));
        listaPlanetas.add(new planeta("Venus",R.drawable.venus));
        listaPlanetas.add(new planeta("Terra",R.drawable.earth));
        listaPlanetas.add(new planeta("Marte",R.drawable.mars));
        listaPlanetas.add(new planeta("Jupiter",R.drawable.jupter));
        listaPlanetas.add(new planeta("Saturno",R.drawable.saturn));
        listaPlanetas.add(new planeta("Urano",R.drawable.uranus));
        listaPlanetas.add(new planeta("Netuno",R.drawable.neptune));
    }

    public ArrayList <planeta>listaPlanetas(){
    return listaPlanetas;
    }
}
