package com.paradigmas.ejercicio1;
import java.util.ArrayList; 

// *importo la clase viajero frecuente 
import com.paradigmas.ejercicio1.ViajeroFrecuente;
public class claseGestor {
    private Integer cantidad;
    private ArrayList <ViajeroFrecuente> viajeros;

    public claseGestor(Integer cantidad){
        this.cantidad=cantidad;
        this.viajeros= new ArrayList<ViajeroFrecuente>();
    }

    public void agregarViajero(ViajeroFrecuente viajero){
        if (viajeros.size()<cantidad){
            viajeros.add(viajero);
        }else{
            System.out.println("No se pueden agregar mas viajeros");
        }       
    }

    public void mostrarViajero(Integer numeroviajero){
        for(ViajeroFrecuente viajeros : viajeros){
            if (viajeros.getNumero() == numeroviajero){
                System.out.println(viajeros);
            }else{
                System.out.println("Viajero no encontrado");
            }
        }
    }

    public int consultarMillas(Integer dni){
        for(ViajeroFrecuente viajeros : viajeros){
            if (viajeros.getDni() == dni){
                return viajeros.getMillas();
            }
        }
        return 0; // or any other default value
    }
    public void acumularMillas(int dni, int cantmillas){
        for (ViajeroFrecuente viajeros : viajeros){
            if (viajeros.getDni()==dni){
                viajeros.acumularMillas(cantmillas);
            }else{
                System.out.println("No se encuentra registrado el dni");
            }
        }
    }

    public void canjearMillas(int dni, int cantmillas){
        for (ViajeroFrecuente viajeros : viajeros){
            if (viajeros.getDni()==dni){
                viajeros.canjearMillas(cantmillas);
            }else{
                System.out.println("No se encuentra registrado el dni");
            }
        }
    }

    public void mejorViajero(){
        int cant = 0;
        ViajeroFrecuente mejorviajero = null;
        for (int index = 0; index < viajeros.size(); index++){
            ViajeroFrecuente viajero = viajeros.get(index);
            if (cant < viajero.getMillas()) {
                cant = viajero.getMillas();
                mejorviajero = viajero;
            }
        }
        System.out.println(mejorviajero);
    }
}
