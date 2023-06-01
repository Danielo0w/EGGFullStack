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
public class Ejer19_MatrizAntisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su tamaño de fila");
        int fila = leer.nextInt();
        System.out.println("ingrese su numero de columnas");
        int col = leer.nextInt();
        boolean as = true;
        int[][] matriz = new int[fila][col];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = matriz[i][j] = (int) (Math.random() * 9) - 4;
            }
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------");
        if (fila != col) {
            System.out.println("la matriz no es cuadrada,por lo que no puede ser antisimetrica");
        } else {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < col; j++) {
                    if (matriz[i][j] != -matriz[j][i]) {
                        as = false;
                        break;
                    }
                }
            }
            if (as == true) {
                System.out.println("la matriz es una matriz anti simetrica");
            } else {
                System.out.println("la matriz no es una matriz antisimetrica");
            }
        }
    }
}
