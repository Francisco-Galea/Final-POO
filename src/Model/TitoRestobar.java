/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import View.MainView;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.SwingUtilities;

/**
 *
 * @author Notebook12
 */
public class TitoRestobar {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        MainView ventanaPrincipal = new MainView();
        ventanaPrincipal.setVisible(true);
    });
    
        String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos.");
            // Realiza operaciones con la base de datos aquí.
            conexion.close(); // Cierra la conexión cuando hayas terminado.
        } catch (Exception e) {
            System.out.println("Fallo al conectar con la base de datos");
        }
    
    
}

    }
    

