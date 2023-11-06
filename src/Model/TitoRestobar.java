/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import View.MainView;
import javax.swing.SwingUtilities;

/**
 *
 * @author Notebook12
 */
public class TitoRestobar {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        MainView ventanaPrincipal = new MainView();
        ventanaPrincipal.setVisible(true);
    });  
}
    }
    

