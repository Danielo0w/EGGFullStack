/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);
    int year, month, day;

    public Persona CrearPersona() {
        Persona p1 = new Persona();

        System.out.print("Nombre: ");
        p1.setNombre(leer.nextLine());

        System.out.print("Año de nacimiento: ");
        year = leer.nextInt();

        System.out.print("Mes de nacimiento: ");
        month = leer.nextInt();

        System.out.print("Día de nacimiento: ");
        day = leer.nextInt();

        Date fecha = new Date((year - 1900), (month - 1), day);
        p1.setNacimiento(fecha);

        return p1;
    }

    public int CalcularEdad(Persona p1) {

        Date fechaActual = new Date();
        int edad = (fechaActual.getYear() - p1.getNacimiento().getYear());

        if (fechaActual.getMonth() < p1.getNacimiento().getMonth()) {
            edad--;
        } else if (fechaActual.getMonth() == p1.getNacimiento().getMonth()) {
            if (fechaActual.getDate() < p1.getNacimiento().getDate()) {
                edad--;
            }
        }

        return edad;
    }

    public boolean MenorQue(int edad2, Persona p1) {

        int edad1 = CalcularEdad(p1);

        return edad1<edad2;
    }
}
