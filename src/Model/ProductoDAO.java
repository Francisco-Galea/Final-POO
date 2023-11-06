/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Francisco Galea
 */
public class ProductoDAO {
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar() throws Exception{
        List<Producto> datos = new ArrayList<>();
        String sql = "select * from mercaderia";
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Producto p = new Producto();
                p.setID(rs.getInt(1));
                p.setNombre(rs.getString(2).trim());
                p.setCategoria(rs.getString(3).trim());
                p.setCosto(Float.parseFloat(String.valueOf(rs.getFloat(4)).trim()));
                p.setPrecio(Float.parseFloat(String.valueOf(rs.getFloat(5)).trim()));
                p.setStock(rs.getInt(6));
                datos.add(p);
            }
            return datos;
        }catch(Exception e){
            throw new Exception(e);
        }
                
    }
    
    public int AgregarProducto(Producto p){
        String sql = "insert into mercaderia values (Nombre, Categoria, Costo, Precio, Stock(?,?,?,?,?)";
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ps.setString(1, p.getNombre().trim());
            ps.setString(2, p.getCategoria().trim());
            ps.setFloat(3, p.getCosto());
            ps.setFloat(4, p.getPrecio());
            ps.setInt(5,p.getStock());
       
          }catch(Exception e){
            
        }     
        return 1;
        
    }
}
