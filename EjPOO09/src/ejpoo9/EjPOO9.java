/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo9;

import entidad.Matematica;
import java.util.Scanner;
import service.MatematicaService;

/**
 *
 * @author Facundo
 */
public class EjPOO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica m = new Matematica();
        MatematicaService ms = new MatematicaService();
        Scanner leer = new Scanner(System.in);

        m.setNum1((int) Math.round(10 * Math.random()));
        m.setNum2((int) Math.round(10 * Math.random()));
        System.out.println("Bienvenido a la calculadora.");
        System.out.println(m.getNum1());
        System.out.println(m.getNum2());
        System.out.println("El mayor es = " + ms.devolverMayor(m));
        System.out.println("El menor es = " + ms.devolverMenor(m));
        System.out.println("potencia del mayor con exponente del menor = " + ms.calculcarPotencia(m));
        System.out.println("La raiz cuadrada del menor es = " + ms.calcularRaiz(m));
    }
}

