/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author alvaro
 */
public class modelo {
    
    ArrayList<persona> lista = new ArrayList<persona>();
    
    public void guardarContacto(String nombre, String apellidos, String dni, String edad){
        
        persona p = new persona(nombre, apellidos, dni, edad);
        lista.add(p);
        
    }
        
    public String mostrarContactos(){
        String area = ""; 
        String area2 = "";
        
        for(int i = 0; i < lista.size(); i++){
            area = (lista.get(i).toString());
            area2 = area2 + "\n" + area;
            
        }
        return area2;
    }
    
    public void borrarArray(){
        
        lista.clear();
        
    }
    
    public void guardarFichero(String nombre) throws IOException {
        
        FileOutputStream fosPer = new FileOutputStream(nombre+".txt");
        ObjectOutputStream oosPer = new ObjectOutputStream (fosPer);
        
        for(int i = 0; i < lista.size(); i++){            
            oosPer.writeObject(lista.get(i));
        }
        fosPer.close();
    }
    
    public void abrirFichero (String nombre) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("Abriendo");

        FileInputStream fisPer = new FileInputStream(nombre+".txt");
        ObjectInputStream oisPer = new ObjectInputStream(fisPer);
        
            persona per = (persona)oisPer.readObject();
            System.out.println(per.toString());
        fisPer.close();
    }
    
}
