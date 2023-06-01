/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooext6_ahorcado;

import Entidades.Ahorcado;
import Servicio.ServicioAhorcado;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class POOEXT6_AHORCADO {

    /**
     * @param args theso command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioAhorcado sh = new ServicioAhorcado();
        Ahorcado h = sh.crearJuego();
        sh.longitud();
        for (int i = 0; i <= h.getCantidadJugadas(); i++) {
            System.out.println("Ingrese la letra que desea buscar:");
            String letra = leer.nextLine();
            sh.buscar(letra);
            sh.encontradas(letra);
            i=0;
        }

    }

}
