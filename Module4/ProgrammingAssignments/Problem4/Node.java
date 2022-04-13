public class Node {
    Stock data;
    Node next;

    public Node(Stock data) {
        this.data = data;
        this.next = null;
    }

    public Node(Stock data, Node next) {
        this.data = data;
        this.next = next;
    }
}
