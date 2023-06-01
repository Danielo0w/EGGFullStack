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
public class Ejer13_CuadradoDeAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N;
        System.out.println("Ingrese tamaño del lado del cuadrado");
        N = leer.nextInt();
        for (int i = 1; i <= N; i++) {//Avanza por filas
            if (i == 1 || i == N) {
                for (int j = 0; j < N; j++) { //Avanza por columnas
                    System.out.print("*");
                }
            } else {//"""filas""" intermedias
                System.out.print("*");//asterisco """columna""" 1
                for (int j = 1; j < N - 1; j++) {//Avanza por columnas
                    System.out.print(" ");

                }
                System.out.print("*");//asterisco """columna""" N
            }//FIN DEL ELSE
            System.out.println("");
        }//FIN DEL PRIMER FOR
    }
}
//Alternativa
/*      int n = 4; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/
