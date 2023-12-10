/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicacionpoo;

import java.util.Scanner;

/**
 *
 * @author angela
 */
public class Padre {
    
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String ocupacion;
    
    
    public Padre(){}
    
    public Padre(String apellido){
        this.apellido= apellido;
    }
    public Padre(int id,String nombre, String apellido, int edad ,String ocupacion ){
        
        this.id = id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.ocupacion=ocupacion;
    
    
    }
    

//Commportamientos o metodos
    public void crearPadre(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Esriba el id del apdre");
        id= entrada.nextInt();
        System.out.println("Esriba el id del apdre");
        nombre= entrada.nextLine();
        entrada.skip("\n");
        System.out.println("Esriba el id del apdre");
        apellido= entrada.nextLine();
         entrada.skip("\n");
        System.out.println("Esriba el id del apdre");
        edad= entrada.nextInt();
        System.out.println("Esriba el id del apdre");
        ocupacion= entrada.nextLine();
         entrada.skip("\n");
    }
    public void verPadre(){
            System.out.println("id: "+id+"\n"+
                    "Nombre: "+ nombre+ "\n"+
                    "Apellido: "+ nombre+ "\n"+
                    "Edad: "+ nombre+ "\n"+
                    "Ocupacion: "+ nombre+ "\n"
            
            
            
            
            );
    }
    //Getter y Setter
    public void setNombre(String nombre){
        this.nombre = nombre;
        
    
    }
     public String getNombre(){
        return this.nombre;
        
    
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @return the edadString ocupacion
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the ocupacion
     */
    public String getOcupacion() {
        return ocupacion;
    }
         
}
