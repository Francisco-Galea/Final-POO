/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ProductoDAO {

    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
    private static final String usuario = "root";
    private static final String contraseña = "";

    public static void insertarProducto(Producto producto) {
        try (Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            String consulta = "INSERT INTO mercaderia (nombre, categoria, costo, precio, stock) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setString(1, producto.getNombre());
                statement.setString(2, producto.getCategoria());
                statement.setBigDecimal(3, producto.getCosto());
                statement.setBigDecimal(4, producto.getPrecio());
                statement.setInt(5, producto.getStock());
                statement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al insertar producto en la base de datos");
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

        try (Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            String consulta = "SELECT * FROM mercaderia";
            try (PreparedStatement statement = conexion.prepareStatement(consulta); ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Object[] fila = {resultSet.getInt("id"), resultSet.getString("nombre"), resultSet.getString("categoria"), resultSet.getBigDecimal("costo"), resultSet.getBigDecimal("precio"), resultSet.getInt("stock")};
                    modeloTabla.addRow(fila);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al obtener productos desde la base de datos");
        }
        return modeloTabla;
    }

    public static void eliminarProductoPorID(int idProducto) {
        try (Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            String consulta = "DELETE FROM mercaderia WHERE id = ?";
            try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
                statement.setInt(1, idProducto);
                statement.executeUpdate();
            }
        } catch (Exception e) {
            // Manejar la excepción, por ejemplo, lanzarla o registrarla
        }
    }

    public static void actualizarProducto(Producto producto, int idProducto) {
    try (Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
        String consulta = "UPDATE mercaderia SET nombre = ?, categoria = ?, costo = ?, precio = ?, stock = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getCategoria());
            statement.setBigDecimal(3, producto.getCosto());
            statement.setBigDecimal(4, producto.getPrecio());
            statement.setInt(5, producto.getStock());
            statement.setInt(6, idProducto);
            statement.executeUpdate();
        }
    } catch (Exception e) {
        // Manejar la excepción, por ejemplo, lanzarla o registrarla
    }
}

    // Agrega aquí otros métodos si es necesario, como obtenerIDProductoPorNombre, etc.
}