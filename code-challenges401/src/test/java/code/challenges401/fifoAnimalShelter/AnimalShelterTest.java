package code.challenges401.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void test_enqueue() {
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Cat("josie"));
        as.enqueue(new Cat("herman"));
        as.enqueue(new Dog("Charlie"));
        as.enqueue(new Dog("Leo"));
        as.enqueue(new Cat("Simon"));

        assertEquals("Charlie",
                as.dogQueue.peek().name);
        assertEquals("josie",
                as.catQueue.peek().name);
    }

    @Test
    public void test_dequeue_empty() {
        AnimalShelter as = new AnimalShelter();
        assertNull(as.dequeue(""));
    }

    @Test
    public void test_dequeue_invalid() {
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Cat("josie"));
        assertNull(as.dequeue("snake"));
    }

    @Test
    public void test_enqueue_dequeue() {
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Cat("josie"));
        as.enqueue(new Cat("herman"));
        as.enqueue(new Dog("Charlie"));
        as.enqueue(new Dog("Leo"));
        as.enqueue(new Cat("Simon"));

        assertEquals("Woof Woof..my name is Charlie",
                as.dequeue("Dog").toString());
        assertEquals("josie",
                as.catQueue.peek().name);
    }

    @Test
    public void test_enqueueCatDog_dequeueDog() {
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Cat("josie"));
        as.enqueue(new Dog("Charlie"));
        assertEquals("Woof Woof..my name is Charlie",
                as.dequeue("Dog").toString());
    }

    @Test
    public void test_enqueueCat_dequeueDog() {
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Cat("josie"));
        as.enqueue(new Cat("herman"));
        assertNull(as.dequeue("Dog"));
    }

    @Test
    public void test_enqueue_dequeue_noPref() {
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Cat("josie"));
        as.enqueue(new Cat("herman"));
        as.enqueue(new Dog("Charlie"));
        as.enqueue(new Dog("Leo"));
        as.enqueue(new Cat("Simon"));

        assertEquals("Meow Meow..my name is josie",
                as.dequeue("").toString());

    }
}