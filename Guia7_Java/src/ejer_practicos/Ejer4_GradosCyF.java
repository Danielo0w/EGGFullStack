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
public class Ejer4_GradosCyF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese la temperatura en grados centigrados");
        double TC=leer.nextDouble();
        double F = 32+(9*TC/5);
        System.out.println("La temperatura en grados Fahrenheit es :" + F);
    }
    
}
