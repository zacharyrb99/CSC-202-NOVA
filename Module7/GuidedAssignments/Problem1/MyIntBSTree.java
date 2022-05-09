package Problem1;

import java.util.*;

public class MyIntBSTree {
    private Node root;

    public MyIntBSTree() {
        root = null;
    }
    
    public int size() {
        Queue<Node> queue = new LinkedList<Node>();
    
        // *** Student task #1 ***  
        /* 
        Requirements: 
        - Implement this method with a queue.
        - This method returns the number of elements in the tree
        
        *** Enter your code below *** 
        */

        if (root == null) return 0;

        int count = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node tmp = queue.poll();

            if (tmp.getLeft() != null) {
                count++;
                queue.offer(tmp.getLeft());
            }

            if (tmp.getRight() != null) {
                count++;
                queue.offer(tmp.getRight());
            }
        }

        return count;
    }

    public void add(int data) {
        root = addHelper(root, data);
    }

    private Node addHelper(Node node, int data) { //add node helper
        if (node == null) {
            node = new Node(data);
        } else if (data <= node.getData()) {
            node.setLeft(addHelper(node.getLeft(), data));
        } else {
            node.setRight(addHelper(node.getRight(), data)); //System.out.println(data);
        }
        return node;
    }
    
    public void printInOrder() {
        // *** Student task #2 ***  

        /* 
        Requirements: 
        - Print all elements in the tree in ascending order. 
        - For example, if the tree contains nodes with values 5, 2, 8, 
            then calling printInOrder() should print as follows:
            [5, 2, 8]
        - You may implement this method either recursively or iteratively.

        *** Enter your code below *** 
        */

        if (root == null) return;

        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.push(curr);
                curr = curr.getLeft();
            }
            
            curr = s.pop();
            System.out.print(curr.getData() + " ");
            curr = curr.getRight();
        }
        
        System.out.println();
    }
}
