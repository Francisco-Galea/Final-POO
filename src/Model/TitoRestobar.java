package Model;

import View.MainView;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.SwingUtilities;


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
            System.out.println("Conexion exitosa a la base de datos.");            
            conexion.close(); 
        } catch (Exception e) {
            System.out.println("Fallo al conectar con la base de datos");
        }
    
     
}

    }
    

