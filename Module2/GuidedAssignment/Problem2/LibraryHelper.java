package GuidedAssignment.Problem2;

/**
* @author EMILIA BUTU
* version 1.0
* since   2020-05
*
* Student name:  xxxxx
* Completion date: xxxx
*
* LibraryHelper.txt: save it as LibraryHelper.java
* Implements StackInterface using an array to hold the stack elements.
*
* Two constructors are provided: one that creates an array of a
* default size and one that allows the calling program to
* specify the size.
*
* Student tasks: complete tasks specified in the file
*/

public class LibraryHelper<T> implements StackInterface<T> {
    protected final int DEFCAP = 100; // default capacity
    protected T[] elements;           // holds stack elements
    protected int topIndex = -1;      // index of top element in stack
    
    public LibraryHelper() {
        elements = (T[]) new Object[DEFCAP];
    }

    public LibraryHelper(int maxSize) {
        //*** Task #1: implement this constructor
        elements = (T[]) new Object[maxSize];
    }

    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.
    public void push(T element) {
        //*** Task #2: implement this method throwing the right exception if necessary
        if (isFull()) {
            throw new StackOverflowException("Push attempted on a full stack.");
        } else {
            topIndex++;
            elements[topIndex] = element;
        }
    }

    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    public void pop() {
        //*** Task #3: implement this method throwing the right exception if necessary
        if (isEmpty()) {
            throw new StackUnderflowException("Pop attempted on empty stack.");
        } else {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element of this stack.
    public T top() {
        //*** Task #4: implement this method throwing the right exception if necessary
        if (isEmpty()) {
            throw new StackUnderflowException("Top attempted on empty stack.");
        } else {
            return elements[topIndex];
        }
    }

    // Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty() {
        //*** Task #5: implement this method
        return (topIndex == -1);
    }

    // Returns true if this stack is full, otherwise returns false.
    public boolean isFull() {
        //*** Task #6: implement this method
        return (topIndex == (elements.length - 1));
    }
}