/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import explicacionpoo.Padre;

/**
 *
 * @author angela
 */
public class TestTrabajador {
    public static void main(String[] args) {
        Trabajador profesor = new Trabajador();
        
        profesor.setNombre("Bernandini"); 
        profesor.apellido = "Lopez";
        profesor.edad = 24;
        profesor.direccion= "Calle 6";

        Trabajador conserje = new Trabajador();
        
         //conserje.nombre= "Carlos";
        conserje.apellido = "Colorado";
        conserje.edad = 24;
        conserje.direccion= "Calle 7";
        
        
        Trabajador cosinera = new Trabajador();
        //cosinera.nombre= "Juana";
        cosinera.apellido = "Romero";
        cosinera.edad = 29;
        cosinera.direccion= "Calle 8";
        
        System.out.println(profesor.getNombre());
       // System.out.println(conserje.nombre);
        //System.out.println(cosinera.nombre);
        
        
        
        
        
      
        
        
        
   
        
    }
}
