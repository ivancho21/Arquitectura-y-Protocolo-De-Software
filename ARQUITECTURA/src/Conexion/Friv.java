/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author Ivan
 */
public abstract class Friv {
    
        private static Friv friv;
    
    public Friv getConection(){
    
    if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri = new java.net.URI("https://www.friv.com/");
                desktop.browse(uri);
            }catch(URISyntaxException ex){
            
            }
             catch(IOException ex){
                     }   
        }
        
      } 
        return null;
    }
    
}
