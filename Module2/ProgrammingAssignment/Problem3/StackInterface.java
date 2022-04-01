package ProgrammingAssignment.Problem3;

public interface StackInterface<T> {
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.
    void push(T element);
  
    // Throws StackUnderflowException if this stack is empty,
    // otherwise removes top element from this stack.
    void pop() throws StackUnderflowException;
    
    // Throws StackUnderflowException if this stack is empty,
    // otherwise returns top element of this stack.
    T top() throws StackUnderflowException;
    
    // Returns true if this stack is empty, otherwise returns false.
    boolean isEmpty();
}
