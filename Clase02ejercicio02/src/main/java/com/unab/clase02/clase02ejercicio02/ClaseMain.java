/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.clase02ejercicio02;

/**
 *
 * @author USUARIO
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor profe = new Profesor("Marlon", "Agua Fria", "22/09/2000", "Masculino", 19, "Ingeniero", "docente");
        System.out.println(profe.toString());
        
        Estudiante est = new Estudiante("Jenny", "Chalatenango", "14/11/94", "Femenino", 28, 1500, "Ing. Sistemas y Computacion");
        
        System.out.println(est.toString());
    }
    
}
