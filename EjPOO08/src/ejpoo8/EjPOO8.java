/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo8;

import Entidad.Cadena;
import java.util.Scanner;
import service.ServiceCadena;

/**
 *
 * @author Facundo
 */
public class EjPOO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceCadena sc = new ServiceCadena();
        
        System.out.println("Ingrese una frase.");
        Scanner leer = new Scanner(System.in);
        Cadena c = new Cadena(leer.nextLine());
        
        
        
         
      /*  System.out.println("La cantidad de vocales es = " + sc.mostrarVocales(c));
        System.out.println("la frase invertida es = " + sc.invertirCadena(c));
        System.out.println("que letra quiere verificar?");
        char letra = leer.next().charAt(0);
        leer.nextLine();
        System.out.println("la letra " + letra + " se repite " + sc.vecesRepetido(letra, c) + " veces");
        System.out.println("Ingrese otra frase a comparar longitud");
        */
      String frase = leer.nextLine();
        sc.compararLongitud(frase, c);
        System.out.println("Las frases unidas son = " + sc.unirFrases(frase, c));
        System.out.println("ingrese la letra a remplazar las 'a' ");
        String letra = leer.nextLine();
        System.out.println("la frase con las 'a' reeplzadas = " + sc.reemplazar(letra, c));
        System.out.println("la frase contiene la letra " + letra +" " +  sc.contiene(letra, c));
    }
    
}
