/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.ServicioUsuario;
import Vista.VistaSeccionPublica;
import Vista.VistaLogueo;
import Vista.VistaAgregaUsuario;
import Vista.VistaVuelos;

import Modelo.ModeloUsuario;

import Control.ControlAgregaUsuario;
import Control.ControlUsuario;
import Control.ControlVistaVuelos;
import Control.ControlLogueo;
import Modelo.ModeloLogin;
import Modelo.ModeloSeccionPublica;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
/**
 *
 * @author Fernando
 */
public class ControlSeccionPublica extends AbstractController{

    public ControlSeccionPublica(VistaSeccionPublica vistaSeccionPublica, ModeloSeccionPublica modeloSeccionPublica) {  
        this.vistaSeccionPublica = vistaSeccionPublica;
        this.modeloSeccionPublica = modeloSeccionPublica;
        vistaSeccionPublica.setControlador(this);
     }

   
    public VistaSeccionPublica getVistaSeccionPublica() {
        return vistaSeccionPublica;
    }

   
    public void setVistaSeccionPublica(VistaSeccionPublica vistaSeccionPublica) {
        this.vistaSeccionPublica = vistaSeccionPublica;
    }

 
    public VistaLogueo getVistaLogueo() {
        return vistaLogueo;
    }


    public void setVistaLogueo(VistaLogueo vistaLogueo) {
        this.vistaLogueo = vistaLogueo;
    }


    public VistaAgregaUsuario getVistaAgregaUsuario() {
        return vistaAgregaUsuario;
    }


    public void setVistaAgregaUsuario(VistaAgregaUsuario vistaAgregaUsuario) {
        this.vistaAgregaUsuario = vistaAgregaUsuario;
    }


    public VistaVuelos getVistaVuelos() {
        return vistaVuelos;
    }


    public void setVistaVuelos(VistaVuelos vistaVuelos) {
        this.vistaVuelos = vistaVuelos;
    }
    
    
    public VistaSeccionPublica vistaSeccionPublica;
    public VistaLogueo vistaLogueo;
    public VistaAgregaUsuario vistaAgregaUsuario;
    public VistaVuelos vistaVuelos;

    
    public ControlLogueo controlLogueo;
    public ControlAgregaUsuario controlAgregaUsuario;
    public ControlVistaVuelos controlVuelos;
    
    
    public ServicioUsuario accesoADatosUsuario;
    ModeloSeccionPublica modeloSeccionPublica;
 
    
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        
        if(btn.getText().equalsIgnoreCase("registrarse")) {
            vistaLogueo = new VistaLogueo();
            ModeloLogin modeloLogin = new ModeloLogin();
            ControlLogueo controlLogueo = new ControlLogueo(modeloLogin, vistaLogueo);
            vistaLogueo.setVisible(true);
        }
        
        if(btn.getText().equalsIgnoreCase("Crear cuenta")) {
            System.out.println("Control.ControlSeccionPublica.actionPerformed()");
        
        }
         
        
        if(btn.getText().equalsIgnoreCase("buscar vuelos")) {
            System.out.println("Control.ControlSeccionPublica.actionPerformed()");
        }
          
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ocultarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cerrarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
