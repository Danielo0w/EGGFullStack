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
public class Ejer9_PrimerLetraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase=leer.nextLine();
        if(frase.startsWith("a")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
