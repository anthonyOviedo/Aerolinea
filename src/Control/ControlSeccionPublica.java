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
import java.awt.event.ActionEvent;
import javax.swing.JButton;
/**
 *
 * @author Fernando
 */
public class ControlSeccionPublica {

   
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
    
    
    public ControlSeccionPublica(VistaSeccionPublica vistaSeccionPublica) {
        this.vistaSeccionPublica = vistaSeccionPublica;
        vistaSeccionPublica.setControlador(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        
        if(btn.getText().equalsIgnoreCase("btnRegistrarse")) {
            vistaLogueo = new VistaLogueo();
            accesoADatosUsuario = new ServicioUsuario();
            //controlLogueo = new ControlLogueo(vistaLogueo);
            //controlLogueo.getVistaLogueo().setVisible(true); 
        }
        
        if(btn.getText().equalsIgnoreCase("btnCrearCuenta")) {

        }
         
          
    }
    
    
}
