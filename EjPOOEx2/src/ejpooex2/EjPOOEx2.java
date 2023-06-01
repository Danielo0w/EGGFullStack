/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpooex2;

import entidad.Puntos;
import servicio.ServicioPuntos;

/**
 *
 * @author TOSHIBA
 */
public class EjPOOEx2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Puntos p = new Puntos();
        ServicioPuntos sp = new ServicioPuntos(p);
        sp.CrearPuntos();
        System.out.println("Las coordenadas de los puntos son X1: "+p.getX1()+" Y1: "+p.getY1());
        System.out.println("Las coordenadas de los puntos son X2: "+p.getX2()+" Y2: "+p.getY2());
        System.out.println("La distancia entre los dos puntos es "+sp.CalcularDistancia()); 
        
    }
    
}
