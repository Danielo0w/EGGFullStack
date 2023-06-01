/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooext1_fracciones;

import Entidades.Fraccion;
import Servicio.ServicioFraccion;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class POOEXT1_FRACCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioFraccion sf = new ServicioFraccion();
        Fraccion f = sf.crearFracciones();
        Scanner leer = new Scanner(System.in);
        int aux = 0;
        do {
            System.out.println("*** MENU ***");
            System.out.println("");
            System.out.println("Seleccione la operación a ejecutar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            aux = leer.nextInt();

            switch (aux) {
                case 1:
                    sf.sumarFraccion(f);
                    break;
                case 2:
                    sf.restaFraccion(f);
                    break;
                case 3:
                    sf.multiplicacionFraccion(f);
                    break;
                case 4:
                    sf.DivisionFraccion(f);
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestra calculadora");
                    break;
            }

        } while (aux != 5);

    }

}
