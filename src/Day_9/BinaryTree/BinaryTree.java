package Day_9.BinaryTree;

import java.util.*;

public class BinaryTree {

    public BinaryTreeNode getRoot() {
        return this.root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    private BinaryTreeNode root;

    public BinaryTree(int data) {
        root = new BinaryTreeNode(data);
    }

    public BinaryTreeNode insertingAnElement(BinaryTreeNode root, int data) {
        if (root == null) {
            return null;
        }

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);

        while (!q.isEmpty()) {
            BinaryTreeNode tmp = q.poll();
//            System.out.println("polled element " + tmp.getData());
            if (tmp != null) {
                if (tmp.getLeft() != null) {
                    q.offer(tmp.getLeft());
                } else {
                    tmp.setLeft(new BinaryTreeNode(data));
                    return root;
                }
                if (tmp.getRight() != null) {
                    q.offer(tmp.getRight());
                } else {
                    tmp.setRight(new BinaryTreeNode(data));
                    return root;
                }
            }
        }
        return root;
    }

    public void preorder(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public ArrayList<Integer> preorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode temp = stack.pop();
            list.add(temp.getData());
            if (temp.getRight() != null) {
                stack.push(temp.getRight());
            }
            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }
        return list;
    }

    public void inorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeft());
        System.out.print(root.getData() + "  ");
        inorder(root.getRight());
    }

    public ArrayList<Integer> inorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode currNode = root;
        boolean done = false;
        if (root == null) {
            return list;
        }
        while (!done) {
            if (currNode != null) {
                stack.push(currNode);
                currNode = currNode.getLeft();
            } else {
                if (stack.isEmpty()) {
                    done = true;
                } else {
                    currNode = stack.pop();
                    list.add(currNode.getData());
                    currNode = currNode.getRight();
                }
            }
        }

        return list;
    }

    public void postorder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public ArrayList<Integer> postorderTraversal(BinaryTreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        if (root == null) {
            return list;
        }
        stack.push(root);
        BinaryTreeNode prev = null;

        while (!stack.isEmpty()) {
            BinaryTreeNode current = stack.peek();
            if (prev == null || prev.getLeft() == current || prev.getRight() == current) {
                if (current.getLeft() != null) {
                    stack.push(current.getLeft());
                } else if (current.getRight() != null) {
                    stack.push(current.getRight());
                }
            } else if (current.getLeft() == prev) {
                if (current.getRight() != null) {
                    stack.push(current.getRight());
                }
            } else {
                list.add(current.getData());
                stack.pop();
            }
            prev = current;
        }
        return list;
    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
