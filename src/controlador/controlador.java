/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.modelo;
import vista.vista;

/**
 *
 * @author alvaro
 */
public class controlador implements ActionListener, MouseListener {

    //instancia a nuestra interfaz
    vista vista;
    
    //instancia al modelo que usaremos
   // modelo modelo=new modelo();
    modelo modelo=new modelo();
    
public controlador (vista vista){
   
    this.vista=vista;
    
    this.vista.setLocationRelativeTo(null);
    
    System.out.println("Construyendo controlador");
    
    
}  

public enum AccionMVC{
    btnAgregar,
    btnMostrar,
    menuGuardar
}

public void iniciar(){
    
    System.out.println("Iniciando");
    
    this.vista.setVisible(true);
    
    this.vista.jButton1.setActionCommand("btnAgregar");
    this.vista.jButton1.addActionListener(this);
    
    this.vista.jButton2.setActionCommand("btnMostrar");
    this.vista.jButton2.addActionListener(this);
    
    this.vista.menuGuardar.setActionCommand("menuGuardar");
    this.vista.menuGuardar.addActionListener(this);
    
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch ( AccionMVC.valueOf(e.getActionCommand()) ){
            
            case btnAgregar:
                
                String nombre = this.vista.txtNombre.getText();
                String apellidos = this.vista.txtApellido.getText();
                String dni = this.vista.txtDni.getText();
                String edad = this.vista.txtEdad.getText();
                
                this.modelo.guardarContacto(nombre, apellidos, dni, edad);
                
                System.out.println("Array Guardado");
                
                this.vista.txtEdad.setText("");
                this.vista.txtApellido.setText("");
                this.vista.txtDni.setText("");
                this.vista.txtNombre.setText("");
                
                break;
                
            case btnMostrar:
                
                this.vista.area.setText(this.modelo.mostrarContactos());
                
                break;
                
            case menuGuardar:
                
                javax.swing.JFileChooser jF1= new javax.swing.JFileChooser(); 
                    
                String ruta = ""; 
                    
                    
                
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        

    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
