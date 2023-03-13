package org.example.Utility;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class GestionFicheros {

    public GestionFicheros() {
        File rootFile = new File("ZOO/");
    }

    public void createDir(String path) {
        File newDir = new File("Zoo/" + path);
        if (newDir.exists()) {
            System.out.println("Carpeta ya existe");
            return;
        }
        if (!newDir.mkdirs()) {
            System.out.println("No se ha podido crear la carpeta");
            return;
        }
        System.out.println("Carpeta creada");
    }

    public void createFile(String filename) {
        File newDir = new File("Zoo/" + filename);
        if (newDir.exists()) {
            System.out.println("Archivo ya existe");
            return;
        }
        try {
            if (newDir.createNewFile()) {
                System.out.println("Archivo creado");
                return;
            }
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo");
        }
    }
}
