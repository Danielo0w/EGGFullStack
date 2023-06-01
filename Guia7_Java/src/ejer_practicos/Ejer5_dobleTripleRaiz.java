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
public class Ejer5_dobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese un numero para ver su raiz, su doble y su triple");
        double num=leer.nextDouble();
        System.out.println("El doble de " + num + " es " + (num*2));
        System.out.println("El triple de " + num + " es " + (num*3));
        System.out.println("El triple de " + num + " es " + Math.sqrt(num));
    }
    
}
