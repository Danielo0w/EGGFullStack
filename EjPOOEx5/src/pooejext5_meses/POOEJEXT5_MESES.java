/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejext5_meses;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class POOEJEXT5_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Asignar meses a un array
        Scanner leer = new Scanner(System.in);
        String mesUsuario;
        String[] mes = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = mes[9];

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        do {

            mesUsuario = leer.nextLine();
            if (!(mesUsuario.equals(mesSecreto))) {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            } else {
                System.out.println("¡Ha acertado!");
            }

        } while (!(mesUsuario.equals(mesSecreto)));

    }

}
