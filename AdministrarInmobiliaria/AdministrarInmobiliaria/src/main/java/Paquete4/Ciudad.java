/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete4;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Ciudad implements Serializable{
    
    private String nomCiud;
    private String nomProv;
    
    public Ciudad(String nom, String ap){
        
        nomCiud = nom;
        nomProv = ap;
        
    }
    
    public String obtenerNomCiud() {
        return nomCiud;
    }
    
    public String obtenerNomProv() {
        return nomProv;
    }
    
    public void establecerNomCiud(String n) {
        nomCiud = n;
    }
    
    public void establecerNomProv(String n) {
        nomProv = n;
    }
}
