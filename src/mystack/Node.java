package mystack;

public class Node<E> {
    private final E value;
    private final Node<E> pred;

    public Node(E value, Node<E> pred) {
        this.value = value;
        this.pred = pred;
    }

    public Node<E> getPred() {
        return this.pred;
    }

    public E getValue() {
        return this.value;
    }
}
