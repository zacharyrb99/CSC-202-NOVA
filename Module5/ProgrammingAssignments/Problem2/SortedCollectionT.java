package Problem2;

public class SortedCollectionT<T> implements SortedCollectionInterface<T> {
    private LLNode<T> head;
    
    public SortedCollectionT() {
        head = null;
    }

    public LLNode<T> getHead() {
        return head;
    }
    
    public void add(T ele) {
        // *** Student task #1 ***  

        /* 
        Requirements: 
        If the collection is full then double the array size before adding
        However, theoretically, a linked list node implementation has no capacy limit.
        In this implementation, duplicate elements are not allowed

        *** Enter your code below *** 
        */

        if (find(ele) != null) {
            System.out.println("Cannot add duplicates.");
            return;
        }

        if (isEmpty()) { 
            this.head = new LLNode<T>(ele);
            return;
        }

        LLNode<T> temp = head;
        
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        
        temp.setNext(new LLNode<T>(ele));
    }
    
    public void remove(T ele) {
        // *** Student task #2 ***  

        /* 
        Requirements: 
        Removes the element e from this collection such that e.equals(ele)

        *** Enter your code below *** 
        */

        LLNode<T> prev = new LLNode<T>(null, head);
        LLNode<T> curr = head;

        while (curr != null) {
            LLNode<T> next = curr.getNext();
            if (curr.getData().equals(ele)) {
                prev.setNext(next);
            } else {
                prev = curr;
            }

            curr = next;
        }
    }
    
    public boolean isFull() {//theoretically, a linked list node implementation has no capacy limit
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        LLNode<T> tmp = head;
        int count = 0;
        while(tmp != null) {
            tmp=tmp.getNext();
            count++;
        }
        return count;
    }
    
    public T find(T ele) {
        LLNode<T> tmp = head;
        while(tmp != null) {
            if(tmp.getData().equals(ele))
                return tmp.getData();
            tmp = tmp.getNext();
        }
        return null;
    }
    
    public void print() {
        String res = "";
        LLNode<T> tmp = head;
        while(tmp != null) {
            res += tmp.getData().toString() + ", ";
            tmp = tmp.getNext();
        }
        if(res.length() > 0){
            res = res.substring(0, res.length() - 2);
        }
        System.out.println("[" + res + "]");
    }
}