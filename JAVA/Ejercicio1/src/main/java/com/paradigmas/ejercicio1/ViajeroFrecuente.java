/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paradigmas.ejercicio1;

/**
 *
 * @author Kewsito
 */
public class ViajeroFrecuente {
    private Integer numero;
    private Integer dni;
    private String nombre;
    private String apellido;
    private Integer millas;

    public ViajeroFrecuente(Integer numero,Integer dni,String nombre, String apellido, Integer millas){
        this.numero= numero;
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.millas=millas;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    public Integer getDni(){
        return this.dni;
    }
    
    public void setDni(Integer dni){
        this.dni = dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getMillas(){
        return this.millas;
    }

    public void setMillas(int millas){
        this.millas=millas;
    }

    public void acumularMillas(int millas){
        this.millas+=millas;
    }

    public void canjearMillas(int millas){
        this.millas-=millas;
    }
    
    // * aca se sobre escribe el metodo tostring para que muestre los datos del objeto
    @Override 
    public String toString(){
        return "Numero: "+this.numero+" DNI: "+this.dni+" Nombre: "+this.nombre+" Apellido: "+this.apellido+" Millas: "+this.millas;
    }
}