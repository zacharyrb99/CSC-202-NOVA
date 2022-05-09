package Problem2;

import java.util.Random;

public class Random10k {
    public static void main(String[] args) {
        Random rand = new Random();
		//*** Task #1: declare a variable pq of PriQueueInterface type, and instantiate it as
		//		SortedABPriQ, in which you insert the elements in increasing order
        PriQueueInterface pq = new SortedABPriQ<>();
		//*** Task #2: declare a variable rpq of PriQueueInterface type, and instantiate it as
		//		SortedABPriQ, in which you insert the elements in decreasing order1
        PriQueueInterface rpq = new SortedABPriQ<>();

	    Integer n = 0;
        for (int i = 0; i < 100; i++) {
            //*** Task #3: assign a random integer between 1 and 10000 to n
            n = rand.nextInt(10000) + 1;

            //*** Task #4: add the element to pq using the regular enqueue
            pq.enqueue(n);

            //*** Task #5: add the element to rpq using the renqueue method
            rpq.renqueue(n);
        }

            //*** Task #6: display the priority queue with elements in increasing order
        System.out.println("Priority Queue: ");

        System.out.println(pq.toString());
            //*** Task #7: display size of priority queue pq
        System.out.println("Size: ");
        System.out.println(pq.size());
        System.out.println();
        System.out.println("Priority Queue in Reverse Order:");
            //*** Task #8: display the priority queue with elements in decreasing order
        System.out.println(rpq);
            //*** Task #9: display size of priority queue pq

    }
}
