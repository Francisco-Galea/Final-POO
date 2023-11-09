package Controller;

import Model.Producto;
import Model.ProductoDAO;
import java.awt.GridLayout;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
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

    public static void modificarProductoDesdeTabla(int filaSeleccionada, JTable tableProductos) {
        
        int idProducto = (int) tableProductos.getValueAt(filaSeleccionada, 0);
        String nombre = (String) tableProductos.getValueAt(filaSeleccionada, 1);
        String categoria = (String) tableProductos.getValueAt(filaSeleccionada, 2);
        BigDecimal costo = (BigDecimal) tableProductos.getValueAt(filaSeleccionada, 3);
        BigDecimal precio = (BigDecimal) tableProductos.getValueAt(filaSeleccionada, 4);
        int stock = (int) tableProductos.getValueAt(filaSeleccionada, 5);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        JTextField nombreField = new JTextField(nombre);
        JTextField categoriaField = new JTextField(categoria);
        JTextField costoField = new JTextField(String.valueOf(costo));
        JTextField precioField = new JTextField(String.valueOf(precio));
        JTextField stockField = new JTextField(String.valueOf(stock));

        panel.add(new JLabel("Nombre:"));
        panel.add(nombreField);
        panel.add(new JLabel("Categoría:"));
        panel.add(categoriaField);
        panel.add(new JLabel("Costo:"));
        panel.add(costoField);
        panel.add(new JLabel("Precio:"));
        panel.add(precioField);
        panel.add(new JLabel("Stock:"));
        panel.add(stockField);

        int opcion = JOptionPane.showConfirmDialog(null, panel, "Editar Producto", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            String nuevoNombre = nombreField.getText();
            String nuevaCategoria = categoriaField.getText();
            BigDecimal nuevoCosto = new BigDecimal(costoField.getText());
            BigDecimal nuevoPrecio = new BigDecimal(precioField.getText());
            int nuevoStock = Integer.parseInt(stockField.getText());
           
            ProductoDAO.actualizarProducto(new Producto(nuevoNombre, nuevaCategoria, nuevoCosto, nuevoPrecio, nuevoStock), idProducto);
                                              }
    }
    
}