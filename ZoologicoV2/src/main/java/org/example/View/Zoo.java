package org.example.View;

import org.example.Control.GestionAnimal;
import org.example.View.AnimalCRUD;


public class Zoo {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GestionAnimal gestionAnimalControl = new GestionAnimal();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalCRUD().setVisible(true);
            }
        });
    }
}