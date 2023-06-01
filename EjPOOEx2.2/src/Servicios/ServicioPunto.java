/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Punto;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioPunto {
   public Punto  crearPuntos(){
       Punto p = new Punto ();
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la coordenada x1:");
       p.setX1(leer.nextInt());
       System.out.println("Ingrese la coordenada y1:");
       p.setY1(leer.nextInt());
       System.out.println("Ingrese la coordenada x2:");
       p.setX2(leer.nextInt());
       System.out.println("Ingrese la coordenada y2:");
       p.setY2(leer.nextInt());
       return p;
   }
   
   public float calcularDistancia (Punto p){
       float distancia = (float) Math.sqrt((Math.pow((p.getX2()- p.getX1()),2))+(Math.pow((p.getY2()- p.getY1()),2)));
       return distancia;
       
   }
}
