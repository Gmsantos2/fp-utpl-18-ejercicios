/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_do.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio_dowhile2 {
    public static void main(String[] args) {
        boolean jug=true;
        int num=0,npartidos,pases=0,goles=0,tpases,tgoles,cont=1,contin;
        String njugador="";
        String nivelj="";
        double prompases,promgoles;
        String cadena1="";
        Scanner entrada = new Scanner(System.in);
        cadena1 = String.format("\n%s\n","Reporte de jugadores del equipo UTPL:");//Creación de la cadena que se utilizara para presentar los datos 
        System.out.printf("Ingrese el número de partidos jugados:\n");
        npartidos=entrada.nextInt();
        cadena1 = String.format("%s\n\n%s\t\t%s\t\t%s\t\t%s\n",cadena1,"Nombre del jugador","Total pases","Total goles","Nivel del jugador");
        do {
            num=num+1;    
            entrada.nextLine();
            tpases=0;
            tgoles=0;        
            System.out.printf("Ingrese el nombre del jugador #%d:\n",num);
            njugador=entrada.nextLine();
            cadena1 = String.format("%s %s",cadena1,njugador); 
            for (int acont=1;acont<=npartidos;acont ++){ 
                entrada.nextLine();
                System.out.printf("Ingrese los pases del partido #%d:\n",acont);
                pases=entrada.nextInt();
                System.out.printf("Ingrese los  goles hechos en el partido #%d:\n",acont);
                goles=entrada.nextInt(); 
                cadena1 = String.format("%s\t\t\t\tP%d:%d\t\t\tP%d:%d\n",cadena1,acont,pases,acont,goles);
                tpases=tpases+pases;
                tgoles=tgoles+goles;
            }
            if (tpases>=100){
                nivelj="Exelente";
            }else{
                if (tpases <99 &  tpases>79){
                    nivelj = "Muy bueno";
                }else{
                    if (tpases <= 79 & tpases > 59){
                        nivelj = "Bueno";
                    }else{
                        nivelj = "Regular";
                    }
                }
            }
        
            entrada.nextLine();
            cadena1 = String.format("%s\t\t\t\tTotal:%d\t\t\tTotal:%d\t\t\t\t%s\n",cadena1,tpases,tgoles,nivelj);    
            System.out.printf("Desea seguir ingresando más jugadores ? (si=1) (no=0)\n");
            contin=entrada.nextInt();
        prompases=tpases/num ;
        promgoles=tgoles/num ;
        }while(contin==1);
        entrada.nextLine();
        cadena1 = String.format("%s\nDatos Finales:\n%d Jugadores Analizados.\nPromedio de Pases del equipo es %.2f\nPromedio de Goles del equipo es %.2f\n\nDepartamento Estadístico.", cadena1, num, prompases, promgoles);
        
        System.out.printf(cadena1);
    }     
}
