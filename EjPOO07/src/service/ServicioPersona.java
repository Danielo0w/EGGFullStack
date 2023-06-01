package service;

import entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {

    private Persona p;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ;

    public ServicioPersona() {
    }

    public ServicioPersona(Persona p) {
        this.p = p;
    }

    public void CrearPersona() {
        boolean aux = false;
        System.out.println("Ingrese el nombre: ");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad: ");
        p.setEdad(leer.nextInt());

        do {
            System.out.println("Ingrese el sexo (H = hombre / M = mujer / O = otro): ");
            p.setSexo(leer.next());
            if (p.getSexo().length() == 1) {
                aux = true;
            }
        } while (!p.getSexo().equalsIgnoreCase("H") && !p.getSexo().equalsIgnoreCase("M") && !p.getSexo().equalsIgnoreCase("O") || (aux == false));

        System.out.println("Ingrese el peso ( kg ): ");
        p.setPeso(leer.nextInt());
        System.out.println("Ingrese la altura en metros (m): ");
        p.setAltura(leer.nextDouble());

    }

    public int CalcularIMC() {
        double pesoIdeal = p.getPeso() / (Math.pow(p.getAltura(), 2));
        if (pesoIdeal < 20) {
            return -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean MayorDeEdad() {
        if (p.getEdad() < 18) {
            return false;
        } else {
            return true;
        }
    }

    public void mostrar() {
        System.out.println(p.toString());
    }
}
