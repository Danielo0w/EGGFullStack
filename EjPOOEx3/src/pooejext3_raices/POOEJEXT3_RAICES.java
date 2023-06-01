/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext3_raices;

import Entidades.Raiz;
import ServicioRaiz.ServicioRaiz;

/**
 *
 * @author erika
 */
public class POOEJEXT3_RAICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioRaiz sr = new ServicioRaiz();
        Raiz r = sr.crearRaiz();
        sr.calcular(r);
        
    }
    
}
