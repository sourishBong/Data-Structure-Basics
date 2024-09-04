package reverse.k.elements.with.queue;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> stack_list;
    private int stack_size;

    public MyStack() {
        stack_list = new ArrayList<>();
        stack_size = 0;
    }

    public boolean isEmpty() {
        return stack_size == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null; // or throw an exception
        }
        return stack_list.get(stack_size - 1);
    }

    public int size() {
        return stack_size;
    }

    public void push(T value) {
        stack_list.add(value);
        stack_size++;
    }

    public T pop() {
        if (isEmpty()) {
            return null; // or throw an exception
        }
        T top = stack_list.remove(stack_size - 1);
        stack_size--;
        return top;
    }
}