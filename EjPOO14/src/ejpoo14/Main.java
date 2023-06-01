/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo14;

import entidad.Movil;
import service.ServicioMovil;

/**
 *
 * @author TOSHIBA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movil m = new Movil();
        ServicioMovil sm = new ServicioMovil(m);
        sm.cargarCelular();
        sm.crearCodigo();
        sm.mostrar();
        
    }
    
}
