package Problem1;

public class LinkedCollectionT<T> implements CollectionInterface<T> {
    private LLNode<T> head;
    
    public LinkedCollectionT() {
        this.head = null;
    }

    public LLNode<T> getHead() {
        return head;
    }
   
    public void add(T ele) {
        // *** Student task #1 ***  

        /* 
        Requirements: 
        Theoretically, a linked list node implementation has no capacy limit.
        Because it is unsorted, you may simply append a new element to the end of the collection
    
        *** Enter your code below *** 
        */
        LLNode<T> newNode = new LLNode<T>(ele);
        
        if (isEmpty()) {
            this.head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
            // head.setNext(newNode);
        }
    }

    public int remove(T ele) {
        // *** Student task #2 ***  

        /* 
        Requirements: 
        Removes all elements from this collection such that each of them equals to ele [equals(ele) returns true]
        and returns the number of elements being removed.

        *** Enter your code below *** 
        */
        LLNode<T> prev = new LLNode<T>(null, head);
        LLNode<T> curr = head;  
        int count = 0;

        while (curr != null) {
            LLNode<T> next = curr.getNext();
            if (curr.getData().equals(ele)) {
                count++;
                prev.setNext(next);
            } else {
                prev = curr;
            }

            curr = next;
        }

        return count;
    }
   
    public boolean isFull() {
        // *** Student task #3 ***  

        /* 
        Note: Theoretically, a linked list node implementation has no capacy limit

        *** Enter your code below *** 
        */

        return false;
    }

    public boolean isEmpty() {

        // *** Student task #4 ***  

        /* 
        Requirements: 
        To check if the collection list is empty

        *** Enter your code below *** 
        */

        if (this.head == null) return true;

        return false;
    }

    public int size() {
    
        // *** Student task #5 ***  

        /* 
        Requirements: 
        To return the number of items in the collection list

        *** Enter your code below *** 
        */

        LLNode<T> temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }
   
    public T find(T target) {

        // *** Student task #6 ***  

        /* 
        Requirements: 
        To find and return the first occurance of the target object (compared with equals method), if not found, return null

        *** Enter your code below *** 
        */

        LLNode<T> temp = head;
        while (temp != null) {
            if (temp.getData().equals(target)) return temp.getData();
            temp = temp.getNext();
        }

        return null;
    }
      
    public void sort() {
        //Use quick sort to sort the elmemnts
        //get all elements in the collection and put them into an array,
        //then call quick sort to sort the array. After sorintg restore the collection
        T[] arr = (T[])new Object[size()];
        LLNode<T> tmp = head;

        for(int i = 0; i < arr.length; i++) {
            arr[i]=tmp.getData();
            tmp=tmp.getNext();
        }

        new QuickSort<T>().quickSort(arr);

        //restore the collection;
        head = null;

        for(int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

   public void print() {
      String res = "";
      LLNode<T> tmp = head;

      while(tmp != null) {
         res += tmp.getData().toString()+", ";
         tmp = tmp.getNext();
      }

      if(res.length() > 0) {
         res = res.substring(0, res.length() - 2);
      }

      System.out.println("["+res+"]");
   }
}
