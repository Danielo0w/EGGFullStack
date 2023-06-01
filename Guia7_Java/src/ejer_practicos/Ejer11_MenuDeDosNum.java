/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejer_practicos;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Ejer11_MenuDeDosNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese 2 numeros");
        int n1=leer.nextInt(),n2=leer.nextInt();
        char r;
        boolean l=false;
        do{
            System.out.println("segun el siguiente menu elija sus opciones");
            System.out.println("MENU");
            System.out.println("1-SUMAR");    
            System.out.println("2-RESTAR");   
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("5-SALIR");
            byte s=leer.nextByte();
            switch(s){
                case 1:
                    System.out.println("el resultado es "+(n1+n2));
                    break;
                case 2:
                    System.out.println("el resultado es "+(n1-n2));
                    break;
                case 3:
                    System.out.println("el resultado es "+(n1*n2));
                    break;    
                case 4:
                    System.out.println("el resultado es "+(n1/n2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    r=leer.next().charAt(0);
                    if(r=='s'){
                        l=true;
                        break;        
                    }
                default:
                    System.out.println("numero incorrecto");
                    break;
            }
        }while(l==false);
        }
  
}

