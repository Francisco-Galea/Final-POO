/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import View.MainView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import Model.Conexion;
/**
 *
 * @author Notebook12
 */
public class TitoRestobar {

  public static void main(String[] args) {
      
      
    Conexion micon = new Conexion();  
    micon.conexion();
      
    SwingUtilities.invokeLater(() -> {
        MainView ventanaPrincipal = new MainView();
        ventanaPrincipal.setVisible(true);
    });  
    
    
}
}
    

