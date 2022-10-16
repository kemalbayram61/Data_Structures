public class LinkList<T> {
    Node head;

    public void push(T data){
        Node newNode = new Node(data);
        if(this.head != null){
            this.head.previous = newNode;
        }
        newNode.next = this.head;
        this.head = newNode;
    }

    public void append(T data){
        Node newNode = new Node(data);
        if (this.head == null){
            this.head = newNode;
        }
        else {
            Node tempNode = this.head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    public T pop(){
        if(this.head.next != null){
            Node tempNode = this.head;
            while (tempNode.next.next != null){
                tempNode = tempNode.next;
            }
            T data = (T)tempNode.next.data;
            tempNode.next = null;
            return data;
        }
        else {
            T data = (T) this.head.data;
            this.head = null;
            return data;
        }
    }

    public void print(){
        Node tempNode = this.head;
        while (tempNode != null){
            System.out.println(tempNode.data.toString());
            tempNode = tempNode.next;
        }
    }

}
