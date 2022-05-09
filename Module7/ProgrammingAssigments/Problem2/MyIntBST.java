package Problem2;

import java.util.Arrays;

public class MyIntBST {
    private Node root;

    public MyIntBST() {
        root = null;
    }
    
    public int height() {
        // *** Student task ***  
        /* Requirements: 
            The height of a binary tree is the largest number of edges in a path from the root node to a leaf node. 
            Essentially, it is the height of the root node. Note that if a tree has only one node, then that node 
            is at the same time the root node and the only leaf node, so the height of the tree is 0, similary, 
            the height of a tree with only two nodes is 1. Implement this method to return height of the tree

        *** Enter your code below *** 
        */

        int val = height(root);
        return val;
    }

    private int height(Node node) {
        if (root == null) {
            return 0;
        }
 
        return 1 + Math.max(height(root.getRight()), height(root.getRight()));
    }
    
    public int comparisons(Node node) {
        // *** Student task ***  
        /* Requirements: 
            Count and return how many comparisons performed to search for the argument node

        *** Enter your code below *** 
        */
        int count = 0;
        Node temp = root;
        while (temp != null) {
            if (temp == node) {
                count++;
                return count;
            } else if (temp.getData() < node.getData()) {
                count++;
                temp = temp.getLeft();
            } else if (temp.getData() > node.getData()) {
                count++;
                temp = temp.getRight();
            }
        }
        
        return count;
    }
    public int comparisons(int val) {

        // *** Student task ***  
        /* Requirements: 
        Overloaded method - Count and return how many comparisons performed to search for the node whose data equals the argument val.

        *** Enter your code below *** 
        */

        int count = 0;
        Node temp = root;
        while (temp.getData() != val) {
            if (temp.getData() < val) {
                count++;
                temp = temp.getLeft();
            } else if (temp.getData() > val) {
                count++;
                temp = temp.getRight();
            }
        }
        
        return count;
    }

    public MyIntBST buildBalancedTree(int[] arr) {
        
        // *** Student task ***  
        /* Requirements: 
            This method builds a balanced tree with values from the int arr and returns the tree.

        *** Enter your code below *** 
        */

    }

    public MyIntBST buildWorstTree(int[] arr) {
        
        // *** Student task ***  
        /* Requirements: 
            Build and return a tree whose height is arr.length - 1

        *** Enter your code below *** 
        */


    }

    public MyIntBST buildTree(int[] arr) {

        // *** Student task ***  
        /* Requirements: 
            This method builds a tree with values from the int arr and returns the tree.
            You may simply add all values to the tree in the same sequence as in the int arr.

        *** Enter your code below *** 
        */


    }
    
    // **** DO NOT MODIFY CODE BEYOND THIS POINT ***
    public void add(int data) {
        root = addHelper(root, data);
    }

    private Node addHelper(Node node, int data) {//add node helper
        if (node == null) {
            node = new Node(data);
        } else if (data <= node.getData()){
            node.setLeft(addHelper(node.getLeft(), data));
        } else {
            node.setRight(addHelper(node.getRight(), data));//System.out.println(data);
        }

        return node;
    }

    public void display() {
        //print tree structure
        displayHelper(root, 0);
    }

    private void displayHelper(Node t, int level) {
        if(t==null) return ;
        displayHelper(t.getRight(), level + 1);
        for(int k = 0; k < level; k++)
            System.out.print("\t");
        System.out.println(t.getData());
        displayHelper(t.getLeft(), level + 1); //recurse left
    }
}
