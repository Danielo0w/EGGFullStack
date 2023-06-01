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
public class Ejer14_Divisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        double euros;
        System.out.println("Ingrese su monto en euros");
        euros= leer.nextDouble();
        conversion(euros);        
    }
    public static void conversion(double cant){
        Scanner leer = new Scanner(System.in);
        double yenes = 129.852;
        double libras = 0.86;
        double dolar = 1.28611;
        System.out.println("Elija el tipo de divisa al que quiere convertir su dinero");
        String divisa = leer.nextLine();
        switch(divisa){
            case "yenes":
                System.out.println("Sus euros equivalen a: "+cant*yenes+" yenes");
                break;
            case "libras":
                System.out.println("Sus euros equivalen a: "+cant*libras+" libras");
                break;
            case "dolar":
                System.out.println("Sus euros equivalen a: "+cant*dolar+" dolar");
                break;
            default:
                System.out.println("No cambiamos ese tipo de divisa");
                break;
                      
        }         
    }
}
