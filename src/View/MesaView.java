package View;

import Controller.MesaController;
import Model.Mesa;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

public class MesaView extends javax.swing.JFrame {

    private List<Mesa> mesasCreadas = new ArrayList<>();
    private List<Mesa> mesasActivas = new ArrayList<>();

    public MesaView() {
    initComponents();
    
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);     
        jPanel1.setLayout(new GridBagLayout());
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCrearMesa = new javax.swing.JButton();
        BtnEliminarMesa = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnCrearMesa.setText("Crear mesa");
        BtnCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearMesaActionPerformed(evt);
            }
        });

        BtnEliminarMesa.setText("Eliminar mesa");
        BtnEliminarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarMesaActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar mesa");

        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCrearMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnEliminarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminarMesa)
                    .addComponent(BtnCrearMesa)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//-------------------------------------- INICIO CODIGO DE BOTONES Y OTRAS COSAS ------------------------------------------------------
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MainView newframe = new MainView();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed

private void BtnCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {
    MesaController mesaController = new MesaController();
    int idMesaInsertada = mesaController.obtenerIdMesaDesdeBaseDeDatos() + 1;
    Mesa mesa = new Mesa(idMesaInsertada, mesasCreadas.size() + 1, true);
    
    mesasCreadas.add(mesa);
    mesasActivas.add(mesa);
    System.out.println("Mesa creada y agregada a la lista. ID: " );
    
    mesaController.crearMesaEnBD(mesa);
    System.out.println("Mesa insertada en la base de datos. ID: " );

    PanelMesa panelMesa = new PanelMesa(mesa);
    jPanel1.add(panelMesa);
    System.out.println("PanelMesa creado y agregado a la vista.");
    
    jPanel1.revalidate();
    jPanel1.repaint();
    System.out.println("Vista actualizada.");
}

/*
    private void BtnCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearMesaActionPerformed
        
       
    }//GEN-LAST:event_BtnCrearMesaActionPerformed
*/ /*
    private void BtnEliminarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarMesaActionPerformed
*/
private void BtnEliminarMesaActionPerformed(java.awt.event.ActionEvent evt) {
    if (!mesasActivas.isEmpty()) {
        Mesa mesaAEliminar = mesasActivas.get(mesasActivas.size() - 1);
        MesaController mesaController = new MesaController();
        int idMesaAEliminar = mesaAEliminar.getIdMesa();
        
        System.out.println("Eliminando mesa con ID: " + idMesaAEliminar);
        
        mesaController.eliminarMesaEnBD(idMesaAEliminar);
        System.out.println("Mesa con ID " + idMesaAEliminar + " eliminada de la base de datos.");

        mesasCreadas.remove(mesaAEliminar);
        mesasActivas.remove(mesaAEliminar);
        System.out.println("Mesa eliminada de la lista. Mesas activas restantes: " + mesasActivas.size());

        jPanel1.revalidate();
        jPanel1.repaint();
        System.out.println("Vista actualizada.");
    }

    }//GEN-LAST:event_BtnEliminarMesaActionPerformed

    
    
    
    
    
    
    
   
    
    
//-------------------------------------- FIN CODIGO DE BOTONES Y OTRAS COSAS ------------------------------------------------------    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MesaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearMesa;
    private javax.swing.JButton BtnEliminarMesa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}
