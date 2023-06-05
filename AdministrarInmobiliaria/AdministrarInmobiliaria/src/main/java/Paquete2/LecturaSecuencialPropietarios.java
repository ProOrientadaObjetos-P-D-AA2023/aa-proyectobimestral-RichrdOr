/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class LecturaSecuencialPropietarios {
    private ObjectInputStream entrada;
    private ArrayList<Propietario> propietario;
    private String nombreArchivo;
   

    public LecturaSecuencialPropietarios(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try 
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } 
            catch (IOException ioException) {
                System.out.println("Error al abrir el archivo...." + ioException);
            } 
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerPropietario() {
        
        propietario = new ArrayList<>();
        File fl = new File(obtenerNombreArchivo());
        if (fl.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();
                    propietario.add(registro);
                } catch (EOFException endOfFileException) {
                    return; 

                } catch (IOException ex) {
                    System.out.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.out.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.out.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    
   
    public ArrayList<Propietario> obtenerPropietario() {
        return propietario;
    }
    
    

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de  los Propietarios\n";
        for (int i = 0; i < obtenerPropietario().size(); i++) {
            Propietario prop = obtenerPropietario().get(i);
            cadena = String.format("%s%s-%s-%s\n", cadena,
                    prop.getNombres(),
                    prop.getApellidos(),
                    prop.getIdentificacion());
        }

        return cadena;
    }

    
    public void cerrarArchivo() {
        try 
        {
            if (entrada != null) {
                entrada.close();
            }
            
        } 
        catch (IOException ioException) {
            System.out.println("Error al intentar cerrar el archivo.....");
            System.exit(1);
        } 
    } 
}
