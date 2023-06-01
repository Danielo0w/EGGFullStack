/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo6;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Cafetera {

    Scanner leer = new Scanner(System.in);
    private int capacidadMaxima = 100;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        setCantidadActual(capacidadMaxima);

    }

    public void servirTaza(int taza){
        System.out.println("INgrese la cantidad a servir");
        taza = leer.nextInt();
        if(taza <= cantidadActual){
            cantidadActual-=taza;
            System.out.println("Se sirvio correctamente");
            System.out.println("Queda " + cantidadActual +  "% de cafe" );
            
        }else {
            System.out.println("se sirvio solamente " + cantidadActual + "ya que la taza es mayor que el cafe restante");
            cantidadActual=0;
            System.out.println("no queda nada de cafe");
            
        }
    }
    public void vaciarCafetera(){
        setCantidadActual(0);
        System.out.println("Se vacio correctamente");
    }
    
    public void agregarCafe(int agg){
        System.out.println("ingrese la cantidad a agreagar");
        agg=leer.nextInt();
        if ( cantidadActual+agg >= capacidadMaxima){
            System.out.println("Se lleno hasta el maximo de cafe ");
            cantidadActual= capacidadMaxima;
        } else {
            System.out.println("Se lleno la cafetera hasta el " + (agg+cantidadActual) + "%");
            cantidadActual+=agg;
        }
    }
}
