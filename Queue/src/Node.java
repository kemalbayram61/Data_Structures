public class Node <T>{
    private T data;
    private Node Next;

    public Node(T data){
        this.data = data;
    }

    public Node(){}

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}
