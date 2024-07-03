package LinkedList;

public class Main {
    public static void main(String[] args) {

/*
        SinglyLinkedList sLL = new SinglyLinkedList();
        Node head = sLL.createSinglyLinkedList(5);
        System.out.println(head.value);
        sLL.insertInLinkedList(6,0);
        sLL.insertInLinkedList(7,3);
        sLL.insertInLinkedList(8,5);
        sLL.insertInLinkedList(9,6);
        sLL.insertInLinkedList(10,7);
        System.out.println(sLL.head.value);
        System.out.println(sLL.head.next.value);
        System.out.println(sLL.head.next.next.value);
        System.out.println(sLL.head.next.next.next.value);

        sLL.traverseSinglyLinkedList();

        sLL.searchNode(7);
        sLL.searchNode(0);

        sLL.deletionOfNode(0);
        sLL.traverseSinglyLinkedList();

        sLL.deletionOfNode(11);
        sLL.traverseSinglyLinkedList();

        sLL.deletesLL();
        sLL.traverseSinglyLinkedList();

*/

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(10,1);
        csll.insertCSLL(11,2);
        csll.insertCSLL(12,3);
        csll.insertCSLL(13,4);
        csll.insertCSLL(14,5);
        csll.traverseCSLL();

        csll.deleteNode(5);
        csll.traverseCSLL();
        System.out.println(csll.tail.value);
    }
}
