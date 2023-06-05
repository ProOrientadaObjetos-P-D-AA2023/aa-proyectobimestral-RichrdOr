/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete6;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class CalculoCasa implements Serializable{
    
    private double perimetrometroc;
    private double numerosMetrosc;
    private double costoFinal;
    private int numeroCuartos;
    
    public CalculoCasa(double p, double n, int numC){
        
        perimetrometroc = p;
        numerosMetrosc = n;
        numeroCuartos = numC;
        
    }

    public double getPmetroc() {
        return perimetrometroc;
    }

    public void setPmetroc(double p) {
        this.perimetrometroc = p;
    }

    public double getNummetrosc() {
        return numerosMetrosc;
    }

    public void setNummetrosc(double n) {
        this.numerosMetrosc = n;
    }

    public double getCostoF() {
        return costoFinal;
    }

    public void calcularCostoF() {
        this.costoFinal = numerosMetrosc * perimetrometroc;
    }

    public int getNumcuartos() {
        return numeroCuartos;
    }

    public void setNumcuartos(int n) {
        this.numeroCuartos = n;
    } 
    
}
