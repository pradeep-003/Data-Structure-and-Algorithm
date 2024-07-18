package Queue;

public class Main {
    public static void main(String[] args) {
//        QueueArray newQueue = new QueueArray(3);


//        System.out.println(newQueue.isFull());
//        System.out.println(newQueue.isFull());

//        newQueue.enQueue(1);
//        newQueue.enQueue(2);
//        newQueue.enQueue(3);
//        newQueue.enQueue(4);

//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());

//        System.out.println(newQueue.peek());

//        newQueue.deleteQueue();


        CircularQueue newCQ = new CircularQueue(3);
        System.out.println(newCQ.isEmpty());

        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.enQueue(40);
        System.out.println(newCQ.isFull());

        System.out.println(newCQ.deQueue());
        System.out.println(newCQ.deQueue());
    }
}