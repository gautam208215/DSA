package Day_9;

import Day_9.BinaryTree.BinaryTree;
import Day_9.BinaryTree.BinaryTreeNode;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(1);
        binaryTree.insertingAnElement(binaryTree.getRoot(), 2);
        binaryTree.insertingAnElement(binaryTree.getRoot(), 3);
        binaryTree.insertingAnElement(binaryTree.getRoot(), 4);
        binaryTree.insertingAnElement(binaryTree.getRoot(), 5);
        binaryTree.insertingAnElement(binaryTree.getRoot(), 6);
        binaryTree.insertingAnElement(binaryTree.getRoot(), 7);
        System.out.println(binaryTree);
        System.out.println("-------------------------------------");
        binaryTree.preorder(binaryTree.getRoot());
        System.out.println("-----------------------------------------");
        ArrayList<Integer> integers = binaryTree.preorderTraversal(binaryTree.getRoot());
        System.out.println(integers);
        System.out.println("-----------------------------------");
        binaryTree.inorder(binaryTree.getRoot());
        System.out.println("-------------------------------------");
        ArrayList<Integer> inorderTraversal = binaryTree.inorderTraversal(binaryTree.getRoot());
        System.out.println(inorderTraversal);
        System.out.println("--------------------------------------");
        binaryTree.postorder(binaryTree.getRoot());

    }
}
