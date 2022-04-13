public class DequeDriver {
    public static void main(String[] args) {
        //*** Task #1: object of type Dequeue and instantiate it with integers
		Deque dq = new Deque<Integer>();
		// work with random numbers between 1 to 100
		// perform a number of dequeue operations
		int value;

		//*** Task #2: perform insert at front followed by insert at rear three times

		for(int i = 0; i < 3; i++)
		{
			value=(int)(Math.random() * 100 + 1);
			dq.enqueueFront(value);
			value=(int)(Math.random() * 100 + 1);
			dq.enqueueRear(value);

		}
		System.out.println("Dequeue after inserting elements at front and at rear three times is: ");
		
		//*** Task #2: display dequeue
		dq.display();
		System.out.println("Size: " + dq.size());
		System.out.println();

		// *** Task #3: delete at front
		System.out.println(dq.dequeueFront() + " removed from front of queue");
		System.out.println("New queue is: ");
		
		//*** Task #4: display dequeue
		dq.display();
		System.out.println("Size: " + dq.size());
		System.out.println();

		//*** Task #5: delete at rear
		System.out.println(dq.dequeueRear() + " removed from rear of queue");
		System.out.println("New queue is: ");
		dq.display();
		System.out.println("Size: " + dq.size());
		System.out.println();

		//*** Task #6: display dequeue
		dq.display();
		System.out.println();
		//*** Task #7: display value at front
		System.out.println("Element at front is: " + dq.peekAtFront());

		//*** Task #8: display value at rear
		System.out.println("Element at rear is: " + dq.peekAtRear());

		//*** Task #9: display size
		System.out.println("Size of dequeue is: " + dq.size());

		//*** Task #10: check if queue is empty

		System.out.println("Dequeue is an empty queue is a " + dq.isEmpty() + " statement!");

		//*** Task #11: clear dequeue and display message to announcing the operation
		dq.clear();
		System.out.println("Dequeue has just been cleared!");
		//*** Task #12: display resulting dequeue
		dq.display();
    }
}
