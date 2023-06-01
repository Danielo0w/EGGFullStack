/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioAhorcado {

    private Ahorcado h;
    Scanner leer = new Scanner(System.in);
    String[] vectorJuego;

    public Ahorcado crearJuego() {

        System.out.println("Ingrese la palabra para iniciar el juego:");
        String palabra = leer.nextLine();
        System.out.println("Ingrese la cantidad de jugadas maximas: ");
        int cantJugadas = leer.nextInt();
        String[] vector = new String[palabra.length()];
        vectorJuego = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vector[i] = palabra.charAt(i) + "";
            vectorJuego[i] = "_ ";
        }
        h = new Ahorcado(vector, 0, cantJugadas);
        return h;

    }

    public int longitud() {
        return h.getVector().length;
    }

    public void buscar(String letra) {
        for (int i = 0; i < h.getVector().length; i++) {
            if (h.getVector()[i].equals(letra)) {
                System.out.println("letra encontrada");
                break;
            }

        }
    }

    public void encontradas(String letra) {
        int contador = 0;
        boolean encontrada = false;

        for (int i = 0; i < h.getVector().length; i++) {

            if (h.getVector()[i].equals(letra)) {
                contador++;
                encontrada = true;
                this.vectorJuego[i] = letra;
            }

        }
        if (!encontrada) {
            h.setCantidadJugadas(h.getCantidadJugadas() - 1);
        }

        h.setLetrasEncontradas(h.getLetrasEncontradas() + contador);

        for (int i = 0; i < this.longitud(); i++) {
            System.out.print(vectorJuego[i]);
        }
        System.out.println("");

    }

    public int intentos() {
        if ((h.getCantidadJugadas() == 0) && (h.getLetrasEncontradas() < this.longitud())) {
            System.out.println("Has perdido ya no tienes jugadas");
            return h.getCantidadJugadas();
        } else {
            System.out.println("Tienes " + h.getCantidadJugadas() + " jugadas disponibles");
            System.out.println("Has encontrado " + h.getLetrasEncontradas() + " letras de un total de " + this.longitud());
            return (this.longitud()-h.getLetrasEncontradas());
        }

    }

}
