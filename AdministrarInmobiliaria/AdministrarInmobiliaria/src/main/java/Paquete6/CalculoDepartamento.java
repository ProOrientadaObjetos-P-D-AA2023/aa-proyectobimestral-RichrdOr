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
public class CalculoDepartamento implements Serializable {

    private double precioMt2;
    private double numeroMt2;
    private double valorAlicuotaM;
    private double costoFinal;
    private int numeroCuartos;
    private String nombreEdificio;
    private String ubicacion;

    public CalculoDepartamento(String nom, String ubi, double pMt2, double numMt2, double vAM, int numC) {
        nombreEdificio = nom;
        ubicacion = ubi;
        precioMt2 = pMt2;
        numeroMt2 = numMt2;
        valorAlicuotaM = vAM;
        numeroCuartos = numC;
    }

    public double obtenerPrecioM2() {
        return precioMt2;
    }

    public int obtenerNuemroCuartos() {
        return numeroCuartos;
    }

    public double obtenerNumeroM2() {
        return numeroMt2;
    }

    public double obtenerValorAlicuotaM() {
        return valorAlicuotaM;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }

    public String obtenerEdificio() {
        return nombreEdificio;
    }

    public String obtenerUbicacion() {
        return ubicacion;
    }

    public void establecerUbicacion(String x) {
        ubicacion = x;
    }

    public void establecerEdificio(String x) {
        nombreEdificio = x;
    }

    public void establecerPrecioM2(double x) {
        precioMt2 = x;
    }

    public void establecerNumerosC(int x) {
        numeroCuartos = x;
    }

    public void establecerNumeroM2(double x) {
        numeroMt2 = x;
    }

    public void establecerValorAlicuotaM(double x) {
        valorAlicuotaM = x;
    }

    public void calcularCostoFinal() {
        costoFinal = (numeroMt2 * precioMt2) + (valorAlicuotaM * 12);
    }
}
