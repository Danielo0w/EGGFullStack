/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpooexx2;

import entidad.Tiempo;
import servicio.ServicioTiempo;

/**
 *
 * @author TOSHIBA
 */
public class EjPOOExx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo t = new Tiempo();
    ServicioTiempo st = new ServicioTiempo(t);
    st.ImprimirHoraCompleta();
    st.mostrar();
    }

    
}
