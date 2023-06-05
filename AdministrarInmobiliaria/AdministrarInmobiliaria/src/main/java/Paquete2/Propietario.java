/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete2;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Propietario implements Serializable {

    private String nombres;
    private String apellidos;
    private String identificacion;

    public Propietario(String nom, String ap, String iden) {

        nombres = nom;
        apellidos = ap;
        identificacion = iden;

    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nom) {
        nombres = nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String ap) {
        apellidos = ap;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String iden) {
        identificacion = iden;
    }

}
