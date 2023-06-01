/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo13;

import entidad.Curso;
import service.ServicioCurso;

/**
 *
 * @author TOSHIBA
 */
public class EJPOO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Curso c = new Curso();
        ServicioCurso sc = new ServicioCurso(c);
        sc.crearCurso();
        sc.calcularGanancia();
        sc.mostrar();
    }

}
