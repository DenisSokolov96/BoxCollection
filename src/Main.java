import mybox.Box;
import mystack.LinkedStack;

public class Main {
    public static void main(String[] args) {

        startBox();
        task4();

    }

    public static void startBox() {

        System.out.println("/****************  Task №3  ****************\\");

        Box<Integer> box = new Box<Integer>(5);
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

        System.out.println("/*******************************************\\");
        System.out.println();
    }
    public static void task4() {

        System.out.println("/****************  Task №4  ****************\\");

        LinkedStack<Integer> linkedStack = new LinkedStack<Integer>();
        linkedStack.push(12);
        linkedStack.push(56);
        linkedStack.push(5);
        System.out.println("Получен элемент : " + linkedStack.pop());
        if (linkedStack.empty()) System.out.println("пустой");
        else System.out.println("не пустой");
        System.out.println(linkedStack.peek());

        System.out.println("/*******************************************\\");
    }
}