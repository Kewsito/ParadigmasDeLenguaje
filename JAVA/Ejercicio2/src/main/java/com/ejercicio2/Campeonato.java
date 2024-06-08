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
                if (campos.equals(null)) {
                    throw new exceptionDeportista("Se ingresaron nombre y dni vacios");
                }
                Deportista d = new Deportista(campos[0], campos[1]);
                datos.add(d);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        finally {
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
    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores) throws exceptionDeportista {
        List<IDeporte> equipos = new ArrayList<>();
        int index = 1;
        List<Deportista> EquipoAConformar = new ArrayList<>();
        try {
            for (Deportista d : datos) {
                if (!EquipoAConformar.contains(d)) {
                    EquipoAConformar.add(d);
                } else {
                        Equipo e = new Equipo(EquipoAConformar, "Equipo " + index);
                        if(e.conformar(EquipoAConformar)){
                            equipos.add(e);
                            index++;
                            EquipoAConformar = new ArrayList<>();
                        }
                    }
                }
            }
            catch (exceptionDeportista e) {
                throw new exceptionDeportista( "es diferente a 5");
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
        try {
            for (Deportista d : datos) {
                if (!ParejaAConformar.contains(d)) {
                    ParejaAConformar.add(d);
                } else {
                    Pareja p = new Pareja();

                    if (p.conformar(ParejaAConformar)) {
                        parejas.add(p);
                        ParejaAConformar = new ArrayList<>();
                    } else {
                        throw new exceptionDeportista("Faltan integrantes");
                    }
                }
            }
        } catch (exceptionDeportista e) {
            System.out.println(e.getMessage());
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
        for (IDeporte d : datos)
            if (d instanceof Pareja) {
                System.err.println("Pareja numero: " + c);
                d.mostrar();
                c++;
            } else {
                d.mostrar();
            }
    }
}
