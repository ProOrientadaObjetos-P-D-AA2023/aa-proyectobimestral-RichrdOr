/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete6;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class EscrituraSecuencialDepartamento {

    private String nombreArch;
    private ObjectOutputStream salida;
    private Departamento regist;
    private ArrayList<Departamento> listaDepart;

    public EscrituraSecuencialDepartamento(String nombreArc) {

        nombreArch = nombreArc;
        establecerLista();

        try {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArch));

            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } catch (IOException ioException) {
            System.out.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArch = n;
    }

    public void establecerRegistro(Departamento p) {
        regist = p;
    }

    public void establecerSalida() {

        try {
            salida.writeObject(regist);

        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo....");
        }
    }

    public void establecerLista() {
        LecturaSecuencialDepartamento ls
                = new LecturaSecuencialDepartamento(obtenerNombreArchivo());
        ls.establecerDepartamento();
        listaDepart = ls.obtenerDepartamento();
    }

    public String obtenerNombreArchivo() {
        return nombreArch;
    }

    public ArrayList<Departamento> obtenerLista() {
        return listaDepart;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try {
            if (salida != null) {
                salida.close();
            }
        } catch (IOException ioException) {
            System.out.println("Error al cerrar el archivo....");

        }
    }
}
