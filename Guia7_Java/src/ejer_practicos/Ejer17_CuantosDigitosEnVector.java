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
public class Ejer17_CuantosDigitosEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        System.out.println("ingrese el tamaño de su vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];
        for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 10000);
        }
        for (int i = 0; i < tam; i++) {
            if (vector[i] < 10) {
                c1++;
            }
            if (vector[i] > 9 && vector[i] < 100) {
                c2++;
            }
            if (vector[i] > 99 && vector[i] < 1000) {
                c3++;
            }
            if (vector[i] > 999 && vector[i] < 10000) {
                c4++;
            }
            if (vector[i] > 99999 && vector[i] < 100000) {
                c5++;
            }
        }
        System.out.println("en el vector hay " + c1 + "numero de una cifra");
        System.out.println("en el vector hay " + c2 + "numero de dos cifras");
        System.out.println("en el vector hay " + c3 + "numero de tres cifras");
        System.out.println("en el vector hay " + c4 + "numero de cuatro cifras");
        System.out.println("en el vector hay " + c5 + "numero de cinco cifras");
    }
}
