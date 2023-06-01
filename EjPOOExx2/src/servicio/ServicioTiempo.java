/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Tiempo;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ServicioTiempo {

    private Tiempo t;
    Scanner leer = new Scanner(System.in);

    public ServicioTiempo() {
    }

    public ServicioTiempo(Tiempo t) {
        this.t = t;
    }

    public void ImprimirHoraCompleta() {
        System.out.println("Ingrese la hora: ");
        do {
            t.setHoras(leer.nextInt());
        } while (t.getHoras() > 24);
        System.out.println("Ingrese los minutos: ");
        do {
            t.setMinutos(leer.nextInt());
        } while (t.getMinutos() > 60);

        System.out.println("Ingrese los segundos: ");
        do {
            t.setSegundos(leer.nextInt());
        } while (t.getSegundos() > 60);

    }

    public void mostrar() {
        System.out.println("la hora es: " + t.getHoras());
        System.out.println("los minutos son: " + t.getMinutos());
        System.out.println("los segundos son: " + t.getSegundos());

    }
}
