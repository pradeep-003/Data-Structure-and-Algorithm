package TREE;

public class Main {
    public static void main(String[] args) {

        /**   TreeNode

         TreeNode drinks = new TreeNode("Drinks");
         TreeNode hot = new TreeNode("Hot");
         TreeNode cold = new TreeNode("Cold");
         TreeNode tea = new TreeNode("Tea");
         TreeNode coffee = new TreeNode("Coffee");
         TreeNode wine = new TreeNode("Wine");
         TreeNode bear = new TreeNode("Bear");
         drinks.addChild(hot);
         drinks.addChild(cold);
         hot.addChild(tea);
         hot.addChild(coffee);
         cold.addChild(wine);
         cold.addChild(bear);
         System.out.println(drinks.print(0));
         */

        /**

        BinaryTreeLL binaryTree = new BinaryTreeLL();
                                BinaryNode N1 = new BinaryNode();
        N1.value = "N1";        BinaryNode N2 = new BinaryNode();
        N2.value = "N2";        BinaryNode N3 = new BinaryNode();
        N3.value = "N3";        BinaryNode N4 = new BinaryNode();
        N4.value = "N4";        BinaryNode N5 = new BinaryNode();
        N5.value = "N5";        BinaryNode N6 = new BinaryNode();
        N6.value = "N6";        BinaryNode N7 = new BinaryNode();
        N7.value = "N7";        BinaryNode N8 = new BinaryNode();
        N8.value = "N8";        BinaryNode N9 = new BinaryNode();
        N9.value = "N9";

        N1.left = N2;           N1.right = N3;
        N2.left = N4;           N2.right = N5;
        N4.left = N8;           N4.right = N9;
        N3.left = N6;           N3.right = N7;

        binaryTree.root = N1;


        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.levelOrder();
        System.out.println();
        binaryTree.search("N6");
        System.out.println();
        binaryTree.insert("N10");
        System.out.println();
        binaryTree.preOrder(binaryTree.root);

        binaryTree.deleteNode("N5");
        binaryTree.levelOrder();

        binaryTree.deleteBT();
        try{
            binaryTree.levelOrder();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

         */

        // Array BT

        BinaryTree newBinaryTree = new BinaryTree(5);

        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");

        newBinaryTree.preOrder(1);
        System.out.println();
        newBinaryTree.inOrder(1);
        System.out.println();
        newBinaryTree.postOrder(1);
        System.out.println();
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.search("N4");
        newBinaryTree.delete("N4");
        System.out.println();
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.deleteBT();

    }
}
