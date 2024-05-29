/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.paradigmas.ejercicio1;

import com.paradigmas.ejercicio1.claseGestor;
import com.paradigmas.ejercicio1.ViajeroFrecuente;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        claseGestor gestor = new claseGestor(10);
        Scanner op = new Scanner(System.in);

        int opc = -1;
        while (opc != 0) {
            System.out.println("1. Agregar viajero");
            System.out.println("2. Mostrar viajero");
            System.out.println("3. Consultar millas");
            System.out.println("4. Acumular Millas");
            System.out.println("5. Canjear Millas");
            System.out.println("6. Mejor viajero");
            System.out.println("0. Salir");

            if (op.hasNextInt()) {
                opc = op.nextInt();
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                op.next(); // Consume el input no válido
                continue;
            }

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el numero de viajero");
                    int numero = op.nextInt();
                    System.out.println("Ingrese el DNI");
                    int dni = op.nextInt();
                    System.out.println("Ingrese las millas");
                    int millas = op.nextInt();
                    op.nextLine(); // Consume el newline que queda
                    System.out.println("Ingrese el nombre");
                    String nombre = op.nextLine();
                    System.out.println("Ingrese el apellido");
                    String apellido = op.nextLine();
                    ViajeroFrecuente viajero = new ViajeroFrecuente(numero, dni, nombre, apellido, millas);
                    gestor.agregarViajero(viajero);
                    break;
                case 2:
                    System.out.println("Ingrese el numero de viajero");
                    numero = op.nextInt();
                    gestor.mostrarViajero(numero);
                    break;
                case 3:
                    System.out.println("Ingrese el dni del viajero");
                    dni = op.nextInt();
                    int mil = gestor.consultarMillas(dni);
                    if (mil != -1) {
                        System.out.println(mil);
                    }else{
                        System.out.println("No se encontro el viajero");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el dni del viajero");
                    dni = op.nextInt();
                    System.out.println("Ingrese las millas del viajero");
                    millas = op.nextInt();
                    int milasacum = gestor.acumularMillas(dni, millas);
                    System.out.println("Millas acumuladas:"+milasacum);
                    break;
                case 5:
                    // Código para canjear millas
                    break;
                case 6:
                    // Código para mostrar el mejor viajero
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        op.close();
    }
}
