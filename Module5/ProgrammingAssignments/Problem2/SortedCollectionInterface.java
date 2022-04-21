package Problem2;

public interface SortedCollectionInterface<T> {
    //Add an element to the collection
    void add(T ele);
   
    // Returns the first element e inn the collection such that
    // e.equals(ele) returns true; if no such element found, return null
    T find(T ele);
    
    // Removes the element e from this collection such that e.equals(ele)
    void remove(T ele);
    
    // Returns true if this collection is full; otherwise, returns false.  
    boolean isFull();
    
    // Returns true if this collection is empty; otherwise, returns false.
    boolean isEmpty();
    
    // Returns the number of elements in this collection.
    int size();
    
    // Print all elements
    void print();
}
