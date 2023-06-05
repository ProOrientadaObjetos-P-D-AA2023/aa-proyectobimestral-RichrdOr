/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete3;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Barrio implements Serializable {
    
    private String nomBarri;
    private String refe;
    
    public Barrio(String n, String r){
    
        nomBarri = n;
        refe = r;
    }
    
    
    public String obtenerNomBarrio() {
        return nomBarri;
    }
    
    public String obtenerRef() {
        return refe;
    }
    
    public void establecerNomBarrio(String x) {
        nomBarri = x;
    }
    
    public void establecerRef(String x) {
        refe = x;
    }
}
