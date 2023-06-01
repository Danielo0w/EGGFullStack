/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Fraccion;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioFraccion {

    Scanner leer = new Scanner(System.in);

    public Fraccion crearFracciones() {
        Fraccion f = new Fraccion();
        System.out.println("Ingrese el denominador de la primera fracción:");
        f.setDenominador1(leer.nextInt());
        System.out.println("Ingrese el numerador de la primera fracción: ");
        f.setNumerador1(leer.nextInt());
        System.out.println("Ingrese el denominador de la segunda fracción:");
        f.setDenominador2(leer.nextInt());
        System.out.println("Ingrese el numerador de la segunda fracción: ");
        f.setNumerador2(leer.nextInt());
        return f;
    }

    public void sumarFraccion(Fraccion f) {
        int sumNumerador, sumDenominador;
        sumNumerador = ((f.getNumerador1() * f.getDenominador2()) + (f.getNumerador2() * f.getDenominador1()));
        sumDenominador = (f.getDenominador1() * f.getDenominador2());
        System.out.println("la suma de las fracciones es: " + sumNumerador + "/" + sumDenominador);

    }

    public void restaFraccion(Fraccion f) {
        int resNumerador, resDenominador;
        resNumerador = ((f.getNumerador1() * f.getDenominador2()) - (f.getNumerador2() * f.getDenominador1()));
        resDenominador = (f.getDenominador1() * f.getDenominador2());
        System.out.println("la Resta de las fracciones es: " + resNumerador + "/" + resDenominador);
    }

    public void multiplicacionFraccion(Fraccion f){
        int mulNumerador = (f.getNumerador1()*f.getNumerador2());
        int mulDenominador = (f.getDenominador1()*f.getDenominador2());
        System.out.println("El resultado de la multiplicaión es: "+mulNumerador+"/"+mulDenominador);
    }
    
    public void DivisionFraccion(Fraccion f){
        int divNumerador = (f.getNumerador1()*f.getDenominador2());
        int divDenominador = (f.getDenominador1()*f.getNumerador2());
        System.out.println("El resultado de la división es: "+divNumerador+"/"+divDenominador);
    }
}
