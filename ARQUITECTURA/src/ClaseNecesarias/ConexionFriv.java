/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseNecesarias;

import Conexion.Friv;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class ConexionFriv {
    
    public Friv getInstance(){
        
        Friv f = new Friv() {};
        JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Good", JOptionPane.WARNING_MESSAGE);
        
        return null;
    
    }
    
}
