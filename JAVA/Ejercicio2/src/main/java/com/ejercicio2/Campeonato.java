package com.ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    public static final String SEPARADOR = ",";

    public static List<Deportista> leerArchivo(String nombreArchivo) throws IOException, exceptionDeportista {
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = bufferLectura.readLine()) != null) {
                // Sepapar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR);
                Deportista d = new Deportista(campos[0], campos[1]);
                datos.add(d);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                bufferLectura.close();
            }
        }
        return datos;
    }

    /**
     * Crea los equipos con los datos pasados como parámetro
     * 
     * @param datos             lista con todos los deportistas inscriptos
     * @param cantidadJugadores cantidad de jugadores que conforman un equipo
     * @return una lista de equipos
     */

    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores)
            throws exceptionDeportista {
        List<IDeporte> equipos = new ArrayList<>();
        int index = 1;
        List<Deportista> EquipoAConformar = new ArrayList<>();
        try {
            Equipo e = new Equipo(EquipoAConformar);
            for (Deportista d : datos) {
                if (EquipoAConformar.size() < cantidadJugadores) {
                    if (!EquipoAConformar.contains(d)) {
                        EquipoAConformar.add(d);
                    }
                }
                if (e.conformar(EquipoAConformar)) {
                    equipos.add(e);
                    index++;
                    EquipoAConformar = new ArrayList<>();
                    // System.out.println("El equipo "+ index + " se conformo correctamente");
                }
            }
            if (!e.conformar(EquipoAConformar)) {
                throw new exceptionDeportista("El equipo " + index
                        + " no tiene la cantidad de deportistas suficientes para conformar un equipo");
            }
        } catch (exceptionDeportista e) {
            System.err.println("Error " + e.getMessage());
        }

        return equipos;
    }

    /**
     * Crea los equipos con los datos pasados como parámetro
     * 
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
     */
    public static List<IDeporte> creaParejas(List<Deportista> datos) throws exceptionDeportista {
        List<IDeporte> parejas = new ArrayList<>();
        List<Deportista> ParejaAConformar = new ArrayList<>();
        int index = 1;
        try {
            Pareja p = new Pareja();
            for (Deportista d : datos) {
                if (!ParejaAConformar.contains(d) && ParejaAConformar.size() < 2) {
                    ParejaAConformar.add(d);
                }
                if (p.conformar(ParejaAConformar)) {
                    index++;
                    parejas.add(p);
                    ParejaAConformar = new ArrayList<>();
                }
            }
            if (!p.conformar(ParejaAConformar)) {
                throw new exceptionDeportista(" La pareja " + index
                        + " no tiene la cantidad de deportistas suficientes para conformar una pareja");
            }
        } catch (Exception p) {
            System.err.println("Error " + p.getMessage());
        }
        return parejas;
    }

    /**
     * Numera cada integrante del equipo o de la pareja
     * 
     * @param datos
     */
    
    public static void numerar(List<IDeporte> datos) {
        int c = 1;
        for (IDeporte d : datos) {
            if (d instanceof Pareja) {

                System.out.println("Numero de Pareja: " + c);
                System.out.println("Jugadores");
                d.numerarDeportista();
                c++;
            } else {
                d.numerarDeportista();
            }
        }
    }

    /**
     * Muestra los datos de cada equipo o de cada pareja
     * 
     * @param datos
     */

    public static void mostrar(List<IDeporte> datos) {
        int c = 1;
        for (IDeporte d : datos) {
            System.err.println("Equipo numero: " + c);
            d.mostrar();
            c++;
        }
    }
}