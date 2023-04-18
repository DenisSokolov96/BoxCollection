package mybox;

import java.util.Objects;
import java.util.Random;

public class Box<T> {

    private int count = 0;
    private T[] store;
    private final Random random = new Random();

    @SuppressWarnings("unchecked")
    public Box(int length) {
        this.store = (T[]) new Object[length];
    }

    public void put(T element) {
        if (count == store.length ) throw new IllegalStateException("box is full");
        store[count] = element;
        count++;
    }

    public T get() {
        if (isEmpty()) throw new IllegalStateException("box is empty");
        int iCount = random.nextInt(this.count);
        return store[iCount];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void remove(T element) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            T currentElement = store[i];
            if (Objects.equals(currentElement, element)) {
                index = i;
                break;
            }
        }
        if (index == -1) return;

        @SuppressWarnings("unchecked")
        T[] newStore = (T[]) new Object[store.length];
        System.arraycopy(store, 0, newStore, 0, index);
        System.arraycopy(store, index + 1, newStore, index, count - index);
        count--;
        this.store = newStore;
    }

}



