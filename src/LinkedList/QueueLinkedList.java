package LinkedList;


public class QueueLinkedList {
    SinglyLinkedList list;
    public QueueLinkedList() {
        list = new SinglyLinkedList();
        System.out.println("The Queue is successfully created");
    }

    public boolean isEmpty() {
        if(list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted "+value+" in the queue");
    }

    public int deQueue(){
        int value = -1;
        if(isEmpty()) {
            System.out.println("The Queue is is Empty");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    public int peek() {
        int value = -1;
        if(isEmpty()) {
            System.out.println("The Queue is is Empty");
        } else {
            value = list.head.value;
        }
        return value;
    }

    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue is successfully deleted");
    }
}
