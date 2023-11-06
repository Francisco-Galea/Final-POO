/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.ActionListener;
import Model.Producto;
import Model.ProductoDAO;
import View.ProductoView;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Francisco Galea
 */
public class ProductoController implements ActionListener {

    ProductoDAO dao = new ProductoDAO();
    Producto p = new Producto();
    ProductoView vista = new ProductoView();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnActualizarTabla){
            listar(vista.tableProductos);
        }
    }
    public ProductoController(ProductoView v){
        this.vista = v;
        this.vista.btnActualizarTabla.addActionListener(this);
    }
    public void listar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        List<Producto>lista=dao.listar();
        Object[]object=new Object[4];
        for(int i = 0 ; i < lista.size(); i++){
            object[0] = lista.get(i).getID();
            object[1] = lista.get(i).getNombre();
            object[2] = lista.get(i).getCategoria();
            object[3] = lista.get(i).getCosto();
            object[4] = lista.get(i).getPrecio();
            object[5] = lista.get(i).getStock();
            modelo.addRow(object);
        }
        vista.tableProductos.setModel(modelo);
    }
}
