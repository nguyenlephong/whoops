package ds.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class DSStack<T> {
    private List<T> stack;

    public DSStack() {
        stack = new ArrayList<T>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        return stack.remove(stack.size() - 1);
    }

    public T peek(){
        if(isEmpty()) throw new EmptyStackException();
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void clear() {
        stack.clear();
    }

    @Override
    public String toString() {
        return stack.toString();
    }

}