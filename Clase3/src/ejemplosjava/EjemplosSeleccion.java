/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *crear un programa que permita ingresar una calificacion por teclado
   Si la calificacion es mayor o igual 5 y la calificacion es menor a 10
   y presentar un mensaje que diga "Usted esta en supletorios" de lo contrario se presenta un mensaje con el valor de la calificacion dividido para dos 

 */
package ejemplosjava;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class EjemplosSeleccion { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int calificacion;
         System.out.println("Ingrese su calificacion");
         calificacion = entrada.nextInt();
         if(calificacion >= 5 && calificacion < 10){
            if(calificacion >= 5 && calificacion < 10){
            }else{
               System.out.printf("%d", calificacion/2);
               double resultado = calificacion/2;
               System.out.printf("");
            }
            }
         }       
}
