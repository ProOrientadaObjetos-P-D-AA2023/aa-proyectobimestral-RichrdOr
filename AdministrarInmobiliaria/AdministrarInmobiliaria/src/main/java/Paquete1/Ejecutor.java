/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Paquete1;

import java.util.Scanner;
import Paquete2.*;
import Paquete3.*;
import Paquete4.*;
import Paquete5.*;
import Paquete6.*;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        int opc;

        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s",
                "\tSISTEMA INMOBILIARIO",
                "\t====================",
                "\t1) Casas",
                "\t2) Departamentos",
                "\t====================",
                " Ingrese por teclado: ");
        

        opc = entrada.nextInt();

        switch (opc) {

            case 1:

                int opcCase1;

                System.out.printf("%s\n%s\n%s\n%s\n%s\n%s",
                        "\tOpciones",
                        "\t====================",
                        "\t1) Agregar Casa",
                        "\t2) Listar",
                        "\t3) Validar",
                        "\t====================",
                        "\tIngrese por teclado: ");
                opcCase1 = entrada.nextInt();

                if (opcCase1 == 1) {

                    agregarCasa();
                    
                    entrada.nextLine();
                    System.out.print("\nCasa creada\n");

                } else {

                    if (opcCase1 == 2) {

                        int u;

                        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s",
                                "\tOpciones",
                                "\t====================",
                                "\t1) Listar Propietario",
                                "\t2) Listar Constructoras",
                                "\t3) Listar Ciudad",
                                "\t4) Listar Barrio",
                                "\t5) Listar Casa",
                                "\tIngrese por teclado: ");

                        u = entrada.nextInt();

                        if (u == 1) {

                            verPropietario();

                        } else {

                            if (u == 2) {

                                verConstructora();

                            } else {

                                if (u == 3) {

                                    verCiudad();

                                } else {

                                    if (u == 4) {

                                        verBarrio();

                                    } else{
                                    
                                        verCasa();
                                    
                                    }

                                }

                            }

                        }

                    }else{
                    
                        if(opcCase1 ==3){
                            
                            int j;

                        System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                                "Opciones",
                                "1) Validar Propietario",
                                "2) Validar Constructoras",
                                "3) Validar Ciudad",
                                "4) Validar Barrio");

                        j = entrada.nextInt();
                        
                        
                        }
                    
                    
                    
                    }

                }

                break;


            case 2:

                int opcCase2;

                System.out.printf("%s\n%s\n%s\n",
                        "Opciones",
                        "1) Agregar Departamento",
                        "2) Listar",
                        "3) Validar");
                opcCase2 = entrada.nextInt();

                if (opcCase2 == 1) {

                    agregarDepartamento();
                    
                    entrada.nextLine();
                    System.out.print("\nDepartamento creado\n");

                } else {

                    if (opcCase2 == 2) {

                        int k;

                        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n",
                                "Opciones",
                                "1) Listar Propietario",
                                "2) Listar Constructoras",
                                "3) Listar Ciudad",
                                "4) Listar Barrio",
                                "5) Listar Departamento");

                        k = entrada.nextInt();

                        if (k == 1) {

                            verPropietario();

                        } else {

                            if (k == 2) {

                                verConstructora();

                            } else {

                                if (k == 3) {

                                    verCiudad();

                                } else {

                                    if (k == 4) {

                                        verBarrio();

                                    } else{
                                    
                                        verDepartamento();
                                    
                                    }

                                }

                            }

                        }

                    }else{
                    
                        if(opcCase2 ==3){
                            
                            int j;

                        System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                                "Opciones",
                                "1) Validar Propietario",
                                "2) Validar Constructoras",
                                "3) Validar Ciudad",
                                "4) Validar Barrio");

                        j = entrada.nextInt();
                        
                            
                            
                        
                        }
                    
                    
                    
                    }

                }

                break;

            case 3:

                break;

            case 4:

                break;

            default:

                System.out.println("Opción no válida");

                break;

        }

    }

    public static void verPropietario() {
        String nombreArchivo = "datos/propietarios.dat";
        LecturaSecuencialPropietarios lectura
                = new LecturaSecuencialPropietarios(nombreArchivo);
        lectura.establecerPropietario();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
    

    public static void verConstructora() {
        String nombreArchivo = "datos/constructoras.dat";
        LecturaSecuencialConstructora lectura
                = new LecturaSecuencialConstructora(nombreArchivo);
        lectura.establecerConstructora();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }


    public static void verCiudad() {
        String nombreArchivo = "datos/ciudades.dat";
        LecturaSecuencialCiudad lectura
                = new LecturaSecuencialCiudad(nombreArchivo);
        lectura.establecerCiudad();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }

    public static void verBarrio() {
        String nombreArchivo = "datos/barrios.dat";
        LecturaSecuencialBarrio lectura
                = new LecturaSecuencialBarrio(nombreArchivo);
        lectura.establecerBarrio();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }


    public static void verCalculoCasa() {
        String nombreArchivo = "datos/valorcasa.dat";
        LecturaSecuencialCalculoCasa lectura
                = new LecturaSecuencialCalculoCasa(nombreArchivo);
        lectura.establecerConstructora();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
    
    public static void agregarCasa() {
        
        // Propietario
        
        String nombreArchivo1 = "datos/propietarios.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su identificacion: ");
        String id = entrada.nextLine();

        Propietario c = new Propietario(nombre, apellido, id);

        EscrituraSecuencialPropietarios archivo1
                = new EscrituraSecuencialPropietarios(nombreArchivo1);

       
        archivo1.establecerRegistro(c);
       
        archivo1.establecerSalida();
        archivo1.cerrarArchivo();
        
        String nombreArchivo2 = "datos/constructoras.dat";

        System.out.println("Ingrese nombre de la Constructora: ");
        String nombrec = entrada.nextLine();
        System.out.println("Ingrese ID de la constructora: ");
        String iD = entrada.nextLine();

        Constructora q = new Constructora(nombrec, iD);
        
        EscrituraSecuencialConstructora archivo
                = new EscrituraSecuencialConstructora(nombreArchivo2);

       
        archivo.establecerRegistro(q);
        
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        
        
        String nombreArchivo3 = "datos/ciudades.dat";
        System.out.println("Ingrese nombre de la ciudad: ");
        String nombreCiud = entrada.nextLine();
        System.out.println("Ingrese nombre de la provincia: ");
        String prov = entrada.nextLine();

        Ciudad o = new Ciudad(nombreCiud, prov);
        
        EscrituraSecuencialCiudad archivo3
                = new EscrituraSecuencialCiudad(nombreArchivo3);

       
        archivo3.establecerRegistro(o);
        archivo3.establecerSalida();
        archivo3.cerrarArchivo();
        
        // Barrio
        
        String nombreArchivo4 = "datos/barrios.dat";
        System.out.println("Ingrese nombre del Barrio: ");
        String nombreB = entrada.nextLine();
        System.out.println("Ingrese una referencia: ");
        String referencia = entrada.nextLine();

        Barrio z = new Barrio(nombreB, referencia);
          
        EscrituraSecuencialBarrio archivo4
                = new EscrituraSecuencialBarrio(nombreArchivo4);

        
        archivo4.establecerRegistro(z);
      
        archivo4.establecerSalida();
        archivo4.cerrarArchivo();
        
        // Calculo
        
        String nombreArchivo5 = "datos/valorcasa.dat";
        System.out.println("Ingrese precio metro cuadrado: ");
        double pmetro = entrada.nextDouble();
        System.out.println("Ingrese numero de metros cuadrados: ");
        double numMetroC = entrada.nextDouble();
        System.out.println("Ingrese numero de cuartos: ");
        int numCuartos = entrada.nextInt();

        CalculoCasa d = new CalculoCasa(pmetro, numMetroC, numCuartos);

        d.calcularCostoF();

        EscrituraSecuencialCalculoCasa archivo5
                = new EscrituraSecuencialCalculoCasa(nombreArchivo5);

       
        archivo5.establecerRegistro(d);
        archivo5.establecerSalida();
        archivo5.cerrarArchivo();
        
        // Casa
        
        String nombreArchivo6 = "datos/casas.dat";
         
        Casa f = new Casa(c,z,o,q,d);

        EscrituraSecuencialCasa archivo6
                = new EscrituraSecuencialCasa(nombreArchivo6);

       
        archivo6.establecerRegistro(f);
        archivo6.establecerSalida();
        archivo6.cerrarArchivo();
    }
    
    public static void verCasa() {
        String nombreArchivo = "datos/casas.dat";
        LecturaSecuencialCasas lectura
                = new LecturaSecuencialCasas(nombreArchivo);
        lectura.establecerCasa();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
    
    
    public static void agregarDepartamento() {
        
        // Propietario
        
        String nombreArchivo1 = "datos/propietarios.dat";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su identificacion: ");
        String id = entrada.nextLine();

        Propietario c = new Propietario(nombre, apellido, id);

        EscrituraSecuencialPropietarios archivo1
                = new EscrituraSecuencialPropietarios(nombreArchivo1);

        
        archivo1.establecerRegistro(c);
        
        archivo1.establecerSalida();
        archivo1.cerrarArchivo();
        
        // Constructora
        
        String nombreArchivo2 = "datos/constructoras.dat";

        System.out.println("Ingrese nombre de la Constructora: ");
        String nombrec = entrada.nextLine();
        System.out.println("Ingrese ID de la constructora: ");
        String iD = entrada.nextLine();

        Constructora q = new Constructora(nombrec, iD);
        
        EscrituraSecuencialConstructora archivo
                = new EscrituraSecuencialConstructora(nombreArchivo2);

        
        archivo.establecerRegistro(q);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        // Ciudad
        
        String nombreArchivo3 = "datos/ciudades.dat";
        System.out.println("Ingrese nombre de la ciudad: ");
        String nombreCiud = entrada.nextLine();
        System.out.println("Ingrese nombre de la provincia: ");
        String prov = entrada.nextLine();

        Ciudad o = new Ciudad(nombreCiud, prov);
        
        EscrituraSecuencialCiudad archivo3
                = new EscrituraSecuencialCiudad(nombreArchivo3);

       
        archivo3.establecerRegistro(o);
        archivo3.establecerSalida();
        archivo3.cerrarArchivo();
        
        // Barrio
        
        String nombreArchivo4 = "datos/barrios.dat";
        System.out.println("Ingrese nombre del Barrio: ");
        String nombreB = entrada.nextLine();
        System.out.println("Ingrese una referencia: ");
        String referencia = entrada.nextLine();

        Barrio z = new Barrio(nombreB, referencia);
          
        EscrituraSecuencialBarrio archivo4
                = new EscrituraSecuencialBarrio(nombreArchivo4);

        
        archivo4.establecerRegistro(z);
        archivo4.establecerSalida();
        archivo4.cerrarArchivo();
        
        // Calculo
        
        String nombreArchivo5 = "datos/departamento.dat";
        System.out.println("Ingrese el nombre del edificio: ");
        String nombreEdif = entrada.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese precio metro cuadrado: ");
        double pmetro = entrada.nextDouble();
        System.out.println("Ingrese numero de metros cuadrados: ");
        double numMetroC = entrada.nextDouble();
        System.out.println("Ingrese el valor de alicuota mensual: ");
        double valAM = entrada.nextDouble();
        System.out.println("Ingrese numero de cuartos: ");
        int numCuartos = entrada.nextInt();

        CalculoDepartamento d = new CalculoDepartamento(nombreEdif, direccion ,pmetro, numMetroC,valAM, numCuartos);

        d.calcularCostoFinal();

        EscrituraSecuencialCalculoDepartamento archivo5
                = new EscrituraSecuencialCalculoDepartamento(nombreArchivo5);


        archivo5.establecerRegistro(d);
        archivo5.establecerSalida();
        archivo5.cerrarArchivo();
        
        // Casa
        
        String nombreArchivo6 = "datos/departamento.dat";
         
        Departamento f = new Departamento(c,z,o,q,d);

        EscrituraSecuencialDepartamento archivo6
                = new EscrituraSecuencialDepartamento(nombreArchivo6);

        
        archivo6.establecerRegistro(f);
        archivo6.establecerSalida();
        archivo6.cerrarArchivo();
    }
    
    public static void verDepartamento() {
        String nombreArchivo = "datos/departamento.dat";
        LecturaSecuencialDepartamento lectura
                = new LecturaSecuencialDepartamento(nombreArchivo);
        lectura.establecerDepartamento();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}

