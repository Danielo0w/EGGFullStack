/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext4_digito_verificador;

import ENTIDADES.NIF;
import Servicios.ServicioNIF;

/**
 *
 * @author erika
 */
public class POOEJEXT4_DIGITO_VERIFICADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioNIF sn= new ServicioNIF();
        NIF n =sn.crearNIF();
        sn.mostrarNIF(n);
        
    }
    
}
