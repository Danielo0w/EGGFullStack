/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author TOSHIBA
 */
public class Movil {
    private String marca;
    private int precio;
    private String modelo;
    private int memoriaRAM;
    private int almacenamiento;
    int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, int precio, String modelo, int memoriaRAM, int almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRAM=" + memoriaRAM + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }
   
}
