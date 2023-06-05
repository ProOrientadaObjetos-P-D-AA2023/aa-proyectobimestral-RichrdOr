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
public class LecturaSecuencialDepartamento {
    private ObjectInputStream entrada;
    private ArrayList<Departamento> depart;
    private String nombreArchivo;

    public LecturaSecuencialDepartamento(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
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

    public void establecerDepartamento() {

        depart = new ArrayList<>();
        File fl = new File(obtenerNombreArchivo());
        if (fl.exists()) {

            while (true) {
                try {
                    Departamento registro = (Departamento) entrada.readObject();
                    depart.add(registro);
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

    public ArrayList<Departamento> obtenerDepartamento() {
        return depart;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Datos del Departamento\n";
        for (int i = 0; i < obtenerDepartamento().size(); i++) {
            Departamento p = obtenerDepartamento().get(i);
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
                    + "Nombre del edificio: %s\n"
                    + "Direccion: %s\n"
                    + "Costo Total: %.2f\n", cadena,
                    p.obtenerPropietario().getNombres(),
                    p.obtenerPropietario().getApellidos(),
                    p.obtenerPropietario().getIdentificacion(),
                    p.obtenerBarrio().obtenerNomBarrio(),
                    p.obtenerBarrio().obtenerRef(),
                    p.obtenerCiudad().obtenerNomCiud(),
                    p.obtenerCiudad().obtenerNomProv(),
                    p.obtenerConstructora().getNomCons(),
                    p.obtenerConstructora().getIdCons(),
                    p.obtenerCalculoDepartamento().obtenerEdificio(),
                    p.obtenerCalculoDepartamento().obtenerUbicacion(),
                    p.obtenerCalculoDepartamento().obtenerCostoFinal());

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
