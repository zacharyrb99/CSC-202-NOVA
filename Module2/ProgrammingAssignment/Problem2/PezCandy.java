package ProgrammingAssignment.Problem2;

public class PezCandy<T> implements StackInterface<T> {
    protected final int DEFCAP = 100; // default capacity
    protected T[] elements;           // holds stack elements
    protected int topIndex = -1;      // index of top element

    public PezCandy() {
        elements = (T[]) new Object[DEFCAP];
    }

    public PezCandy(int maxSize) {
        elements = (T[]) new Object[maxSize];
    }

    public void push(T el) {
        if (isFull()) {
            throw new StackOverflowException("Push attempted on a full stack.");
        } else {
            topIndex++;
            elements[topIndex] = el;
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        } else {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    public T top() {
        if (isEmpty()) {
            throw new StackUnderflowException("Top attemped on an empty stack.");
        } else {
            return elements[topIndex];
        }
    }

    public int size() {
        int count = 0;

        for (T el : elements) {
            if (el != null) count++;
        }

        return count;
    }

    public boolean isEmpty() {
        return (topIndex == -1);
    }

    public boolean isFull() {
        return (topIndex == (elements.length - 1));
    }

    @Override
    public String toString() {
        int idx = topIndex;
        String str = "Pez container contents: \n";

        while (idx >= 0) {
            str += "\t" + elements[idx] + "\n";
            idx--;
        }

        return str;
    }
}
