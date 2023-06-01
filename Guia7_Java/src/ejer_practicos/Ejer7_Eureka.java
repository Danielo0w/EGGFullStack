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
public class Ejer7_Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      System.out.println("ingrese una palabra");
      String frase=leer.nextLine();
        
      if(frase.equals("eureka")){
          System.out.println("correcto");
      }else{
          System.out.println("incorrecto");
      }
    }
    
}
