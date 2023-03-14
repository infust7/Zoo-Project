/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.example.View;

import org.example.Control.GestionAnimal;
import org.example.View.*;
import org.example.View.MenuNew2;

/**
 *
 * @author jpabl
 */
public class Zoo extends javax.swing.JPanel {

    public static void main(String[] args) {
        GestionAnimal gestionAnimalControl = new GestionAnimal();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuNew2(gestionAnimalControl).setVisible(true);
            }
        });
    }

}
