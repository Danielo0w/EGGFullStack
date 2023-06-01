/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDADES.NIF;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioNIF {
    Scanner leer = new Scanner(System.in);
    String[] vector = new String[23];
    String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";

     
    
    public NIF crearNIF(){
        for (int i = 0; i < 23; i++) {
         vector[i] = String.valueOf(cadena.charAt(i));
        }
        NIF n = new NIF();
        String dni ;
            do {
          System.out.println("Ingrese el DNI (numero de 8 dígitos):");  
          dni= leer.nextLine();  
        }while (dni.length()!= 8);
        long auxd = Long.valueOf(dni);
        n.setDNI(dni);
        int aux =(int)(auxd%23);
        n.setLetra(vector[aux]);
        return n;
    }
    
    public void mostrarNIF(NIF n){
        System.out.println("El NIF es: "+n.getDNI()+"-"+n.getLetra());
    }
}
