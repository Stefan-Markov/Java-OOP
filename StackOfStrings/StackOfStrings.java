package StackOfStrings;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StackOfStrings {
    private int lastElementIndex;
    private ArrayList<String> data;

    public StackOfStrings(ArrayList<String> stack) {
        this.data = stack;
        this.lastElementIndex = -1;
    }

    public void push(String element) {
        this.lastElementIndex++;
        this.data.add(element);
    }

    public String pop() {
        ensureNonEmpty(lastElementIndex);
        return this.data.remove(lastElementIndex--);
    }

    public String peek() {
        ensureNonEmpty(lastElementIndex);
        return this.data.get(lastElementIndex);
    }

    public void ensureNonEmpty(int lastElementIndex) {
        if (this.lastElementIndex < 0) {
            throw new NoSuchElementException("No element");
        }
    }
}
