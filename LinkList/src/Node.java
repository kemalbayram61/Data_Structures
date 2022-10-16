public class Node<T> {
    public Node next;
    public Node previous;
    public T data;

    public Node(T data){
        this.data = data;
    }
}
