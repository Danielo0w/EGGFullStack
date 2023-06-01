/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ServicioPuntos {
      private Puntos p;
    Scanner leer =new Scanner(System.in);

    public ServicioPuntos() {
    }

    public ServicioPuntos(Puntos p) {
        this.p = p;
    }
    
    public void CrearPuntos(){
        System.out.println("Digite la coordenada para x1");
        p.setX1(leer.nextInt());
        System.out.println("Digite la coordenada para x2");
        p.setX2(leer.nextInt());
        System.out.println("Digite la coordenada para y1");
        p.setY1(leer.nextInt());
        System.out.println("Digite la coordenada para y2");
        p.setY2(leer.nextInt()); 
    }
    public double CalcularDistancia(){
        
        return Math.sqrt(Math.pow((p.getX2()-p.getX1()),2)+ Math.pow((p.getY2()-p.getY1()),2));
    }
}
