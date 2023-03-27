public class Queue <T> {
    private Node head;

    public boolean init(T data){
        if(this.head == null){
            Node node = new Node(data);
            this.head = node;
            return true;
        }
        return false;
    }

    public boolean enqueue(T data){
        if(this.head != null){
            Node node = new Node(data);
            node.setNext(this.head);
            this.head = node;
        }
        this.init(data);
        return true;
    }

    public T dequeue(){
        if(this.head != null){
            if(this.head.getNext() != null){
                Node previousNode = this.head;
                Node currentNode = this.head;
                while (currentNode.getNext() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
                previousNode.setNext(null);
                return (T) previousNode.getData();
            }
            else {
                T data = (T) this.head.getData();
                this.head = null;
                return data;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder response = new StringBuilder();
        int indexCounter = 1;
        Node currentNode = this.head;
        while (currentNode != null){
            response.append("[" + indexCounter + "] - " +  currentNode.getData().toString() + " => ");
            currentNode = currentNode.getNext();
            indexCounter++;
        }
        return response.substring(0, response.length() - 4);
    }
}
