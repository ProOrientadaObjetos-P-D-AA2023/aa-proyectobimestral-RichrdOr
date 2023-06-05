/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete3;
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
public class LecturaSecuencialBarrio {
    private ObjectInputStream entrada;
    private ArrayList<Barrio> barrio;
    private String nombreArchivo;

    public LecturaSecuencialBarrio(String n) {
        nombreArchivo = n;
        File fl = new File(nombreArchivo);
        if (fl.exists()) {
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

    public void establecerBarrio() {
        // 
        barrio = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Barrio registro = (Barrio) entrada.readObject();
                    barrio.add(registro);
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
    
    

    public ArrayList<Barrio> obtenerBarrio() {
        return barrio;
    }
    
   

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Barrios\n";
        for (int i = 0; i < obtenerBarrio().size(); i++) {
            Barrio p = obtenerBarrio().get(i);
            cadena = String.format("%s%s-%s\n", cadena,
                    p.obtenerNomBarrio(),
                    p.obtenerRef());
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
            System.out.println("Error al cerrar el archivo.....");
            System.exit(1);
        } 
    } 
}
