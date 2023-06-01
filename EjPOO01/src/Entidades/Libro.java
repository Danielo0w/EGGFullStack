/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Facundo
 */
    public class Libro {
    private int ISBN;
    private String título;
    private String autor;
    private int pags;

    public Libro() {
    }

    public Libro(int ISBN, String título, String autor, int pags) {
        this.ISBN = ISBN;
        this.título = título;
        this.autor = autor;
        this.pags = pags;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPags() {
        return pags;
    }

    public void setPags(int pags) {
        this.pags = pags;
    }

    public String setISBN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
