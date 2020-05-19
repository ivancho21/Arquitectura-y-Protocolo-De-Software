/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.io.IOException;
import java.net.URISyntaxException;

public class Discord {
    
    private static Discord discord;
    
    public Discord getInstance(){
    
    if(java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
                java.net.URI uri = new java.net.URI("https://www.discord.com/");
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
