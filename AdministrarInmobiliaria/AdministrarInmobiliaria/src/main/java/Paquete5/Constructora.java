/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete5;

/**
 *
 * @author Usuario
 */
public class Constructora {
    private String nomCons;
    private String idCons;
    
    public Constructora(String nmc, String iC){
        
        nomCons =  nmc;
        idCons = iC;
    
    }

    public String getNomCons() {
        return nomCons;
    }

    public void setNomCons(String nomCons) {
        this.nomCons = nomCons;
    }

    public String getIdCons() {
        return idCons;
    }

    public void setIdCons(String idCons) {
        this.idCons = idCons;
    }

}
