package Problem2;

public class LLNode<T> {
    private T data;
    private LLNode<T> next;

    public LLNode(T data) {
        setData(data);
        setNext(null);
    }

    public LLNode(T data, LLNode<T> next) {
        setData(data);
        setNext(next);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LLNode<T> getNext() {
        if (next != null) return next;
        
        return null;
    } 

    public void setNext(LLNode<T> next) {
        this.next = next;
    }
}
