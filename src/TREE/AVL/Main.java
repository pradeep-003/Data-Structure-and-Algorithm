package TREE.AVL;

public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
        newAVL.insert(5);
        newAVL.insert(10);
        newAVL.insert(15);
        newAVL.insert(20);
//        inCase BST 5 10 15 20
//        for AVL 10 5 15 20
        newAVL.levelOrder();
    }
}
