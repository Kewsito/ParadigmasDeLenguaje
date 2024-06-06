package com.ejercicio2;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int cantidadFutbol=5;
        List<Deportista> Futbol= Campeonato.leerArchivo("C:\\Users\\Kewsito\\Desktop\\GITHUB\\ParadigmasDeLenguaje\\JAVA\\Ejercicio2\\src\\datos\\inscriptosFutbol.csv");
        List<Deportista> PinPon= Campeonato.leerArchivo("C:\\Users\\Kewsito\\Desktop\\GITHUB\\ParadigmasDeLenguaje\\JAVA\\Ejercicio2\\src\\datos\\inscriptosPinPon.csv");
        
        List<IDeporte> ListaEquiposFutbol = Campeonato.creaEquipos(Futbol, cantidadFutbol);
        List<IDeporte> ListaEquiposPinPon = Campeonato.creaParejas(PinPon);
        Campeonato.mostrar(ListaEquiposFutbol);
        System.out.println("1. Mostrar Equipos de futbol");
        System.out.println("2. Mostrar Equipos de pin pon");
        System.out.println("3. Numerar Equipo de futbol");
        System.out.println("4. Numerar Equipo de pin pon");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opción: ");
        Scanner scanner = new Scanner(System.in);
        int opc = scanner.nextInt();
        do {
            // Menu de opciones
            System.out.println("1. Mostrar Equipos de futbol");
            System.out.println("2. Mostrar Equipos de pin pon");
            System.out.println("3. Numerar Equipo de futbol");
            System.out.println("4. Numerar Equipo de pin pon");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opción: ");
            
            // Leer la opción ingresada por el usuario
            
            switch (opc) {
                case 1:
                    System.out.println("Equipos de futbol:");
                    System.out.println("------------------------");
                    Campeonato.mostrar(ListaEquiposFutbol);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Equipos de pin pon");
                    System.out.println("------------------------");
                    Campeonato.mostrar(ListaEquiposPinPon);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Numeracion Equipos de futbol");
                    Campeonato.numerar(ListaEquiposFutbol);
                    break;
                case 4:
                    System.out.println("Numeracion Equipos de pin pon");
                    Campeonato.numerar(ListaEquiposPinPon);
                    break;
                case 5:
                    System.exit(0);
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }


        } while (opc != 4);
            
    }
    }
