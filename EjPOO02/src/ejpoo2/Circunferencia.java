/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo2;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Circunferencia {
    private  double radio;
    
    Scanner scan = new Scanner(System.in);
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        setRadio(scan.nextDouble());
    }
    public void area (){
        System.out.println("Area= " + (Math.PI *(radio*radio)));
    }
    public void perimetro (){
        System.out.println("Perimetro= " + (2*Math.PI*radio));
    }
    
}
