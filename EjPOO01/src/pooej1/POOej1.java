/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidades.Libro;
import LibroServicio.LibroServicio;

/**
 *
 * @author Facundo
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.crearLibro();
        ls.mostrar(l1);

    }
}
