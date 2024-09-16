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
public class Sensor {
    double altura;
    public void ObtenerAltura(double altura) throws AlturaExcepcion{
        if(altura <0){
            throw new AlturaNegativaException("La altura no puede ser negativa");
        }else if(altura<150){
            throw new AlturaMinimaExcepion("La altura es menor que la altura minima permitida");
        }else if(altura>190){
            throw new AlturaMaximaException("La altura excede la altura maxima permitida");
        }
        this.altura = altura;
    }


    
}
