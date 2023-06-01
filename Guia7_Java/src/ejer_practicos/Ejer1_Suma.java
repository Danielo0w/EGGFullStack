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
public class Ejer1_Suma {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite dos numeros para que sean sumados");
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("la suma da: " + (num1+num2));
    }
    
}