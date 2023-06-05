/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete6;
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
public class LecturaSecuencialCasas {
    private ObjectInputStream entrada;
    private ArrayList<Casa> casa;
    private String nombreArchivo;

    public LecturaSecuencialCasas(String nmArch) {
        nombreArchivo = nmArch;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try  
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(nmArch));
            }  
            catch (IOException ioException) {
                System.out.println("Error al abrir el archivo...." + ioException);
            } 
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerCasa() {
        // 
        casa = new ArrayList<>();
        File fl = new File(obtenerNombreArchivo());
        if (fl.exists()) {

            while (true) {
                try {
                    Casa registro = (Casa) entrada.readObject();
                    casa.add(registro);
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
    
    public ArrayList<Casa> obtenerCasa() {
        return casa;
    }
    
    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Datos de la Casa\n";
        for (int i = 0; i < obtenerCasa().size(); i++) {
            Casa p = obtenerCasa().get(i);
            cadena = String.format("%s\nInformacion de propietario\n"
                    + "Nombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificacion: %s\n"
                    + "Informacion Barrio\n"
                    + "Nombre del Barrio: %s\n"
                    + "Referencia: %s\n"
                    + "Informacion Ciudad\n"
                    + "Nombre Ciudad: %s\n"
                    + "Nombre Provincia: %s\n"
                    + "Informacion Constructora\n"
                    + "Nombre Constructora: %s\n"
                    + "Id constructora: %s\n"
                    + "Informacion Costo\n"
                    + "Costo Total: %.2f\n", cadena,
                    p.obtenerPropietarios().getNombres(),
                    p.obtenerPropietarios().getApellidos(),
                    p.obtenerPropietarios().getIdentificacion(),
                    p.obtenerBarrio().obtenerNomBarrio(),
                    p.obtenerBarrio().obtenerRef(),
                    p.obtenerCiudad().obtenerNomCiud(),
                    p.obtenerCiudad().obtenerNomProv(),
                    p.obtenerConstructor().getNomCons(),
                    p.obtenerConstructor().getIdCons(),
                    p.obtenerCalculoCasa().getCostoF());
                    
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
            System.out.println("Error al cerrar el archivo.");
            System.exit(1);
        } 
    } 
}

