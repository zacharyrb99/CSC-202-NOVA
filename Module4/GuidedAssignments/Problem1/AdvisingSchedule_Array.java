public class AdvisingSchedule_Array<T> implements QueueInterface<T> {
    protected final int DEFCAP = 10;    // default capacity
    protected T[] elements;             // array that holds queue elements
    protected int numElements = 0;      // number of elements in this queue
    protected int front = 0;            // index of front of queue
    protected int rear;                 // index of rear of queue

    public AdvisingSchedule_Array() {
        elements = (T[]) new Object[DEFCAP];
        rear = DEFCAP - 1;
    }

    public AdvisingSchedule_Array(int maxSize) {
        //*** Task #1: modify the constructor given above to reflect the use of argument for queue size
        elements = (T[]) new Object[maxSize];
        rear = maxSize - 1;
    }

    // Throws QueueOverflowException if this queue is full;
    // otherwise, adds element to the rear of this queue.
    public void enqueue (T element) {
        //*** Task #2: add code here, taking into consideration the exception thrown
        if (isFull()) {
            throw new QueueOverflowException("Enqueue attempted on a full queue.");
        } else {
            rear = (rear + 1) % elements.length;
            elements[rear] = element;
            numElements++;
        }
    }

    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.
    public T dequeue() {
        //*** Task #3: add code here, taking into consideration the exception thrown
        if (isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on empty queue");
        } else {
            T toReturn = elements[front];
            elements[front] = null;
            front = (front + 1) % elements.length;
            numElements = numElements - 1;
            return toReturn;
        }
    }

    // Returns true if this queue is empty; otherwise, returns false.
    public boolean isEmpty() {
        //*** Task #4: add code here
        return (numElements == 0);
    }

    // Returns true if this queue is full; otherwise, returns false.
    public boolean isFull() {
        //*** Task #5: add code here
        return (numElements == elements.length);
    }

    // Returns the number of elements in this queue.
    public int size() {
        //*** Task #6: add code here
        return numElements;
    }
}
