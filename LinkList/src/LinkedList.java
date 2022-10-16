public class LinkedList<T> {
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

    public void print(){
        Node tempNode = this.head;
        while (tempNode != null){
            System.out.println(tempNode.data.toString());
            tempNode = tempNode.next;
        }
    }

}
