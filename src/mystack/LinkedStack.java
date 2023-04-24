package mystack;

import mystack.interfaces.Stack;
import java.util.EmptyStackException;

public class LinkedStack<E> implements Stack<E> {

    private int size = 0;
    private Node<E> top;

    @Override
    public void push(E element) {
        this.top = new Node<>(element, this.top);
        size++;
    }

    @Override
    public E pop() {
        if (empty()) throw new EmptyStackException();
        E value = this.top.getValue();
        this.top = this.top.getPred();
        size--;
        return value;
    }

    @Override
    public E peek() {
        if (empty()) throw new EmptyStackException();
        return this.top.getValue();
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

}
