package com.ejercicio2;

import java.util.List;

public class Equipo implements IDeporte {

    private String Nombre;
    private List<Deportista> jugadores;

    public Equipo(List<Deportista> jugadores){
        this.jugadores = jugadores;
        this.Nombre = null;
    }

    public String toString() {
        return "Equipo: " + this.Nombre + " Jugadores: " + this.jugadores.toString();
    }

    public List<Deportista> getDeportistas() {
        return jugadores;
    }

    public String getNombreEquipo() {
        return this.Nombre;
    }

    public void SetNombreEquipo(String nom) {
        this.Nombre = nom;
    }

    @Override
    public boolean conformar(List<Deportista> integrantes) {

        if (integrantes.size() !=5) {
            return false;
            } 
            else {
            this.jugadores = integrantes;
            return true;
        }
    }

    public void jugadorNumero() {
        int c = 1;
        for (Deportista d : this.jugadores) {
            d.SetNumerarJugador(c);
            c++;
        }
    }

    @Override
    public void numerarDeportista() {
        System.out.println(this.Nombre);
        int c = 1;
        for (Deportista d : this.jugadores) {
            d.SetNumerarJugador(c);
            System.err.println(d);
            c++;
        }
    }

    @Override
    public void mostrar() {
        for (Deportista d : this.jugadores) {
            System.out.println(d);
        }
    }

}