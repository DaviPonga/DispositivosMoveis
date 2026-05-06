package com.example.meuapp;
import java.util.ArrayList;
public class PlanetaController {
    planetaDAO planetaDAO;
    public PlanetaController(){
        planetaDAO=new planetaDAO();
    }
    public ArrayList<planeta> listaPlanetas(){
        return planetaDAO.listaPlanetas;
    }
}
