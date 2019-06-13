package code.challenges401.fifoAnimalShelter;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Meow Meow..my name is " + this.name;
    }
}
