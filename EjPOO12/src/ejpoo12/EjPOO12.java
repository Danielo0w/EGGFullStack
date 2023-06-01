
package ejpoo12;

import entidad.Persona;
import java.util.Scanner;
import service.PersonaService;

public class EjPOO12 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        PersonaService s1 = new PersonaService();
        Persona p1 = s1.CrearPersona();

        int edad = s1.CalcularEdad(p1);
        System.out.println("La edad de " + p1.getNombre() + " es: " + edad);

        System.out.println("¿Qué edad quieres comparar?");
        boolean b1 = s1.MenorQue((leer.nextInt()), p1);

        System.out.println("¿Es la edad de " + p1.getNombre() + " menor en comparación?");
        System.out.println(b1);
    }

}