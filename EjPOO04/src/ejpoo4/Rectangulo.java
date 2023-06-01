/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo4;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Rectangulo {

    Scanner leer = new Scanner(System.in);
    private double altura;
    private double base;

    public Rectangulo() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base y la altura del rectangulo");
        setBase(leer.nextDouble());
        setAltura(leer.nextDouble());
    }

    public void superficie() {
        System.out.println("Superficie = " + (base * altura));
    }

    public void perimetro() {
        System.out.println("Perimetro = " + ((base * altura) * 2));

    } 

    public void dibujar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}

