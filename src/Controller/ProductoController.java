/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
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
    
    public static DefaultTableModel obtenerProductos() {
        DefaultTableModel modeloTabla = new DefaultTableModel();

        String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
        String usuario = "root";
        String contraseña = "";

        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Categoría");
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Stock");

        try {
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);
            String consulta = "SELECT * FROM mercaderia";
            try (PreparedStatement statement = conexion.prepareStatement(consulta); ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] fila = {resultSet.getString("nombre"), resultSet.getString("categoria"),
                        resultSet.getFloat("costo"), resultSet.getFloat("precio"), resultSet.getInt("stock")};
                    modeloTabla.addRow(fila);
                }
            }
        } catch (Exception e) {
            
        }

        return modeloTabla;
    }
    
}







