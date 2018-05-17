/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_ciclo_while;

import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num,contador=1,A=0,C=0,otro=0,Ch=0;
        String marca;
        String origen;
        double costo;
        double iva;
        double totalIva = 0;
        double totalPrecio = 0;
        double precioVenta;
        System.out.println("Ingrese el numero de Autos Importados:");
        num = entrada.nextInt();
        String Cadena = String.format("%s\t\t%s\t\t\t%s\t\t\t%s\t\t\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
        while (contador<=num) {
            entrada.nextLine();
            System.out.printf("\nIngrese la Marca del Vehículo #%d:\n",contador);
            marca = entrada.nextLine();
            System.out.printf("Ingrese el pais de origen del Vehículo #%d:\n",contador);
            origen = entrada.nextLine();
            System.out.printf("Ingrese el costo del Vehículo #%d:\n",contador);
            costo = entrada.nextDouble();
            if (origen.equals("Argentina")) {
                A = A + 1;
                iva = costo * 0.2;
            } else {
                if (origen.equals("Colombia")) {
                    C = C + 1;
                    iva = costo * 0.25;
                } else {
                    if (origen.equals("Chile")) {
                        Ch = Ch + 1;
                        iva = costo * 0.3;
                    } else {
                        otro = otro + 1;
                        iva = costo * 0.4;
                    }
                }
            }
            precioVenta = costo + iva;
            totalIva = totalIva + iva;
            totalPrecio = totalPrecio + precioVenta;
            Cadena = String.format("%s%-10s\t%-10s\t\t%f\t\t\t%f\t\t\t%f\n", Cadena, marca, origen, costo, iva, precioVenta);
            contador += 1;          
        }
        System.out.println("\tReporte de Autos Importados");
        System.out.printf("%s", Cadena);
        System.out.printf("\nTotal Autos\t\t%d\t\tTot.Imp%.2f\t\tTot.PV\t%.2f\n", contador-1, totalIva, totalPrecio);
        System.out.printf("\nArgentina\t%d\n", A);
        System.out.printf("Chile    \t%d\n", Ch);
        System.out.printf("Colombia\t%d\n",C);
        System.out.printf("Resto de paises\t%d\n", otro);  
        
    }
}
