package com.ejercicio2;

import java.util.List;

public class Equipo implements IDeporte{
    private String Nombre;
    private List<Deportista> jugadores;
    
    public Equipo(List<Deportista> jugadores, String nombre) {
        this.jugadores = jugadores;
        this.Nombre = nombre;
    }

    public String toString(){
        return "Equipo: "+this.Nombre+" Jugadores: "+this.jugadores.toString();
    }

    public List<Deportista> getDeportistas(){
        return jugadores;
    }
    public Equipo(Object jugadores2, String nombre2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean conformar(List<Deportista> integrantes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conformar'");
    }


    @Override
    public void numerarDeportista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numerarDeportista'");
    }

    @Override
    public Object get(int index) {
        return jugadores.get(index);
    }

    @Override
    public void mostrar(){
        for (Deportista d: this.jugadores){
            System.out.println(d.toString());
        }
    }

    

}
