/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class ServicioCurso {

    private Curso c;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ServicioCurso() {
    }

    public ServicioCurso(Curso c) {
        this.c = c;
    }

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese nombre del alumno" + (i + 1));
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public void crearCurso() {

        System.out.println("ingrese el nombre del curso: ");
        c.setNombreCurso(leer.next());
        System.out.println("ingrese el turno (mañana/tarde): ");
        c.setTurno(leer.next());
        System.out.println("ingrese la cantidad de horas por dia: ");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana: ");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hora: ");
        c.setPrecioHora(leer.nextInt());
        c.setAlumnos(this.cargarAlumnos());

    }

    public void calcularGanancia() {
        double ganancia = c.getCantidadHorasPorDia() * c.getCantidadDiasPorSemana() * c.getPrecioHora() * c.getAlumnos().length;
        System.out.println("total de ganancias: " + ganancia);
    }

    public void mostrar() {
        //System.out.println(c.toString());
        System.out.println("curso: " + c.getNombreCurso());
        System.out.println("turno: " + c.getTurno());
        System.out.println("horas: " + c.getCantidadHorasPorDia());
        System.out.println("dias: " + c.getCantidadDiasPorSemana());
        System.out.println("precio: " + c.getPrecioHora());

        for (int i = 0; i < c.getAlumnos().length; i++) {
            System.out.println("alumno " + (i + 1) + " " + c.getAlumnos()[i]);
        }
    }

}
