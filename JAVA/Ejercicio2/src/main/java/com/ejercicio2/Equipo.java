package com.ejercicio2;

import java.util.List;

public class Equipo implements IDeporte{
    private String Nombre;
    private List<Deportista> jugadores;
    
    public Equipo(List<Deportista> jugadores, String nombre) {
        this.jugadores = jugadores;
        this.Nombre = nombre;
    }

    

}
