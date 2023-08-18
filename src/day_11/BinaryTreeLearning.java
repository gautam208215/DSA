package day_11;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLearning {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeInfo {
        int height;
        int dia;

        TreeInfo(int height, int dia) {
            this.height = height;
            this.dia = dia;
        }
    }

    static class BinaryTree {
        static int i = -1;

        public static Node buildTree(int nodes[]) {
            i++;
            if (nodes[i] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }


        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else {
                        queue.add(null);
                    }
                } else {
                    System.out.println(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
        }

//        public static int countNodes(Node root) {
//            if (root == null) {
//                return 0;
//            }
//            int leftNode = countNodes(root.left);
////            System.out.println(leftNode);
//            int rightNode = countNodes(root.right);
////            System.out.println(rightNode);
//
//            return leftNode + rightNode + 1;
//        }
//
//        public static int sumOfNodes(Node root) {
//            if (root == null) {
//                return 0;
//            }
//            int leftSum = sumOfNodes(root.left);
//            int rightSum = sumOfNodes(root.right);
//            return leftSum + rightSum + root.data;
//        }
//
//    }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int height = Math.max(leftHeight, rightHeight) + 1;
            return height;
        }

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max(diam3, Math.max(diam1, diam2));
        }

        public static TreeInfo diam2(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }
            TreeInfo left = diam2(root.left);
            TreeInfo right = diam2(root.right);
            int myHeight = Math.max(left.height, right.height) + 1;
            int diam1 = left.dia;
            int diam2 = right.dia;
            int diam3 = left.height + right.height + 1;
            int myDiam = Math.max(Math.max(diam1, diam2), diam3);
            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
            return myInfo;
        }


        public static void main(String[] args) {

            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree binaryTree = new BinaryTree();
            Node root = binaryTree.buildTree(nodes);
            System.out.println(binaryTree.height(root));
//            int count = BinaryTree.countNodes(root);
//            System.out.println(count);
//            System.out.println(BinaryTree.sumOfNodes(root));

//        System.out.println(root.data);
        }
    }
}
