/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra_11;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class EjerExtra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, digitos = 0;
        System.out.println("ingrese el numero");
        num = leer.nextInt();
        do {
            num = num / 10;
            digitos++;

        } while (num != 0);
        System.out.println("la cantidad de digitos es:" + digitos);
    }

}
