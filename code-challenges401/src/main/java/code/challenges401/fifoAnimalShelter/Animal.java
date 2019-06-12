package code.challenges401.fifoAnimalShelter;

public class Animal {
    String name;
    int id;

    Animal(String name){
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hi my name is " + name;
    }
}
