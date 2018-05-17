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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre="";
        String nArticulo="";
        double cant,valorUnit,valorTotal,iva,subt=0.0,total;
        boolean prod = true;
        String Cadena = String.format("%s\t%s\t%s\t%s\n", "Artículo","Cantidad","Precio Unit","Precio Total");
        System.out.println("Ingrese el nombre del cliente:");
        nombre = entrada.nextLine();
        while (prod){
            System.out.println("Ingrese el nombre del artículo:");
            nArticulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad de artículos:");
            cant = entrada.nextInt();
            System.out.println("Ingrese el precio unitario del artículo:");
            valorUnit = entrada.nextDouble();
            valorTotal=cant*valorUnit;
            subt=subt+valorTotal;
            Cadena = String.format("%s%s\t\t%.1f\t\t%.2f\t\t%.2f\n",Cadena,nArticulo,cant,valorUnit,valorTotal);
            entrada.nextLine();
            System.out.println("Desea ingresar más artículos? no<--- (proseguir a la factura)");
            String temporal = entrada.nextLine();   
                if(temporal.equals("no")){
                    prod = false;
                }
        
        }
        iva=subt*0.14;
        total=subt+iva;
        System.out.println("\tFactura\n");
       
        System.out.println ("Supermercado ''Todo a menor precio''");
        System.out.printf("Nombre del cliente:%s\n\n",nombre);
        System.out.printf("%s",Cadena);
        System.out.printf("\t\t\t\tSubtotal\t%.2f\n",subt);
        System.out.printf("\t\t\t\tIVA 14\t\t%.2f\n",iva);
        System.out.printf("\t\t\t\tTotal\t\t%.2f\n",total);
        
    }
}
