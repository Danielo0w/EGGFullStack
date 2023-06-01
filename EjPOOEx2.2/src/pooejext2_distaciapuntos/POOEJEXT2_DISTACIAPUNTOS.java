/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext2_distaciapuntos;

import Entidades.Punto;
import Servicios.ServicioPunto;

/**
 *
 * @author erika
 */
public class POOEJEXT2_DISTACIAPUNTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPunto sp = new ServicioPunto();
        Punto p = sp.crearPuntos();
        System.out.println("La distancia entre los dos puntos es: "+sp.calcularDistancia(p));
    }
    
}
