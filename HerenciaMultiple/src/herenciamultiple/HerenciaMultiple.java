/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciamultiple;

import ico.fes.iu.Miventana;
import ico.fes.programacion.ProfesorDeProgramacion;

/**
 *
 * @author ibiet
 */
public class HerenciaMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProfesorDeProgramacion profe = new ProfesorDeProgramacion(20, "Java");
        profe.comer();
        profe.asistir();
        profe.dictarClase();
        profe.programar();
        profe.probarCodigo();
        
        System.out.println(profe);
        
        Miventana win= new Miventana();
    }
    
}
