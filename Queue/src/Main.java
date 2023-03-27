public class Main {
    public static void main(String [] args){
        Queue queue = new Queue();
        queue.enqueue(61);
        queue.enqueue("Kemal");
        queue.enqueue("Bayram");
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue("Test1");
        System.out.println(queue);
        queue.enqueue("Test2");
        System.out.println(queue);
    }
}
