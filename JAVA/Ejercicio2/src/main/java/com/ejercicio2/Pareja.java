package com.ejercicio2;

import java.util.List;

public class Pareja implements IDeporte{
    private Deportista deportista1;
    private Deportista deportista2;

    public Pareja() {
        this.deportista1 = null;
        this.deportista2= null; 
    }
    
    public String toString(){
        return "Pareja: "+this.deportista1.getNombre()+" y "+this.deportista2.getNombre();
    }
    @Override
    public boolean conformar(List<Deportista> integrantes) {
        if (integrantes== null || integrantes.size()<CANTIDAD_MINIMA )
            {
                this.deportista1= integrantes.get(0);
                this.deportista2= integrantes.get(1);
                return true;
            }
        return false;
    }


    @Override
    public void numerarDeportista() {
        deportista1.SetNumerarJugador(1);
        deportista2.SetNumerarJugador(2);
    }

    @Override
    public void mostrar(){
        System.out.println("Deportista One: " + this.deportista1);
        System.out.println("Deportista two: " + this.deportista2);
    }

    @Override
    public Object get(int index) {
        if(index==0){
            return deportista1;
        }
        else{
            return deportista2;
        }
    }

}
