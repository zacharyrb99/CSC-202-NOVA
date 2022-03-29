package GuidedAssignment.Problem2;

/**
* StackInterface.java
* Interface for a class that implements a stack of <T>.
* A stack is a last-in, first-out structure.
*/

public interface StackInterface<T> {
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.
    void push(T element) throws StackOverflowException;
  
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    void pop() throws StackUnderflowException;
  
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element of this stack.
    T top() throws StackUnderflowException;
  
    // Returns true if this stack is empty, otherwise returns false.
    boolean isEmpty();
  
    // Returns true if this stack is full, otherwise returns false.
    boolean isFull();
}