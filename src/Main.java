//#3
public class Main {
    public static void main(String[] args) {
        QueueStacks.QueueUsingStacks queue = new QueueStacks.QueueUsingStacks(5);


        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);


        System.out.println("Dequeued item: " + queue.dequeue());


        System.out.println("Front item: " + queue.peek());
    }
}
