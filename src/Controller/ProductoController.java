package Controller;


import Model.Producto;
import Model.ProductoDAO;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductoController {

    public static void insertarProducto(String nombre, String categoria, BigDecimal costo, BigDecimal precio, int stock) {
        Producto nuevoProducto = new Producto(nombre, categoria, costo, precio, stock);
        ProductoDAO.insertarProducto(nuevoProducto);
        JOptionPane.showMessageDialog(null, "Producto cargado con éxito");
    }

  public static DefaultTableModel obtenerProductos() {
    return (DefaultTableModel) ProductoDAO.obtenerProductos();
}
    public static void eliminarProductoPorID(int idProducto) {
        ProductoDAO.eliminarProductoPorID(idProducto);
    }

    public static void actualizarProducto(int idProducto, String nuevoNombre, String nuevaCategoria, BigDecimal nuevoCosto, BigDecimal nuevoPrecio, int nuevoStock) {
        Producto productoActualizado = new Producto(nuevoNombre, nuevaCategoria, nuevoCosto, nuevoPrecio, nuevoStock);
        ProductoDAO.actualizarProducto(productoActualizado, idProducto);
    }
}
    

       
    








