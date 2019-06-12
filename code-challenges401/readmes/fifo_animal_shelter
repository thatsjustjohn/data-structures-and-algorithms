FIFO Animal Shelter

Animal Shelter Queue

## Challenge

Implement a Animal Shelter class that can enqueue and dequeue new Animals into a queue.  Dequeue should take in a preference and return the animal that has been there the longest.  If no preference is made the longest waiting animal should be returned.

## Approach & Efficiency

Approach

I use 2 queues, one for dogs and cats and each animal is put into the respective queue.
For keeping overall order about the longest there of the 2 most recent animals.  I use a animal ID, which email animal object has.  This animal ID the lower would be the one that has been there longer.

Efficiency

AnimalShelter:\
enqueue: T: O(1)\
dequeue: T: O(1)\

## API
AnimalShelter:\
```void enqueue(Animal animal)``` Takes in an Animal(cat or dog) as a parameter and adds it to the back of the queue.\
```Animal dequeue(String pref)``` This function removes the first prefer animal, if no preference just the first animal.\
```boolean isEmpty()``` This function returns true if the queue is empty, otherwise false.\
