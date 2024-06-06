package com.ejercicio2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
public class Campeonato {
    public static final String SEPARADOR = ",";	
    public static List <Deportista> leerArchivo(String nombreArchivo)throws IOException{
        BufferedReader bufferLectura = null;
        List<Deportista> datos = new ArrayList<>();
        try {
            bufferLectura = new BufferedReader(new FileReader(nombreArchivo));
            String linea;                  

            while ((linea=bufferLectura.readLine()) != null) {
             // Sepapar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR); 
                Deportista d = new Deportista(campos[0],campos[1]);
                datos.add(d);           
            }
        } 
        catch (IOException e) {
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
    * @param datos lista con todos los deportistas inscriptos
     * @param cantidadJugadores cantidad de jugadores que conforman un equipo
     * @return una lista de equipos
    */
    public static List<IDeporte> creaEquipos(List<Deportista> datos, int cantidadJugadores) {
        List<IDeporte> equipos = new ArrayList<>();
        int index = 1;
        List <Deportista> EquipoAConformar= new ArrayList<>();
        for (Deportista d : datos) {
            if (EquipoAConformar.size() < cantidadJugadores){
                if (!EquipoAConformar.contains(d)){
                    EquipoAConformar.add(d);    
                }
            }else{
                Equipo e = new Equipo(EquipoAConformar, "Equipo "+index);
                equipos.add(e);
                index++;
                EquipoAConformar = new ArrayList<>();
            }
        }
        System.out.println("PRINT DEL CREAR EQUIPO"+equipos.size());
        //for (int i = 0; i < equipos.size(); i++) {
          //  System.out.println(equipos.get(i));
            //i++;
        //}

        for (IDeporte equipo : equipos) {
            System.out.println(equipo);
        }
        return equipos;
    }

    /**
    Crea los equipos con los datos pasados como parámetro
     * @param datos es una lista con todos los deportitas inscriptos
     * @return una lista de Parejas formadas
    */
    public static List<IDeporte> creaParejas(List<Deportista> datos){
        List<IDeporte> parejas = new ArrayList<>();
        List <Deportista> ParejaAConformar= new ArrayList<>();

        for (Deportista d: datos){
            if(!ParejaAConformar.contains(d) && ParejaAConformar.size()<2){
                ParejaAConformar.add(d);
            }
            else{
                Pareja p = new Pareja();
                p.conformar(ParejaAConformar);
                parejas.add(p);
                ParejaAConformar.clear();
                
            }
        }
        return parejas;
    }
    /**
    * Numera cada integrante del equipo o de la pareja
     * @param datos 
    */
    public static void numerar(List<IDeporte> datos){
        for (IDeporte equipoDeporte : datos) {
        if (equipoDeporte instanceof Equipo) {
            Equipo equipo = (Equipo) equipoDeporte;
            List<Deportista> deportistas = equipo.getDeportistas();
            int jugadorIndex = 1;

            for (Deportista deportista : deportistas) {
                deportista.SetNumerarJugador(jugadorIndex);
                System.out.println("Jugador " + jugadorIndex + ": " + deportista.getNombre());
                jugadorIndex++;
                }
            }
        }
    }
    public static void NumerarDeportista(List<IDeporte> datos ){
        int c=0;
        for(IDeporte d: datos){
            System.out.println("Numero de Jugador: "+ c);
            d.numerarDeportista();
            c++;
        }
    }
    /**
    * Muestra los datos de cada equipo o de cada pareja
     * @param datos
    */

    public static void  mostrar(List<IDeporte> datos){
        for (IDeporte d: datos){
            d.mostrar();
        }
    }
    
//Parte del codigo para el metodo main() que debera estar definido en la clase principal.    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int cantidadJugadoresFutbol= 5;                  
    
        List<Deportista> datosFutbol= leerArchivo("./src/datos/inscriptosFutbol.csv");
        List<Deportista> datosPinPon= leerArchivo("./src/datos/inscriptosPinPon.csv");
    }        
}