package LinkedList;

public class StackBySLL {
    SinglyLinkedList linkedList;

    public StackBySLL(){
        linkedList = new SinglyLinkedList();
    }

    public void push(int value){
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        }else {
            return false;
        }
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }else{
            int store = linkedList.head.value;
            linkedList.deletionOfNode(0);
            return store;
        }
    }

    public int peek() {
        if(isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }else{
            int store = linkedList.head.value;
            return store;
        }
    }

    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted");
    }
}
