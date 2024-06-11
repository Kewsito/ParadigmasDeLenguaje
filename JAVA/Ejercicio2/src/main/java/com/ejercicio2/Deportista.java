package com.ejercicio2;
public class Deportista {
    private String nombre;
    private String dni;
    private Integer numeroJugador;

    public Deportista(String nombre, String dni) throws exceptionDeportista{
        try {
            if(this.recorrer(dni)){
                throw new exceptionDeportista(" Dni vacio");
            }
            else{
                this.dni = dni;}
            if(this.recorrer(nombre)){
                    throw new exceptionDeportista(" Nombre vacio");
            }
            else{
                this.nombre = nombre;}
            
            this.numeroJugador=null;
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }
    }
    public boolean recorrer(String valor){
        if(valor== null ||valor.equals("")|| valor.isBlank()||valor.equals("null")||valor.equals("''")){
            return true;
        }
        else{
            return false;
        }
    }
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Integer getNumeroJugador() {
        return numeroJugador;
    }
    public void SetNumerarJugador(int num){
        this.numeroJugador = num;
    }
    public String toString(){
        return "Nombre: "+this.nombre+" DNI: "+this.dni+ " Numero de Jugador: "+this.numeroJugador;
    }
}