/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Francisco Galea
 */
public class ProductoController {
    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
    private static final String usuario = "root";
    private static final String contraseña = "";
    
    public static void insertarProducto(String nombre, String categoria, BigDecimal costo, BigDecimal precio, int stock) {
        
        try(Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)){           
            String consulta = "INSERT INTO mercaderia (nombre, categoria, costo, precio, stock) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, categoria);
            statement.setBigDecimal(3, costo);
            statement.setBigDecimal(4, precio);
            statement.setInt(5, stock);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Producto cargado con exito");
            statement.close();
            conexion.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo falló");
        }
    }
    
    public static DefaultTableModel obtenerProductos() {  
        
        DefaultTableModel modeloTabla = new DefaultTableModel();      
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Categoría");
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Stock");

        try(Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {           
            String consulta = "SELECT * FROM mercaderia";
            try (PreparedStatement statement = conexion.prepareStatement(consulta); ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] fila = {resultSet.getInt("id"),resultSet.getString("nombre"), resultSet.getString("categoria"),resultSet.getBigDecimal("costo"), resultSet.getBigDecimal("precio"), resultSet.getInt("stock")};
                    modeloTabla.addRow(fila);
                }
            }
        }catch (Exception e) {
            
        }
        return modeloTabla;
    }
    
    
    public static void eliminarProductoPorID(int idProducto) {
       

        try(Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            String consulta = "DELETE FROM mercaderia WHERE id = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setInt(1, idProducto);
                statement.executeUpdate();
                                                                                         }
        }catch(Exception e) {
        
                            }
}
    
    public static void actualizarProducto(int idProducto, String nuevoNombre, String nuevaCategoria, BigDecimal nuevoCosto, BigDecimal nuevoPrecio, int nuevoStock) {
 
    try(Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {       
        String consulta = "UPDATE mercaderia SET nombre = ?, categoria = ?, costo = ?, precio = ?, stock = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, nuevoNombre);
            statement.setString(2, nuevaCategoria);
            statement.setBigDecimal(3, nuevoCosto);
            statement.setBigDecimal(4, nuevoPrecio);
            statement.setInt(5, nuevoStock);
            statement.setInt(6, idProducto);
            statement.executeUpdate();
        }
    } catch (SQLException e) {
        
    }
}
   
}
    

       
    








