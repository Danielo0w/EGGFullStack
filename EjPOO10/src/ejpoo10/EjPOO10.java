/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo10;

import java.util.Arrays;

/**
 *
 * @author TOSHIBA
 */
public class EjPOO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.round((Math.random() * 100));
        }
        //para ordenar de menor a mayor
        Arrays.sort(arregloA);

        for (int i = 0; i < 50; i++) {
            System.out.print("[" + arregloA[i] + "]");
        }
        System.out.println("");
        //
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);

        for (int i = 0; i < 20; i++) {
            System.out.print("[" + arregloB[i] + "]");
        }
    }
}