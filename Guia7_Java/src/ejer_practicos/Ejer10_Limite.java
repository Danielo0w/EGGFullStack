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
public class Ejer10_Limite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero limite");
        int j = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("ingrese sus numeros");
            int n = leer.nextInt();
            suma += n;
        } while (suma <= j);
    }

}
