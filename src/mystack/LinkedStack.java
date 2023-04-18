package mystack;

public class LinkedStack<E> implements Stack<E>{

    private E element;
    private LinkedStack<E> next;
    private LinkedStack<E> prev;

    @Override
    public void push(E element) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }
}
