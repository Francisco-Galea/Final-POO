

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.ProductoController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class ProductoView extends javax.swing.JFrame {
    
   
    public ProductoView() {  
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modeloTabla = new DefaultTableModel();
        
     
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        btnActualizarTabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearProducto.setText("Crear Producto");
        btnCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        lblProductos.setText("Ingrese un Producto");

        lblNombre.setText("Nombre");

        lblCategoria.setText("Categoria");

        lblCosto.setText("Costo");

        lblPrecio.setText("Precio");

        lblStock.setText("Stock");

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoria", "Costo", "Precio", "Stock", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductos.setShowGrid(true);
        jScrollPane1.setViewportView(tableProductos);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnActualizarTabla.setText("Actualiza tabla");
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCategoria, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnModificarProducto)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnActualizarTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProductos)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//-------------------------------------- INICIO CODIGO DE BOTONES Y OTRAS COSAS ------------------------------------------------------    
    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MainView newframe = new MainView();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    
    
    private void btnCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProductoActionPerformed
         
        String nombre = txtNombre.getText();
        String categoria = txtCategoria.getText();
        float costo = Float.parseFloat(txtCosto.getText());
        float precio = Float.parseFloat(txtPrecio.getText());
        int stock = Integer.parseInt(txtStock.getText());

    // Llama al controlador para insertar el producto
        ProductoController.insertarProducto(nombre, categoria, costo, precio, stock);
        
    }//GEN-LAST:event_btnCrearProductoActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
      
        DefaultTableModel modeloTabla = ProductoController.obtenerProductos();
        tableProductos.setModel(modeloTabla);
   
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        
        
            int filaSeleccionada = tableProductos.getSelectedRow();
            if (filaSeleccionada != -1) {
                int idProducto = (int) tableProductos.getValueAt(filaSeleccionada, 0); 
                ProductoController.eliminarProductoPorID(idProducto);

            
                DefaultTableModel modeloTabla = (DefaultTableModel) tableProductos.getModel();
                modeloTabla.removeRow(filaSeleccionada);
                                        }
                                                    

    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        
        int filaSeleccionada = tableProductos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idProducto = (int) tableProductos.getValueAt(filaSeleccionada, 0);
            String nombre = (String) tableProductos.getValueAt(filaSeleccionada, 1);
            String categoria = (String) tableProductos.getValueAt(filaSeleccionada, 2);
            float costo = (float) tableProductos.getValueAt(filaSeleccionada, 3);
            float precio = (float) tableProductos.getValueAt(filaSeleccionada, 4);
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
                float nuevoCosto = Float.parseFloat(costoField.getText());
                float nuevoPrecio = Float.parseFloat(precioField.getText());
                int nuevoStock = Integer.parseInt(stockField.getText());
            
            ProductoController.actualizarProducto(idProducto, nuevoNombre, nuevaCategoria, nuevoCosto, nuevoPrecio, nuevoStock);    
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    
        }
        }
    
    
    
    
    
    
    
    
//-------------------------------------- FIN CODIGO DE BOTONES Y OTRAS COSAS ------------------------------------------------------    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTabla;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
