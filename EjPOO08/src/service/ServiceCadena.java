/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Entidad.Cadena;

/**
 *
 * @author Facundo
 */
public class ServiceCadena {

    public int mostrarVocales(Cadena c) {
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {

            switch (c.getFrase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
            }

        }
        return contador;

    }

    public String invertirCadena(Cadena c) {
        String invertida = "";
        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            invertida = invertida.concat(c.getFrase().charAt(i) + "");

        }
        return invertida;
    }

    public int vecesRepetido(char letra, Cadena c) {
        int contador = 0;
        for (int i = 0; i < c.getLongitud(); i++) {

            if (c.getFrase().charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public void compararLongitud(String frase, Cadena c) {
        if (c.getLongitud() < frase.length()) {
            System.out.println("la frase introducida es mas larga por " + (frase.length() - c.getLongitud()) + " letras");
        } else if (c.getLongitud() == frase.length()) {
            System.out.println("las frases tienen la misma longitud");
        } else {
            System.out.println("la primera frase introducida es mas larga por " + (c.getLongitud() - frase.length()) + " letras");
        }
    }

    public String unirFrases(String frase, Cadena c) {
        return c.getFrase().concat(frase);
    }
    
    public String reemplazar(String letra , Cadena c ){
        return c.getFrase().replace('a', letra.charAt(0));
    }
    
    public boolean contiene(String letra , Cadena c){
        return c.getFrase().contains(letra);
    }
}
