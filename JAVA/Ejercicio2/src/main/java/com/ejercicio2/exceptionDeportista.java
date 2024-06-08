package com.ejercicio2;
public class exceptionDeportista extends Exception {
    public exceptionDeportista(){
        super();
    }
    public exceptionDeportista(String mensaje){
        super(mensaje);
    }
    public exceptionDeportista(String mensaje, Throwable causa){
        super(mensaje,causa);
    }
    public exceptionDeportista(Throwable causa){
        super(causa);
    }
}
