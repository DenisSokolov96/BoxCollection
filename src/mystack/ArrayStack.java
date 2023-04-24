package mystack;

import mystack.interfaces.Stack;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {

    private int size = 0;
    private E[] store;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        this.store = (E[]) new Object[size];
    }

    @Override
    public void push(E element) {
        if (size < store.length) {
            store[size] = element;
            size++;
            return;
        }
        @SuppressWarnings("unchecked")
        E[] newStore = (E[]) new Object[store.length + 1];
        System.arraycopy(store, 0, newStore, 0, store.length);
        this.store = newStore;
        this.store[size] = element;
        size++;
    }

    @Override
    public E pop() {
        if (empty()) throw new EmptyStackException();
        E value = store[size - 1];
        size--;
        return value;
    }

    @Override
    public E peek() {
        if (empty()) throw new EmptyStackException();
        return store[size - 1];
    }

    @Override
    public boolean empty() {
        return size == 0;
    }
}
