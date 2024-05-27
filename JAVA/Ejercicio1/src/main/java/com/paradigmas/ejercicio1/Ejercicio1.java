/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.paradigmas.ejercicio1;
import com.paradigmas.ejercicio1.claseGestor;

import java.util.Scanner;

import com.paradigmas.ejercicio1.ViajeroFrecuente;
/**
 *
 * @author Kewsito
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        claseGestor gestor = new claseGestor(10);
        
        int opc = -1;
        while (opc!=0) {
            System.out.println("1. Agregar viajero");
            System.out.println("2. Mostrar viajero");
            System.out.println("3. Consultar millas");
            System.out.println("4. Acumular Millas");
            System.out.println("5. Canjear Millas");
            System.out.println("6. Mejor viajero");
            System.out.println("0. Salir");
            
            Scanner op = new Scanner(System.in);
            opc = op.nextInt();
            op.close();
        }
    }
}
