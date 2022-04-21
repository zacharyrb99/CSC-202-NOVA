package Problem1;

public interface CollectionInterface<T> {
    // Add an element to the collection
    void add(T ele);

    // Returns the first element e in the collection such that e.equals(ele) returns true. if not element is found returns false
    // T find(T ele);

    // Removes all elements from this collection such that each of them equals to ele [equals(ele) returns true]
    // and returns the number of elements being removed
    // int remove(T ele);

    // Returns true if this collection is full; otherwise, returns false
    boolean isFull();

    //Returns true if this collection is empty; otherwise, returns false
    boolean isEmpty();

    // Returns the number of elements in this collection
    int size();

    // Sorts elements
    void sort();

    // Print all elements
    void print();
}
