package ProgrammingAssignment.Problem3;

public class ExamPaperStack<T> implements StackInterface<T> {
    private Node top;

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() { return data; }
        public void setData(T data) { this.data = data; }
        public Node getNext() { return next; }
        public void setNext(Node next) { this.next = next; }
    }

    public void push(T data) {
        Node tempNode = new Node(data);
        tempNode.next = top;
        top = tempNode;
    }

    public void pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Pop attempted on empty stack.");
        } else {
            top = top.next;
        }
    }

    public T top() {
        if (isEmpty()) {
            throw new StackUnderflowException("Top attempted on empty stack.");
        } else {
            return top.data;
        }
    }

    public T poptop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Poptop attempted on empty stack.");
        } else {
            T topVal = top();
            pop();
            return topVal;
        }
    }

    public int size() {
        Node curr = top;
        int count = 0;
        
        while (curr != null) {
            count ++;
            curr = curr.next;
        }

        return count;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public String toString() {
        Node curr = top;
        String str = "";

        while (curr != null) {
            str += curr.data + " " + "\n";
            curr = curr.next;
        }

        return str;
    }
}
