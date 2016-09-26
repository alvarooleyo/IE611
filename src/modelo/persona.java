/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */


public class persona {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String edad;

    
public persona(){
    
    

}

public persona (String nombre, String apellidos, String dni, String edad){
    
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.dni=dni;
    this.edad=edad;
    
}

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        
        String pers = "Nombre: "+getNombre()+" Apellidos: "+getApellidos()+" DNI: "+getDni()+" Edad: "+getEdad();
       
        return pers;
    }
    
}
