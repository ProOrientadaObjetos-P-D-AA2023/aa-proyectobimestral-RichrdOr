/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete6;
import java.io.Serializable;
import Paquete2.Propietario;
import Paquete3.Barrio;
import Paquete4.Ciudad;
import Paquete5.Constructora;
/**
 *
 * @author Usuario
 */
public class Departamento implements Serializable {

    private Propietario propietario;
    private Barrio barrio;
    private Ciudad ciudad;
    private Constructora constructora;
    private CalculoDepartamento calculoDepart;

    public Departamento(Propietario propi, Barrio barri, Ciudad ciud, Constructora construc, CalculoDepartamento cDepart) {
        propietario = propi;
        barrio = barri;
        ciudad = ciud;
        constructora = construc;
        calculoDepart = cDepart;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public CalculoDepartamento obtenerCalculoDepartamento() {
        return calculoDepart;
    }

    public Barrio obtenerBarrio() {
        return barrio;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    public void establecerCalculoDpartamento(CalculoDepartamento a) {
        calculoDepart = a;
    }

    public void establecerPropietario(Propietario a) {
        propietario = a;
    }

    public void establecerBarrio(Barrio a) {
        barrio = a;
    }

    public void establecerCiudad(Ciudad a) {
        ciudad = a;
    }

    public void establecerConstructora(Constructora a) {
        constructora = a;
    }
}
