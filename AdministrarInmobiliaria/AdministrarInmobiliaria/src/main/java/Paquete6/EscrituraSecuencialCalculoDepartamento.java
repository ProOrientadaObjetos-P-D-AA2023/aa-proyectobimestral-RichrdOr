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
public class EscrituraSecuencialCalculoDepartamento {

    private String nombreArch;
    private ObjectOutputStream salida;
    private CalculoDepartamento registro;
    private ArrayList<CalculoDepartamento> listaCalculoDep;

    public EscrituraSecuencialCalculoDepartamento(String nombreArc) {

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
            System.out.println("Error al abrir el archivo....");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArch = n;
    }

    public void establecerRegistro(CalculoDepartamento p) {
        registro = p;
    }

    public void establecerSalida() {

        try {
            salida.writeObject(registro);
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo....");
        }
    }

    public void establecerLista() {
        LecturaSecuencialCalculoDepartamento l
                = new LecturaSecuencialCalculoDepartamento(obtenerNombreArchivo());
        l.establecerConstructora();
        listaCalculoDep = l.obtenerPropietario();
    }

    public String obtenerNombreArchivo() {
        return nombreArch;
    }

    public ArrayList<CalculoDepartamento> obtenerLista() {
        return listaCalculoDep;
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
            System.out.println("Error al cerrar el archivo.....");

        }
    }
}
