/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ServicioCancion {
    private Cancion c;
    Scanner leer = new Scanner (System.in);
    
    public ServicioCancion() {
    }

    public ServicioCancion(Cancion c) {
        this.c = c;
    }
    
    public void crearCancion(){
        System.out.println("Ingrese el titulo de la cancion: ");
        c.setTitulo(leer.next());
        System.out.println("Ingrese el autor de la cancion: ");
        c.setAutor(leer.next());
    }
    public void mostrar(){
        System.out.println("titulo: " + c.getTitulo());
        System.out.println("autor: " + c.getAutor());
    }
    
}
