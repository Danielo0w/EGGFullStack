/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioMatriz;

import Entidades.sopa;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioMatriz {

    Scanner leer = new Scanner(System.in);

    public sopa crearSopa() {
        sopa m = new sopa();
        String[][] matrizPalabras = new String[10][10];
        String palabra;
        int fila, columna;

        //Rellenamos con numeroas aleatorios entre 0 y 9
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizPalabras[i][j] = Integer.toString((int) ((Math.random() * 9)));
            }
        }

        //Agregamos nuestras palabras
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra de 5 caracteres");
            palabra = leer.next();
            while (!(palabra.length() == 5)) {
                System.out.println("Ingrese una palabra de 5 caracteres");
                palabra = leer.next();
            }

            //aleatorio para la ubicación de las palabras
            fila = (int) (Math.random() * 10);
            columna = (int) (Math.random() * 5);
            for (int col = 0; col < palabra.length(); col++) {
                matrizPalabras[fila][columna] = palabra.substring(col, col + 1);
                columna++;
            }
        }

        //mostrar matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizPalabras[i][j] + "]");
            }
            System.out.println("");
        }

        m.setMatriz(matrizPalabras);
        return m;
    }

}
