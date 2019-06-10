# Stack and Queue

This is an implementation of a Stack and Queue.  Below are a list of the methods

## Challenge

Implements a Stack and a Queue class that both have add methods that all perform in O(1).

## Approach & Efficiency

Approach

The stack is pretty straight forward pushing, popping, peeking from the front.
The queue is slightly different using a back pointer which allows enqueue, dequeue, and peek to be O(1).

Efficiency  

Stack:\
push: T: O(1)\
pop: T: O(1)\
peek: T: O(1)\
isEmpty: T: O(1)\
toString: T: O(n)\
Queue:\
enqueue: T: O(1)\
dequeue: T: O(1)\
peek: T: O(1)\
isEmpty: T: O(1)\
toString: T: O(n)

## API
Stack:\
```void push(int value)``` Takes in a integer value as a parameter and adds it to the stack.\
```<T> pop()``` This function pops off a value from the top of the stack and returns it.\
```<T> peek()``` This function peeks into the top of the stack and returns value that is currently there.\
```boolean isEmpty()``` This function returns true if the stack is empty, otherwise false.\
```String toString()``` Takes in no parameters and returns a String which lists all the nodes in the stack.\
Queue:\
```void enqueue(int value)``` Takes in an integer value as a parameter and adds it to the back of the queue.\
```<T> dequeue()``` This function removes the front node in the queue and returns that value.\
```<T> peek()``` This function peeks into the front of the queue and returns the first next value.\
```boolean isEmpty()``` This function returns true if the queue is empty, otherwise false.\
```String toString()``` Takes in no parameters and returns a String which lists all of the nodes in the queue.
