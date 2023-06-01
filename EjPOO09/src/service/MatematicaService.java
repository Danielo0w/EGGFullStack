/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.lang.Math;
import entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class MatematicaService {

    Scanner leer = new Scanner(System.in);

    public int devolverMayor(Matematica m) {
        if (m.getNum1() > m.getNum2()) {
            return (int) m.getNum1();
        } else {
            return (int) m.getNum2();
        }
    }

    public int devolverMenor(Matematica m) {
        if (m.getNum1() < m.getNum2()) {
            return (int) m.getNum1();
        } else {
            return (int) m.getNum2();
        }
    }
    public double calculcarPotencia(Matematica m) {
        double potencia;
        potencia = Math.pow(m.getNum1(),m.getNum2());
        return potencia;
        
    }

    public double calcularRaiz (Matematica m){
        double aux ; 
        aux = Math.abs(Math.min(m.getNum1(),m.getNum2()));
        return Math.sqrt(aux);
    }
}
