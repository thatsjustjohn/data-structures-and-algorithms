package code.challenges401.queueWithStacks;

import code.challenges401.stacksandqueues.Stack;

import java.util.EmptyStackException;

public class PseudoQueue<T> {
    Stack<T> enqueueStack;
    Stack<T> dequeueStack;

    public PseudoQueue(){
        enqueueStack = new Stack();
        dequeueStack = new Stack();
    }

    public void enqueue(T value){
        enqueueStack.push(value);
    }

    public T dequeue(){
        if(dequeueStack.isEmpty()){
            if(!enqueueStack.isEmpty()){
                stackToQueue();
            }else throw new EmptyStackException();
        }
        return dequeueStack.pop();
    }

    public T peek(){
        if(dequeueStack.isEmpty()){
            if(!enqueueStack.isEmpty()){
                stackToQueue();
            }else throw new EmptyStackException();
        }
        return dequeueStack.peek();
    }

    public boolean isEmpty(){
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    private void stackToQueue(){
        while(!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
    }
}
