/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad5b;

/**
 *
 * @author Alumnos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            Sensor persona1 = new Sensor();
            persona1.ObtenerAltura(130);
            Sensor persona2 = new Sensor();
            persona2.ObtenerAltura(-3);
        } catch (AlturaExcepcion ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
