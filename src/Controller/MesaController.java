/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Mesa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class MesaController {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bd_titobar";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";

public void crearMesaEnBD(Mesa mesa) {
        Connection conexion = null;
        PreparedStatement statement = null;

        try {
            String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
            String usuario = "root";
            String contraseña = "";

            conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            String sql = "INSERT INTO mesa (numeroMesa, activo) VALUES (?, ?)";
            statement = conexion.prepareStatement(sql);
            statement.setInt(1, mesa.getNumeroMesa());
            statement.setBoolean(2, mesa.isActivo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

  public void eliminarMesaEnBD(int idMesa) {
    Connection conexion = null;
    PreparedStatement statement = null;

    try {
        String jdbcUrl = "jdbc:mysql://localhost:3306/bd_titobar";
        String usuario = "root";
        String contraseña = "";

        conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

        String sql = "DELETE FROM mesa WHERE idMesa = ?";
        statement = conexion.prepareStatement(sql);
        statement.setInt(1, idMesa); // Utiliza el idMesa para eliminar la mesa
        statement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (statement != null) {
                statement.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
  public int obtenerIdMesaDesdeBaseDeDatos() {
        int idMesa = -1; // Valor por defecto si no se encuentra ningún ID

        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            conexion = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            String sql = "SELECT MAX(idMesa) FROM mesa";
            statement = conexion.prepareStatement(sql);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                idMesa = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idMesa;
    }
  
}