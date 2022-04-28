package Problem4;

public class DoublyLinkedList<String> {
    // define ListNode elements specific for this type of list, indicating current, previous and next
	  // consider head as name for previous node, and tail for the next one.
    private ListNode<String> head;
    private ListNode<String> current;
    private ListNode<String> tail;

    // default constructor
    public DoublyLinkedList() {
		    //*** Task #1: implement a default constructor here, initializing the nodes to null
        head = null;
        current = null;
        tail = null;
    }

	  // method that calculates the length of the list
    public int length() {
		    //*** Task #2: implement the method navigating through the list until you run out of elements
        int count = 0;

        if (head == null) return count;

        while (current != null) {
            count++;
            current = current.getLink();
        }

        return count;
    }

	  // method that adds a node at the beginning of the list
    public void addANodeToStart(String addData) {
		    //*** Task #3: implement this method, taking into consideration that the head will be replaced by a new node. You may want to use a temporary variable
        ListNode tmp = new ListNode(addData, head, null);
        
        if (head != null ) {
            head.setPrevious(tmp);
        }
        
        head = tmp;

        if (tail == null) { 
            tail = tmp;
        }

        resetIteration();
    }

	  // accessor method that gets data at current node
    public String getDataAtCurrent() {
		    // Task #4: implement this method making sure to take into account the situation when 
		    // there current doesn't point to any data (is null)

        if (current == null) {
            String nullCurrent = (String)"Current doesn't exists.";
            return nullCurrent;
        } else {
            return current.getData();
        }
    }

	  // method that sets the current node in the beginning, reseting the iteration
    public void resetIteration() {
		    //*** Task #5: implement the body of the method
        current = head;
    }

	  // method that checks if there is more to interate in the list
    public boolean moreToIterate() {
		    //*** Task #6: implement the body of the method
        return current != tail;
    }

	  // method that moves the node to the next position, if possible
    public void goToNext() {
		    //*** Task #7: implement the method taking into account the situation when the list is empty
		    // check if there are other instances when the move is not possible.
        if (current.getLink() == null) {
            System.out.println("You are at the end of the list.");
        } else {
            current = current.getLink(); 
        }
    }

	  // method that resets the reverse iteration, setting the current node to the last one
    public void resetIterationReverse() {
		    //*** Task #8: implement the body of the method
        current = tail;
    }

	  // method that facilitates the move in the reverse directions, redirecting the node to previous
    public void goToPrevious() {
		    //*** Task #9: implement this method in a similar way the goToNext() method
        // make sure to have the right links for the reverse navigations
        if (current.getPrevious() == null) {
            System.out.println("You are at the beginning of the list.");
        } else {
            current = current.getPrevious();
        }
    }

    /*
     Method that inserts node with newData after the current node.
     Note: The current node is the same after invocation as it is before invocation.
     Should not be used with an empty list.
     Should not be used when the current node has iterated past the entire list.
    */
    public void insertNodeAfterCurrent(String newData) {
		    //*** Task #10: implement this method, making sure to observe the ideas noted above
        if (head == null) {
            System.out.println("List is empty.");
        } else if (current == tail) {
            System.out.println("You are at the end of the list.");
        } else {
            ListNode<String> newNode = new ListNode<>(newData, current, current.getLink());
            current.getLink().setPrevious(newNode);
            current.setLink(newNode);
        }
    }

    /*
     Method that deletes the current node. After the invocation,
     the current node is the node after the
     deleted node or null if there is no next node.
    */
    public void deleteCurrentNode() {
		    //*** Task #11: implement this method, making sure to observe the ideas noted above
        if (current.getLink() == null) {
            System.out.println("No node after current node.");
            return;
        } else if (current == head) {
            deleteHeadNode();
            return;
        }

        current = current.getLink();
        current.getPrevious().getPrevious().setLink(current);
    }

	  // method that deletes the head node.
    public void deleteHeadNode() {
		    //*** Task #12: implement this method
        head = head.getLink();
    }

    // Searches list for element containing target data.
    // If target is found, current is set to point at it,
    // and the function returns true.
    // If target is not found, current is set to null
    // and the function returns false.
    public boolean findInList(String target) {
	      //*** Task #13: implement this method, making sure to observe the ideas noted above
        if (head == null) return false;

        while (current != null) {
            if (current.getData() == target) return true;
            current = current.getLink();  
        }

        current = null;
        return false;
	  }

    public boolean onList(String target) {
		    //*** Task #14: implement this method
        if (head == null) return false;

        ListNode<String> tmp = head;
        while (tmp != null) {
            if (tmp.getData() == target) return true;
            tmp = tmp.getLink();  
        }

        return false;
    }

    private ListNode<String> Find(String target) {
		    //*** Task #15: implement this method
        if (head == null) return new ListNode<String>();

        ListNode<String> tmp = head;
        while (tmp != null) {
            if (tmp.getData() == target) return tmp;
            tmp = tmp.getLink();  
        }

        return new ListNode<String>();
    }

	  // meethod that displays the list
    public void showList() {
		    //*** Task #16: irrespective of navigation through the list, the display remains the same
        // start from the head and move through the list to show all elements.
        if (head == null) System.out.println("List is empty.");

        ListNode<String> tmp = head;
        System.out.print("[");

        while (tmp != null) {
            if (tmp.getLink() == null) {
                System.out.print(tmp.getData());
            } else {
                System.out.print(tmp.getData() + ", ");
            }

            tmp = tmp.getLink();
        }

        System.out.print("]\n");
    }

    // Method useful during testing and debugging, that allows control over the nodes.
    public void showListState() {
        System.out.println("Head: " + (head == null ? "null" : head.data)
                           + " Current: " + (current == null ? "null" : current.data)
                           + " Tail: " + (tail == null ? "null" : tail.data)
                           + " " + length() + " items");
    }

	  // inner class for ListNode
    public class ListNode<String> {
		    // instance variables
        private String data;
        private ListNode<String> link;
        private ListNode<String> previous;

		    // constructor - default
        public ListNode(){
            //*** Task #17: implement this constructor
            data = null;
            link = null;
            previous = null;
        }

		    // constructor, fully defining the list
        public ListNode(String newData, ListNode<String> linkValue, ListNode<String> previousValue) {
		        //*** Task #18: implement this constructor
            data = newData;
            link = linkValue;
            previous = previousValue;
        }

		    // mutator for data
        public void setData(String newData) {
	    	    //*** Task #19: implement this method
            data = newData;
		    }
		
        // accessor for data
        public String getData() {
		        //*** Task #20: implement this method
            return data;
		    }

		    // mutator for the node
        public void setLink(ListNode<String> newLink) {
		        //*** Task #21: implement this method
            link = newLink;
		    }

	    	// mutator for the previous node
        public void setPrevious(ListNode<String> newPrevious) {
	    	    //*** Task #22: implement this method
            previous = newPrevious;
		    }

		    // accessor for the current node
        public ListNode<String> getLink() {
		        //*** Task #23: implement this method
            return link;
		    }

        // accessor for the previous node
        public ListNode<String> getPrevious() {
            //*** Task #24: implement this method
            return previous;
        }
    }
}
