package org.example.Control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.example.Model.Animal;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class GestionAnimal {
    String filePath = "animals.json";
    File animalsRecord = new File(filePath);
    JSONObject animalsObject = new JSONObject();
    JSONArray animalsArrayJSON = new JSONArray();
    ArrayList<Animal> animalsArray = new ArrayList();

    public GestionAnimal() {
        checkFile();
        animalsObject.put("Animales", this.animalsArrayJSON);
    }

    public void checkFile() {
        if (animalsRecord.exists()) {
            System.out.println("Ya existe");
        } else {
            createFile();
        }
    }

    public void createFile() {
        try {
            if (animalsRecord.createNewFile()) {
                System.out.println("Arhivo creado, debido a que no existia");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error creando el archivo" + animalsRecord.getName());
        }
    }

    public void createAnimal(String name) {
        this.animalsArray.add(new Animal(10,12,name,"Caballus",true,"no dangerous","born",3,"none","vegetables"));
        this.animalsArrayJSON.add(this.animalsArray.get((this.animalsArray.size() -1)).getJSON());
        this.insertAnimalInFile(this.animalsArray.get((this.animalsArray.size() -1)));
        System.out.println("Nuevo animal añadido");
    }
    public void insertAnimalInFile(Animal animal){
        try (FileWriter animalsRecordWrite = new FileWriter(filePath)) {
            animalsRecordWrite.write(this.animalsObject.toString());
            animalsRecordWrite.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public void deleteAnimal() {

    }

    public void updateAnimal() {

    }

    public void readAnimalFromFile() {
    }

    public void readAnimalByParams() {
    }
}
