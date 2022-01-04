package main.ds.nonlinear.trees.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class PrintGenericTreeMultipleStyles {

    public static void main(String[] args) {
        Node root = new Node(10);

        Node l1Child1 = new Node(20);
        root.childNodes.add(l1Child1);
        Node l1Child2 = new Node(30);
        root.childNodes.add(l1Child2);
        Node l1Child3 = new Node(40);
        root.childNodes.add(l1Child3);

        Node l2Child1 = new Node(50);
        l1Child1.childNodes.add(l2Child1);
        Node l2Child2 = new Node(60);
        l1Child1.childNodes.add(l2Child2);
        Node l2Child3 = new Node(70);
        l1Child3.childNodes.add(l2Child3);

        Node l3Child1 = new Node(80);
        l2Child3.childNodes.add(l3Child1);
        Node l3Child2 = new Node(90);
        l2Child3.childNodes.add(l3Child2);

        Node l4Child1 = new Node(100);
        l3Child1.childNodes.add(l4Child1);
        Node l4Child2 = new Node(110);
        l3Child1.childNodes.add(l4Child2);

        // use remove, print and add for all the operations
        printLevelOrderTraversal(root);
        System.out.println();
        System.out.println("---------");
        printLevelOrderLines(root);
        System.out.println();
        System.out.println("---------");
        printLevelOrderLineZigZag(root);
    }

    private static void printLevelOrderLines(Node root) {
        Queue<Node> nodeQueue = new ArrayDeque<>();
        Queue<Node> tempQueue = new ArrayDeque<>();
        nodeQueue.add(root);

        while (nodeQueue.size() > 0) {
            Node tempNode = nodeQueue.remove();
            System.out.print(tempNode.data + " ");
            tempQueue.addAll(tempNode.childNodes);
            if (nodeQueue.size() == 0) {
                nodeQueue = tempQueue;
                tempQueue = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    private static void printLevelOrderLineZigZag(Node root) {
        Stack<Node> nodeStack = new Stack<>();
        Stack<Node> tempStack = new Stack<>();
        nodeStack.add(root);

        while (nodeStack.size() > 0) {
            Node tempNode = nodeStack.pop();
            System.out.print(tempNode.data + " ");
            tempStack.addAll(tempNode.childNodes);
            if (nodeStack.size() == 0) {
                nodeStack = tempStack;
                tempStack = new Stack<>();
                System.out.println();
            }
        }
    }

    private static void printLevelOrderTraversal(Node root) {
        Queue<Node> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);

        while (nodeQueue.size() > 0) {
            Node tempNode = nodeQueue.remove();
            System.out.print(tempNode.data + ", ");
            nodeQueue.addAll(tempNode.childNodes);
        }
    }

    static class Node {
        int data;
        ArrayList<Node> childNodes = new ArrayList<>();

        public Node(int data) {
            this.data = data;
        }
    }

    static class GenericTreeConstruct {
        public static Node construct(int[] numbers) {
            Stack<Node> nodeStack = new Stack<>();
            Node root = null;
            // loop i->n numbers
            // number -> node create
            // condition if -1 -> pop node and get Top node from stack
            // else - push node to stack
            for (int num : numbers) {
                if (num == -1) {
                    Node poppedChild = nodeStack.pop();
                    if (nodeStack.size() > 0) {
                        Node peekParent = nodeStack.peek();
                        peekParent.childNodes.add(poppedChild);
                    } else {
                        root = poppedChild;
                    }
                } else {
                    Node node = new Node(num);
                    nodeStack.push(node);
                }
            }
            return root;
        }

        public static void main(String[] args) {
            int[] nums = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
            Node node = construct(nums);
            printLevelOrderTraversal(node);
        }
    }


}
