package code.challenges401.fifoAnimalShelter;

import code.challenges401.stacksandqueues.Queue;

public class AnimalShelter {
    Queue<Animal> dogQueue;
    Queue<Animal> catQueue;
    int id = 1;

    AnimalShelter(){
        dogQueue = new Queue<>();
        catQueue = new Queue<>();
    }

    public void enqueue(Animal animal){
        animal.id = id++;
        if(animal instanceof Dog){
            dogQueue.enqueue(animal);
        }else{
            catQueue.enqueue(animal);
        }
    }

    public Animal dequeue(String pref){
        if(isEmpty()){
            return null;
        }
        if(pref == "Dog"){
            return dogQueue.isEmpty() ? null : dogQueue.dequeue();
        }else if(pref == "Cat"){
            return catQueue.isEmpty() ? null : catQueue.dequeue();
        }else if(pref == "" || pref == null){
            // test is empties
            if(dogQueue.isEmpty() || catQueue.isEmpty()){
                return dogQueue.isEmpty() ? catQueue.dequeue() : dogQueue.dequeue();
            }
            return dogQueue.peek().id < catQueue.peek().id ? dogQueue.dequeue() : catQueue.dequeue();
        }
        return null;
    }

    public boolean isEmpty(){
        if(dogQueue.isEmpty() && catQueue.isEmpty()){
            return true;
        }
        return false;
    }
}
