package Problem1;

public interface CollectionInterface<T> {
    // Add an element to the collection
    void add(T ele);

    // Add an element in the index location
    // if index > number of element of the collection, then append the ele to the collection
    // void add(T ele, int index);

    // Returns an element e from this collection such that e.equals(ele)
    // If no such element exists, returns null
    T get(T ele);

    // Returns the (index + 1)th element in the collection
    // If index < 0 or index >= the number of elements in this collection, returns null
    // T get(int index);

    // Returns true if this collection contains an element e such that e.equals(ele) return true, otherwise returns false
    boolean contains(T ele);

    // Removes all elements from this collection such that each of them equals ele [equals(ele) returns true]
    // and returns the number of elements being removed
    int remove(T ele);

    // Removes the element at index position, if index<size() returns true after removing, otherwise, returns false
    boolean remove(int index);
    
    // returns index of the first element e such that e.equals(ele) returns true
    // If no such element exists, returns -1
    int indexOf(T ele);
   
    // Returns true if this collection is full; otherwise, returns false.
    boolean isFull();
   
    // Returns true if this collection is empty; otherwise, returns false.
    boolean isEmpty();
    
    // Returns the number of elements in this collection.
    int size();
   
    // Print all elements
    void print();    
}
