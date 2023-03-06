package Model;

public class Animal {
    private short age;
    private float size;
    private String name;
    private String species;
    private boolean dangerous;
    private String psychological;
    private String acquisitionMethod;
    private short foodFrequencyPerDay;
    private String allergies;
    private String feeding;

    public Animal(short age, float size, String name, String species, boolean dangerous, String psychological,
            String acquisitionMethod, short foodFrequencyPerDay, String allergies, String feeding) {
        this.age = age;
        this.size = size;
        this.name = name;
        this.species = species;
        this.dangerous = dangerous;
        this.psychological = psychological;
        this.acquisitionMethod = acquisitionMethod;
        this.foodFrequencyPerDay = foodFrequencyPerDay;
        this.allergies = allergies;
        this.feeding = feeding;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public String getPsychological() {
        return psychological;
    }

    public void setPsychological(String psychological) {
        this.psychological = psychological;
    }

    public String getAcquisitionMethod() {
        return acquisitionMethod;
    }

    public void setAcquisitionMethod(String acquisitionMethod) {
        this.acquisitionMethod = acquisitionMethod;
    }

    public short getFoodFrequencyPerDay() {
        return foodFrequencyPerDay;
    }

    public void setFoodFrequencyPerDay(short foodFrequencyPerDay) {
        this.foodFrequencyPerDay = foodFrequencyPerDay;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

}