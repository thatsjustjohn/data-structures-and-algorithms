PseudoQueue, A Queue with 2 Stacks.

This is an implementation of a Queue using 2 Stacks.

## Challenge

Implements a Queue only using 2 Stacks.

## Approach & Efficiency

Approach

Using 1 stack for enqueue and 1 stack for dequeue.  When dequeue is empty pop from enqueue and push to dequeue.

Efficiency

PseudoQueue:\
enqueue: T: O(1)\
dequeue: T: O(1) Amortized\
peek: T: O(1) Amortized\
isEmpty: T: O(1)

## API
PseudoQueue:\
```void enqueue(<T> value)``` Takes in an integer value as a parameter and adds it to the back of the queue.\
```<T> dequeue()``` This function removes the front node in the queue and returns that value.\
```<T> peek()``` This function peeks into the front of the queue and returns the first next value.\
```boolean isEmpty()``` This function returns true if the queue is empty, otherwise false.\
