/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EscrituraSecuencialBarrio {
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Barrio barrio;
    private ArrayList<Barrio> listaBarrio;

    public EscrituraSecuencialBarrio(String nombreArc) {
        
        nombreArchivo = nombreArc;
        establecerLista(); 
        try 
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo....");
        } // 
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistro(Barrio p) {
        barrio = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(barrio); 
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo....");
        }
    }

    
    public void establecerLista() {
        LecturaSecuencialBarrio l = 
                new LecturaSecuencialBarrio(obtenerNombreArchivo());
        l.establecerBarrio();
        listaBarrio = l.obtenerBarrio();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Barrio> obtenerLista() {
        return listaBarrio;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try 
        {
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo.");
            
        } 
    } 
    
}
