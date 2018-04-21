/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // documentacion
        String estudiante;
        System.out.println("Ingresar el nombre");
        estudiante = entrada.nextLine;
       
        int calificacion = 50;
        if (calificacion >= 90) {
            System.out.printf("Usted está aprobado (excelente) con %d\n", calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("Usted está aprobado (muy buena) con %d\n", calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Usted está aprobado (regular) con %d\n", calificacion);

                } else {
                    System.out.printf("Usted está reprobado con %d\n", calificacion);
                }
            }
        }
    }
}
