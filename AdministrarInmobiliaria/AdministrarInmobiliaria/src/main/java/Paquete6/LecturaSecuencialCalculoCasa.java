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
public class LecturaSecuencialCalculoCasa {
    private ObjectInputStream entrada;
    private ArrayList<CalculoCasa> calcCasa;
    private String nombreArch;

    public LecturaSecuencialCalculoCasa(String n) {
        nombreArch = n;
        File f = new File(nombreArch);
        if (f.exists()) {
            try 
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } catch (IOException ioException) {
                System.out.println("Error al abrir el archivo...." + ioException);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArch = n;
    }

    public void establecerConstructora() {

        calcCasa = new ArrayList<>();
        File fl = new File(obtenerNombreArchivo());
        if (fl.exists()) {

            while (true) {
                try {
                    CalculoCasa registro = (CalculoCasa) entrada.readObject();
                    calcCasa.add(registro);
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

    public ArrayList<CalculoCasa> obtenerPropietario() {
        return calcCasa;
    }

    public String obtenerNombreArchivo() {
        return nombreArch;
    }

    @Override
    public String toString() {
        String cadena = "Valor y Datos de la Casa\n";
        for (int i = 0; i < obtenerPropietario().size(); i++) {
            CalculoCasa p = obtenerPropietario().get(i);
            cadena = String.format("%s%d-%.2f-%.2f-%.2f\n", cadena,
                    p.getNumcuartos(),
                    p.getPmetroc(),
                    p.getNummetrosc(),
                    p.getCostoF());
        }

        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }

        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
