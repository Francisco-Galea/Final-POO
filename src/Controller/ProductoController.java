/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author Francisco Galea
 */
public class ProductoController {
    public static void insertarProducto(String nombre, String categoria, float costo, float precio, int stock) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);
            String consulta = "INSERT INTO mercaderia (nombre, categoria, costo, precio, stock) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, categoria);
            statement.setDouble(3, costo);
            statement.setDouble(4, precio);
            statement.setInt(5, stock);
            statement.executeUpdate();

            System.out.println("Producto creado en la base de datos.");
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}







