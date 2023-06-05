/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete6;

import java.io.Serializable;
import Paquete2.*;
import Paquete3.Barrio;
import Paquete4.Ciudad;
import Paquete5.Constructora;

/**
 *
 * @author Usuario
 */
public class Casa implements Serializable {
    
    private Propietario propietarios;
    private Barrio barrio;
    private Ciudad ciudad;
    private Constructora constructor;
    private CalculoCasa calculocasa;
    
    public Casa(Propietario propit, Barrio barri, Ciudad ciud, Constructora cons, CalculoCasa cCasa){
        
      propietarios = propit;
      barrio = barri;
      ciudad = ciud;
      constructor = cons;
      calculocasa = cCasa;
      
    }
    
    public Propietario obtenerPropietarios() {
        return propietarios;
    }
    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public Constructora obtenerConstructor() {
        return constructor;
    }
    
    public CalculoCasa obtenerCalculoCasa() {
        return calculocasa;
    }
    
    public void establecerCalculoCasa(CalculoCasa x) {
        calculocasa = x;
    }
    
    public void establecerPropietarios(Propietario x) {
        propietarios = x;
    }
    
    public void establecerBarrio(Barrio x) {
        barrio = x;
    }
    
    public void establecerCiudad(Ciudad x) {
        ciudad = x;
    }
    
    public void establecerConstructor(Constructora x) {
        constructor = x;
    }
    
}
