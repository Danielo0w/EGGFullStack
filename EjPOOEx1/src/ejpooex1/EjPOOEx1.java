/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpooex1;

import entidad.Cancion;
import service.ServicioCancion;

/**
 *
 * @author TOSHIBA
 */
public class EjPOOEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c = new Cancion();
        ServicioCancion sc = new ServicioCancion(c);
        sc.crearCancion();
        sc.toString();
        //sc.mostrar();
    }
    
}
