/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRaiz;

import Entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioRaiz {

    Scanner leer = new Scanner(System.in);

    public Raiz crearRaiz() {
        Raiz r = new Raiz();
        System.out.println("ingrese el, coeficiente a:");
        r.setA(leer.nextDouble());
        System.out.println("ingrese el, coeficiente b:");
        r.setB(leer.nextDouble());
        System.out.println("ingrese el, coeficiente c:");
        r.setC(leer.nextDouble());
        return r;
    }

    public double getDiscriminante(Raiz r) {
        double discriminante = (double) (Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));
        return discriminante;
    }

    public boolean tieneRaices(Raiz r) {
        boolean booleano;
        double d = getDiscriminante(r);

        booleano = (d >= 0);
        /*
        if (d == 0) {
                booleano = true;
        } else {
            booleano = false;
        }*/
        return booleano;
    }

    public boolean tieneRaiz(Raiz r) {
        boolean booleano;
        double d = getDiscriminante(r);
        booleano = (d == 0);
        return booleano;
    }

    public void obtenerRaices(Raiz r) {
        double r1, r2;
        if (tieneRaices(r)) {
            r1 = (-r.getB() + (Math.sqrt(getDiscriminante(r)))) / (2 * r.getA());
            r2 = (-r.getB() - (Math.sqrt(getDiscriminante(r)))) / (2 * r.getA());
            System.out.println("las raices son r1: " + r1 + " y r2: " + r2);
        } else {
            System.out.println("no tiene raices reales");
        }
    }

    public void obtenerRaiz(Raiz r) {
        double r1, r2;
        if (tieneRaiz(r)) {
            r1 = (-r.getB() + (Math.sqrt(getDiscriminante(r)))) / (2 * r.getA());
            r2 = (-r.getB() - (Math.sqrt(getDiscriminante(r)))) / (2 * r.getA());
            if (r1 == r2) {
                System.out.println("la raiz unica es: " + r1);
            }

        } else {
            System.out.println("no tiene solución");
        }
    }

    public void calcular(Raiz r) {
        if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else if (tieneRaices(r)) {
            obtenerRaices(r);
        } else {
            System.out.println("No existe solución");
        }
    }
}
