package GuidedAssignment.Problem3;

/**
* @author EMILIA BUTU
* version 1.0
* since   2020-03
*
* Student name:  xxxxx
* Completion date: xxxx
*
* ImprovedArrayBoundedStack.txt: download and save as 
ImprovedArrayBoundedStack.java
* Tasks are marked throughout the file
*
* Student tasks: complete tasks specified in the file
*
*/

public class ImprovedArrayBoundedStack<T> implements StackInterface<T> {
    protected final int DEFCAP = 100;   // default capacity
    protected T[] elements;             // holds stack elements
    protected int topIndex = -1;        // index of top element in stack

    public ImprovedArrayBoundedStack() {
        elements = (T[]) new Object[DEFCAP];
    }

    public ImprovedArrayBoundedStack(int maxSize) {
        elements = (T[]) new Object[maxSize];
    }

    // Throws StackOverflowException if this stack is full, otherwise places element at the top of this stack
    public void push (T element) {
        if (isFull()) {
            throw new StackOverflowException("Push attempted on a full stack.");
        } else {
            topIndex++;
            elements[topIndex] = element;
        }
    }

    // Throws StackUnderflowException if this stack is empty, otherwise removes top element from this stack.
    public void pop () {
        if (isEmpty()) {
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        } else {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    // Throws StackUnderflowException if this stack is empty, otherwise returns top element of this stack
    public T top() {
        if (isEmpty()) {
            throw new StackUnderflowException("Top attempted on an empty stack.");
        } else {
            return elements[topIndex];
        }
    }

    // Returns true if this stack is empty, otherwise returns false
    public boolean isEmpty() {
        return (topIndex == -1);
    }

    // Returns true if this stack is full, otherwise returns false
    public boolean isFull() {
        return (topIndex == (elements.length - 1));
    }

    //*** Task #1: define and implement method toString()
    //* creates and returns a string that correctly represents the current stack.
    @Override 
    public String toString() {
        int idx = topIndex;
        String str = "The stack contains: \n";

        while (idx >= 0) {
            str += "\t" + elements[idx] + "\n";
            idx--;
        }

        return str;
    }

    //*** Task #2: define and implement method size(): int
    //* returns a count of how many items are currently on the stack.
    public int size() {
        int count = 0;

        for(T el : elements) {
            if (el != null) count++;
        }
        
        return count;
    }

    //*** Task #3: define and implement method popSome(int count): void
    //* removes the top count element from the stack
    public void popSome(int count) {
        // If possible, removes top count elements from stack, otherwise throws StackUnderflowException
        int popCount = 0;

        while (popCount < count) {
            pop();
            popCount++;
        }
    }

    //*** Task #4: define and implement method swapStart(): boolean
    //* If there are less than two elements on the stack returns false
    //* otherwise it reverses the order of the top two elements on the stack and returns true
    public boolean swapStart() {
        if (size() < 2) return false;

        T temp = elements[topIndex];

        elements[topIndex] = elements[topIndex - 1];
        elements[topIndex - 1] = temp;

        return true;
    }

    //*** Task #5: define and implement method poptop(): T
    //* the classic pop operation, if the stack is empty it throws StackUnderflowException
    //* otherwise it both removes and returns the top elements of the stack
    public T poptop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Poptop attempted on an empty stack.");
        } else {
            T topEl = top();
            pop();
            return topEl;
        }
    }
}