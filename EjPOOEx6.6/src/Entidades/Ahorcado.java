/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author erika
 */
public class Ahorcado {
    private String[] vector;
    private int letrasEncontradas;
    private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vector, int letrasEncontradas, int cantidadJugadas) {
        this.vector = vector;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }
    

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "vector=" + vector + ", letrasEncontradas=" + letrasEncontradas + ", cantidadJugadas=" + cantidadJugadas + '}';
    }
    
    
    
    
}
