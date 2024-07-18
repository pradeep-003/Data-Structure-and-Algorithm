package Stack;

class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;
    DLLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class MiddleElementOfStack_01 {
    DLLNode head;
    DLLNode mid;
    int size;

    void push(int new_data) {
        DLLNode newNode = new DLLNode(new_data);
        if(size == 0) {
            head = newNode;
            mid = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;

            if(size % 2 != 0) {
                mid = mid.prev;
            }
        }

        size++;
    }

    int pop() {
        if(size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        int deletedValue = head.data;

        head = head.next;
        if(head != null) {
            head.prev = null;
        }

        if(size % 2 == 0) {
            mid = mid.next;
        }
        size--;
        return deletedValue;
    }

    DLLNode middleNode() {
        if(size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return mid;
    }

    int deleteMiddleNode( ) {
        if(size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        int ret = mid.data;

        if(size == 1) {
            head = null;
            mid = null;
        } else {
            DLLNode midPrev = mid.prev;
            DLLNode midNext = mid.next;
            if(midPrev != null) {
                midPrev.next = midNext;
            }if(midNext != null) {
                midNext.prev = midPrev;
            }

            if(size % 2 == 0) {
                mid = midNext;
            } else {
                mid = midPrev;
            }
        }

        size--;
        return ret;
    }


        public static void main(String args[])
        {
            MiddleElementOfStack_01 ms = new MiddleElementOfStack_01();
            ms.push(11);
            ms.push(22);
            ms.push(33);
            ms.push(44);
            ms.push(55);
            ms.push(66);
            ms.push(77);
            ms.push(88);
            ms.push(99);

            System.out.println("Popped : " + ms.pop());
            System.out.println("Popped : " + ms.pop());
            System.out.println("Middle Element : "
                    + ms.middleNode().data);
            ms.deleteMiddleNode();
            System.out.println("New Middle Element : "
                    + ms.middleNode().data);
        }
}

