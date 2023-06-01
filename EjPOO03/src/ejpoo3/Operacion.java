/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo3;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Operacion {
Scanner leer = new Scanner(System.in);

    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese dos numeros a operar:");
    
        setNum1(leer.nextDouble());
        setNum2(leer.nextDouble());
    }
    
    public void sumar(){
        System.out.println("La suma de los numeros es: "+ (num1+num2));
    }
    
    public void restar(){
        System.out.println("La resta de los numeros es: "+ (num1-num2));
    }
    
    public void multiplicar(){
        if (num1 == 0 || num2==0){
            System.out.println("La multiplicacion por cero siempre es 0");
        } else {
            System.out.println("La multiplicacion de los numeros es: "+ (num1*num2));
        }
    }
    
    public void dividir(){
        if (num2 == 0){
            System.out.println("Error: no se puede dvidir entre cero");
        }else {
            System.out.println("La divicion de los numeros es: "+ (num1/num2));
        }
    } 
}
