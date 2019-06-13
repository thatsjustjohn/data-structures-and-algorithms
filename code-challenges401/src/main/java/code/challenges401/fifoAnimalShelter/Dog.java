package code.challenges401.fifoAnimalShelter;

public class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Woof Woof..my name is " + this.name;
    }
}
