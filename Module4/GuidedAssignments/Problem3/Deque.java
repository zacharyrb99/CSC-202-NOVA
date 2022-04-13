public class Deque<T> implements DequeInterface<T> {
    protected LLNode<T> front;     // reference to the front of this queue
    protected LLNode<T> rear;      // reference to the rear of this queue
    protected int size = 0;        // number of elements in this queue

    // constructor
    public Deque() {
        //*** Task #1: implement default constructor
        front = null;
        rear = null;
    }
    
    // Returns true if this queue is empty; otherwise, returns false.
    public boolean isEmpty() {
        //*** Task #2: implement method
        return (front == null);
    }

    // Returns false - a linked queue is never full.
    public boolean isFull() {
        //*** Task #3: implement method
        return false;
    }

    // Returns the number of elements in this queue.
    public int size() {
        return size;
    }


    public void clear() {
        //*** Task #5: implement method
        rear = null;
        while (front != null) {
            front = front.link;
        }
    }

    // insert an element in the beginning
    public void enqueueFront(T element) {
        //*** Task #6: implement method
        LLNode<T> newNode = new LLNode<T>(element, front);

        if (front == null) {
            rear = newNode;
        }

        front = newNode;
        size++;
    }

    // insert an element at the end
    // Throws QueueOverflowException if this queue is full;
    // otherwise, adds element to the rear of this queue.
    public void enqueueRear(T element) {
        //*** Task #7: implement method   
        LLNode<T> newNode = new LLNode<T>(element);
        if (rear == null) {
            front = newNode;
        } else {
            rear.setLink(newNode);
        }

        rear = newNode;
        size++;
    }

    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.
    public T dequeueFront() throws QueueUnderflowException {
        //*** Task #8: implement method
        T toReturn = front.getData();

        if (isEmpty()) {
            throw new QueueUnderflowException("dequeueFront attempted on an empty deque.");
        } else {
            LLNode<T> newFront = new LLNode<T>(front.link.getData(), front.link.link);
            front = newFront;
        }

        size--;
        return toReturn;
    }

    // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes rear element from this queue and returns it.
    public T dequeueRear() throws QueueUnderflowException {
        //*** Task #9: implement method
        T toReturn = rear.getData();
        if (isEmpty()) {
            throw new QueueUnderflowException("dequeueRear attempted on an empty deque.");
        } else {
            LLNode<T> secondLast = front;
            while (secondLast.link.link != null) {
                secondLast = secondLast.link;
            }

            secondLast.link = null;
        }
        
        size--;
        return toReturn;
    }


    // method to check the front element of the queue
    public T peekAtFront() {
        //*** Task #10: implement method
        if(isEmpty()) {
            throw new QueueUnderflowException("underflow exception");
        } else {
            return front.getData();
        }
    }

    // method to check the end element of the queue
    public T peekAtRear() {
        //*** Task #11: implement method
        return rear.getData();
    }

    // method to display the queue, giving a specific message if the queue is empty
    public void display(){
        //*** Task #12: implement method
        // while (front != null) {
        //     System.out.println(front.getData());
        //     front = front.link;
        // }

        LLNode<T> curr = front;
        if(isEmpty()) {
            System.out.println("Deque is empty.");
            return;
        }

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.link;
        }
    }
}
