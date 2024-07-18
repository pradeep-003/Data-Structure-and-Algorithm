package Queue;

public class QueueArray {
    int []arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    public boolean isFull() {
        if(topOfQueue == arr.length-1) {
            return true;
        } else {
            return false;
        }
    }

    // isEmpty
    public boolean isEmpty() {
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue (int value) {
        if(isFull()) {
            System.out.println("The Queue is Full!");
        } else if (isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+ value+ " int the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted "+ value+ " int the queue");
        }
    }


    public int deQueue() {
        if(isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty");
            return -1;
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue is successfully deleted!");
    }
}


