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
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int nhijos,nboleta;
        String c1="";
        String cadenaFinal="";
        String npadre="";
        String hijos="";
        String cadena="";
        String cadena1="";
        double sueldo,pasajes, bar,salidas,spasajes=0,sbar=0,ssalidas=0,stotal=0;
        cadena = String.format("%s\t%s\t%s\t%s\n", "Persona","Pasajes","Bar","salidas"); 
        System.out.println("Ingrese el numero de boletas :");
        nboleta = entrada.nextInt();
        for( int acont=1;acont<=nboleta;acont ++){
            entrada.nextLine();
            System.out.printf("\nIngrese el nombre del padre de Familia #%d:",acont );
            npadre = entrada.nextLine();
            System.out.printf("Ingrese su saldo mensual:" );
            sueldo = entrada.nextDouble();
            System.out.printf("Ingrese el número de hijos:" );
            nhijos = entrada.nextInt();
            cadena1 = String.format("%s\nNombre del padre: %s\n Sueldo semanal: %.2f\n Número de hijos: %d\n",cadenaFinal, npadre,sueldo,nhijos);
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
                    stotal=spasajes+sbar+ssalidas;
                }
         if (stotal<sueldo){
            c1=String.format("El padre de familia le sobra dinero");
         }else{
            c1= String.format("El padre de familia le falta dinero");
         }       
            if (stotal==sueldo){  
                    c1=String.format("El padre de familia le alcanza el dinero");
            }        
                cadenaFinal=String.format("%s%sTotal\t%.2f\t%.2f\t%.2f\n%s",cadena1,cadena,spasajes,sbar,ssalidas,c1 );
        }  
        System.out.printf("\nReporte Gastos Padres de Familia:\n%s",cadenaFinal);
        
    }  
}
