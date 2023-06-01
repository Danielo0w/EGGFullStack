/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ServicioMovil {
    private Movil m;
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public ServicioMovil() {
    }

    public ServicioMovil(Movil m) {
        this.m = m;
    }
    public void cargarCelular(){
        System.out.println("Ingrese la marca: ");
        m.setMarca(leer.next());
        System.out.println("Ingrese el precio: ");
        m.setPrecio(leer.nextInt());
        System.out.println("Ingrese el modelo: ");
        m.setModelo(leer.next());
        System.out.println("Ingrese la memorira RAM: ");
        m.setMemoriaRAM(leer.nextInt());
        System.out.println("Ingrese el almacenamiento: ");
        m.setAlmacenamiento(leer.nextInt());
        
    }
    public void crearCodigo(){
        int[] codigo = new int [7];
        System.out.println("Ingrese 7 numeros para el codigo: ");
        for (int i = 0; i < m.getCodigo().length; i++) {
            codigo[i]=leer.nextInt();
        }
        m.setCodigo(codigo);
    }
    public void mostrar(){
        System.out.println("Marca: "+ m.getMarca());
        System.out.println("Precio: "+ m.getPrecio());
        System.out.println("Modelo: "+ m.getModelo());
        System.out.println("Memoria RAM: "+ m.getMemoriaRAM());
        System.out.println("Almacenamiento: "+ m.getAlmacenamiento());
        
        System.out.println("el codigo generado es: ");
        for (int i = 0; i < m.getCodigo().length; i++) {
            System.out.print(m.getCodigo()[i]);
        }
        System.out.println(" ");
    }
}
