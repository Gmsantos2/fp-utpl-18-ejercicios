/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nhijos;
        String hijos="";
        String cadena="";
        double sueldo,pasajes, bar,salidas,spasajes=0,sbar=0,ssalidas=0,stotal;
        cadena = String.format("%s\t%s\t%s\t%s\n", "Persona","Pasajes","Bar","salidas"); 
        System.out.println("Ingrese su saldo mensual:");
        sueldo = entrada.nextDouble();
        System.out.println("Ingrese el número de hijos:");
        nhijos = entrada.nextInt();
        
        for( int contador=1;contador<=nhijos;contador ++){
            
            System.out.printf("\nIngrese el gasto en pasajes del hijo #%d :",contador );
            pasajes = entrada.nextDouble();
            System.out.printf("Ingrese el gasto en bares del hijo #%d :",contador );
            bar = entrada.nextDouble(); 
            System.out.printf("Ingrese el gasto en salidas del hijo #%d :",contador );
            salidas = entrada.nextDouble();
            cadena = String.format("%s%s%d\t%.2f\t%.2f\t%.2f\n", cadena,"hijo",contador, pasajes,bar,salidas);
            spasajes=spasajes+pasajes;
            sbar=sbar+bar;
            ssalidas=ssalidas+salidas;
        }
        stotal=spasajes+sbar+ssalidas;
        System.out.println("Gastos Familia\n");
        System.out.printf("%s",cadena);
        System.out.printf("%s\t%.2f\t%.2f\t%.2f\n","Total",spasajes,sbar,ssalidas);
        if (stotal<sueldo){
           System.out.println("El padre de familia le sobra dinero");
        }else{
           System.out.println("El padre de familia le falta dinero");
        }
    }
   
    
}
