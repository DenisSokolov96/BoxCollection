import mybox.Box;
import mystack.ArrayStack;
import mystack.LinkedStack;

public class Main {
    public static void main(String[] args) {

        startBox();
        stackLinked();
        stackArray();
    }

    public static void startBox() {

        System.out.println("/****************  Start Box Collection  ****************\\");

        Box<Integer> box = new Box<>(5);
        box.put(3);
        box.put(4);
        box.put(7);
        box.put(5);
        System.out.println("Получен элемент : " + box.get());
        box.remove(3);
        System.out.println("Получен элемент : " + box.get());
        if (box.isEmpty()) System.out.println("пустая");
        else System.out.println("не пустая");
        System.out.println(box.size());

        System.out.println("/********************************************************\\");
        System.out.println();
    }
    public static void stackLinked() {

        System.out.println("/****************  Start LinkedStack  ****************\\");

        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        linkedStack.push(12);
        linkedStack.push(56);
        linkedStack.push(5);
        System.out.println("Получен элемент : " + linkedStack.pop());
        if (linkedStack.empty()) System.out.println("пустой");
        else System.out.println("не пустой");
        System.out.println("Верхушка стека : " + linkedStack.peek());

        System.out.println("/*****************************************************\\");
    }

    public static void stackArray() {

        System.out.println("/****************  Start LinkedStack  ****************\\");

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(12);
        arrayStack.push(56);
        arrayStack.push(5);
        System.out.println("Получен элемент : " + arrayStack.pop());
        if (arrayStack.empty()) System.out.println("пустой");
        else System.out.println("не пустой");
        System.out.println("Верхушка стека : " + arrayStack.peek());

        System.out.println("/*****************************************************\\");
    }
}