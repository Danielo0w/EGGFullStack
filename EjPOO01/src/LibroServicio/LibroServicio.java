/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroServicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {
        Libro l1 = new Libro();
        System.out.println("Ingrese el ISBN");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el Título");
        l1.setTítulo(leer.next());
        System.out.println("Ingrese el Autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de Paginas");
        l1.setPags(leer.nextInt());
        return l1;
    }
    public void mostrar(Libro l1) {
        System.out.println("El ISBN del libro es: "+ l1.getISBN());
        System.out.println("El Título del libro es: "+ l1.getTítulo());
        System.out.println("El Autor del libro  es: "+ l1.getAutor());
        System.out.println("La cantidad de paginas que tiene el libro es de : "+ l1.getPags());

    }
}
