/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo5;

import java.util.Scanner;

/**
 *
 * @author Facundo
 */
public class Cuenta {
Scanner leer = new Scanner(System.in);

    private int nroCuenta;
    private long dni;
    private int saldo;
    private double interes;
    
    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long dni, int saldo, double interes) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void  crearCuenta(){
        
        
        setNroCuenta((int) (1000000 * Math.random()));
        System.out.println("Su numero de centa es: " + nroCuenta);
        
        System.out.println("ingrese DNI");
        setDni(leer.nextLong());
        
        System.out.println("Deposite su dinero");
        setSaldo(leer.nextInt());
    }
    
    public void ingresar(double ingreso){
     saldo+=ingreso;
     
    }
    
    public void retirar(double retiro){
        if(retiro > saldo){
            setSaldo(0);
            
        }else{
            saldo-=retiro;
        }
    }
    
    public void extraccionRapida(){
        System.out.println("retire hasta un 20% de su sueldo: ");
        int extraccion=leer.nextInt();
        if (extraccion > (saldo*0.2)){
            System.out.println("no puede retirar esa cantidad");
            
        }  else {
            saldo -=extraccion;
            System.out.println("se retiro correctamente");
        }
        
    }
    
    public void consultarSlado(){
        System.out.println("Su saldo es de "+ saldo);
        
        
    }
    
    public void consultarDatos(){
        System.out.println("Cuenta{" + "nroCuenta=" + nroCuenta + ", dni=" + dni + ", saldo=" + saldo + '}');
    }
    
}
