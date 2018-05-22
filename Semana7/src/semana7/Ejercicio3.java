/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana7;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {
       public static void main(String[] args) {
        int suma = 0;
        for( int contador = 1; contador <= 20; contador ++){
            System.out.printf("%d ", contador);
            if (contador % 2 == 0 ){    
                suma = suma + contador;
            }
        }
        System.out.printf("\nLa suma de los pares del 1 al 20 es = %d.", suma);
    }
}

