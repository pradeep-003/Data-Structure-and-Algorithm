package TREE.BinarySearchTree;

import TREE.BinarySearchTree.BinaryNode;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);

        BinaryNode root = newBST.root;

        newBST.preOrder(root);
        System.out.println();

        newBST.inOrder(root);
        System.out.println();

        newBST.postOrder(root);
        System.out.println();

        newBST.levelOrder();

        newBST.search(root,90);
        newBST.search(root,75);

    }
}
