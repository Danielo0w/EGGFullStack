/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class EjPOO11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la fecha de nacimiento");
        System.out.println("AÑO");
        int anio=leer.nextInt();
        System.out.println("DIA");
        int dia=leer.nextInt();
        System.out.println("MES");
        int mes=leer.nextInt();
        Date fecha = new Date(anio-1900,mes,dia);
        Date fechaActual = new Date();
        long diferenciaEnMilisegundos = fechaActual.getTime() - fecha.getTime();
        long milisegundosEnUnAnio = 1000L * 60 * 60 * 24 * 365;
        System.out.println("la diferencia en años es : "+ diferenciaEnMilisegundos/milisegundosEnUnAnio);
        
        
    }
    
}
