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
public class PuertaEntrada {
    Sensor t;
    public PuertaEntrada(Sensor s) {
        t = s;
    }
    
    public void ajustarAltura(double nuevaAltura){
        try{
            t.ObtenerAltura(nuevaAltura);
            t.setAltura(nuevaAltura);
            System.out.println("Altura deel sensor ajustada a:"+ nuevaAltura);
        }catch(AlturaExcepcion e){
            System.out.println("Error al ajustar la altura del sensor:" + e.getMessage());
        }
    }
   
}
