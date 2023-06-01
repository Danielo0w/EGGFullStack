package main;

import entidad.Persona;
import service.ServicioPersona;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        double CMaE = 0, CMeE = 0, CDPI = 0, CPI = 0, CSPI = 0;
        ServicioPersona sp1 = new ServicioPersona(p1);
        sp1.CrearPersona();
        switch (sp1.CalcularIMC()) {
            case -1:
                CDPI++;
                break;
            case 1:
                CSPI++;
                break;
            default:
                CPI++;
                break;
        }
        sp1.MayorDeEdad();
        if (sp1.MayorDeEdad() == false) {
            CMeE++;
        } else {
            CMaE++;
        }
        //sp1.mostrar();
        ServicioPersona sp2 = new ServicioPersona(p2);
        sp2.CrearPersona();
        switch (sp2.CalcularIMC()) {
            case -1:
                CDPI++;
                break;
            case 1:
                CSPI++;
                break;
            default:
                CPI++;
                break;
        }
        if (sp2.MayorDeEdad() == false) {
            CMeE++;
        } else {
            CMaE++;
        }
        //sp2.mostrar();
        ServicioPersona sp3 = new ServicioPersona(p3);
        sp3.CrearPersona();
        switch (sp3.CalcularIMC()) {
            case -1:
                CDPI++;
                break;
            case 1:
                CSPI++;
                break;
            default:
                CPI++;
                break;
        }
        if (sp3.MayorDeEdad() == false) {
            CMeE++;
        } else {
            CMaE++;
        }
        //sp3.mostrar();
        ServicioPersona sp4 = new ServicioPersona(p4);
        sp4.CrearPersona();
        switch (sp4.CalcularIMC()) {
            case -1:
                CDPI++;
                break;
            case 1:
                CSPI++;
                break;
            default:
                CPI++;
                break;
        }
        if (sp4.MayorDeEdad() == false) {
            CMeE++;
        } else {
            CMaE++;
        }
        // sp4.mostrar();
        System.out.println("el porcentaje de personas que estan por encima de su peso es: " + (CSPI * 100) / 4 + "%");
        System.out.println("el porcentaje de personas que estan en su peso es: " + (CPI * 100) / 4 + "%");
        System.out.println("el porcentaje de personas que estan por debajo de su peso es: " + (CDPI * 100) / 4 + "%");
        System.out.println("el porcentaje de personas que son menores de edad es: " + (CMeE * 100) / 4 + "%");
        System.out.println("el porcentaje de personas que son mayores de edad es: " + (CMaE * 100) / 4 + "%");
    }
}
