/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_practicos;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejer16_BuscarNumEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamño de su vector");
        int tam = leer.nextInt(), n, cont = 0;
        int[] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        System.out.println("Ingrese un numero a buscar en el vector");
        n = leer.nextInt();
        for (int i = 0; i < tam; i++) {
            if (n == vector[i]) {
                System.out.println("el numero se encuentra en el subindice " + i + " del vector");
                cont++;
            }

        }
        if (cont > 1) {
            System.out.println("el numero que busco esta repetido " + cont + " veces");
        }
    }
} 
