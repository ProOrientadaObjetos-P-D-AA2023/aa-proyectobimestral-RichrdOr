/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete4;
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
public class LecturaSecuencialCiudad {
    private ObjectInputStream entrada;
    private ArrayList<Ciudad> ciud;
    private String nombreArchivo;

    public LecturaSecuencialCiudad(String n) {
        nombreArchivo = n;
        File fl = new File(nombreArchivo);
        if (fl.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo." + ioException);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerCiudad() {
        // 
        ciud = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();
                    ciud.add(registro);
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

    public ArrayList<Ciudad> obtenerCiudad() {
        return ciud;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override

    public String toString() {
        String cadena = "Lista de Ciudades y Provincias\n";
        for (int i = 0; i < obtenerCiudad().size(); i++) {
            Ciudad p = obtenerCiudad().get(i);
            cadena = String.format("%s%s-%s\n", cadena,
                    p.obtenerNomCiud(),
                    p.obtenerNomProv());

        }

        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }

        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo....");
            System.exit(1);
        }
    }
}
