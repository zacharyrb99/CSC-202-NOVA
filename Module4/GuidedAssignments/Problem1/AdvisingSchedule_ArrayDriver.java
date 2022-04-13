import java.util.Scanner;

public class AdvisingSchedule_ArrayDriver {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	//*** Task #1: defime a queue with elements of type String using QueueInterface
        
        QueueInterface<String> nameQueue;
        //*** Task #2: instantiate the queue using the constructor that provides the size, using a smaller number for test
		nameQueue = new AdvisingSchedule_Array<String>(5);

		String name="";
    	//*** Task #3: enter the names of students that ask for advising.
    	//* allow the user to terminate the entry
    	//* terminate the loop when the queue is full, and display appropriate message to signal it

		while(!name.equalsIgnoreCase("done")) {
			System.out.print("Enter student name. If you want to finish enter \"done\": ");
			name = scan.nextLine();
			if(!name.equalsIgnoreCase("done")) nameQueue.enqueue(name);

			// test if the queue is full
			if(nameQueue.isFull()) {
				name="done";
				System.out.println("There is no more spot available for advising!");
			}
		}

    	//*** Task #4: identify the number of students in the advising queue and display it

		int noStudents = nameQueue.size();
		System.out.println("Number of students asking for advising: " + noStudents);

    	//*** Task #5: display the list of students presents in the advising queue


		System.out.println("\nScheduled students:\n");

		while (!nameQueue.isEmpty()) {
		    name = nameQueue.dequeue();
		    System.out.println(name);
		}
	}    
}
