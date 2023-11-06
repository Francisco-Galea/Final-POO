/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
/**
 *
 * @author Francisco Galea
 */
public class Conexion {
    
    String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
    String usuario = "root";
    String contraseña = "";   
    
    Connection con;   
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(jdbcUrl,usuario,contraseña);  
            System.out.println("ESTA CONECTADO");
            
            
        }catch(Exception e){
            System.out.println("Error al conectar a la base");
        }
        
        return con;
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
