/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_for_java;

import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class Ejercicio_for_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String val=""; //Asignación de variables
        String nombreAsign="";
        String cadena2="";
        String cadena1="";
        String  nombre="";
        int num,edad=0,nAsign;
        double prom=0,sum=0,bim1=0,bim2=0,promf=0,sumf=0,sumedad=0,promedad=0,sumtotal=0,promfinal=0; 
        Scanner entrada = new Scanner(System.in);
        cadena1 = String.format("\n%s\n","Reporte calificaciones de estudiantes");//Creación de la cadena que se utilizara para presentar los datos 
        System.out.printf("Ingrese el número de estudiantes:\n");// Ingreso de datos
        num=entrada.nextInt();
        for (int cont=1;cont<=num;cont ++){ //Determina hasta el número de estudiantes ingresados
            entrada.nextLine();
            sumf=0;
            System.out.printf("\tEstudiante #%d:\n",cont);//Ingreso de datos
            System.out.printf("Ingrese el nombre del estudiante #%d:\n",cont);
            nombre=entrada.nextLine(); 
            System.out.printf("Ingrese la edad del estudiante #%d:\n",cont);
            edad=entrada.nextInt();
            System.out.printf("Ingrese el número de asignaturas del estudiante #%d:\n",cont);
            nAsign=entrada.nextInt();
            cadena1 = String.format("%s\n%s%d%s%s\n%s%d\n%s%d",cadena1,"Nombre de estudiante #",cont,":",nombre,"Edad:",edad,"Número de asignaturas:",nAsign);//concatenación de cadenas: encabezado
            cadena1 = String.format("%s\n\n%s\n%-15s%s\t\t%s\t\t%s\n",cadena1,"Reporte de Notas","Asignatura","Bim-1","Bim-2","Promedio");//concatenación de cadenas con el encabezado de bimestres y promedio
            for (int acont=1;acont<=nAsign;acont++ ){//Determina hasta el número de asignaturas ingresadas
                entrada.nextLine();
                System.out.printf("Ingrese el nombre de la materia #%d del estudiante :\n",acont);//Ingreso de datos
                nombreAsign=entrada.nextLine();
                System.out.printf("Ingrese la nota Bim-1 del estudiante :\n");
                bim1=entrada.nextDouble();
                System.out.printf("Ingrese la nota Bim-2 del estudiante :\n");
                bim2=entrada.nextDouble();
                prom=(bim1+bim2)/2; //calculo del promedio de cada asignatura
                cadena1 = String.format("%s%-15s%.2f\t\t%.2f\t\t%.2f\n",cadena1,nombreAsign,bim1,bim2,prom);
                sumf=sumf+prom;  // calculo de la suma para poder sacar el promedio total
            }
            promf = sumf/nAsign; //calculo del promedio total
            cadena2 = String.format("\t\t%s\t%.2f\n","Promedio Total:",promf);//concatenación de cadenas con el promedio total
            cadena1 = String.format("%s%s",cadena1,cadena2);// concatenación de cadenas de lo anterior con el promedio total
            if ( promf >= 19){//Determino el promedio en palabras 
                val = "sobresaliente";
            }else{
                if ( promf >= 16 & promf < 19){
                    val = "muy bueno";
                }else{
                    if (promf >= 13 & promf < 16){
                       val = "bueno";
                    }else{
                        val = "regular";
                    }
                }
            }
            
       
        cadena1 = String.format("%s\n%s%s%s\n",cadena1,nombre,"  tiene un promedio de  ",val);
        sumedad = sumedad+edad; //calculo suma de edades
        promedad = sumedad/num; //calculo del promedio de edades
        sumtotal = sumtotal+promf;// calculo de suma para sacar el promedio total de notas de estudiantes
        promfinal = sumtotal/num; // calculo de promedio total de notas de estudiantes
    }
    System.out.printf(cadena1);// SALIDA
    System.out.println("\nInformación global de los estudiantes");
    System.out.printf("%s%.2f\n","Promedio de edad es: ",promedad);
    System.out.printf("%s%.2f\n","Promedio de notas de los estudientes es: ",promfinal);
}
}