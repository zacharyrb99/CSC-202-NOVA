package Problem1;

import java.util.Stack;
import java.util.StringTokenizer;

public class BXT {
    private TreeNode root;

    public BXT() {
        root = null;
    }

    private boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') return true;
        return false;
    }

    public void buildTree(String str) {
        // *** Student task ***  
        /* 
        The argument string is in postfix notation. 
            Build the tree as specified in the document 
            *** Enter your code below ***
        */

        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode t1,t2,temp;
 
        for(int i = 0; i < str.length(); i++){
            if(!isOperator(str.charAt(i))) {
                temp = new TreeNode(str.charAt(i));
                st.push(temp);
            } else {
                temp = new TreeNode(str.charAt(i));
 
                t1 = st.pop();
                t2 = st.pop();
 
                temp.setLeft(t2);
                temp.setRight(t1);
 
                st.push(temp);
            }
        }

        root = st.pop();
    }

    public double evaluateTree() {
        // *** Student task ***  
        /* 
        Do this recursively.  If the node is an operator, recursively evaluate the left child 
            and the right child, and return the result.  Else the node is a number, so it can 
            be converted into a double, and returned. 
            *** Enter your code below ***
        */

        return evaluateNode(root);
    }

    private double evaluateNode(TreeNode node) {
        double term, term2 = 0;
        if (isOperator((char)root.getValue())) {
            term = computeTerm(root.getValue().toString(), evaluateNode(root.getValue()));
            return term;
        } else {
            term2 = Double.parseDouble(root.getValue().toString());
            return term2;
        }
    }

    private double computeTerm(String operator, double op1, double op2) {
        if (operator.equals("+")) {
            double expression = op1 + op2;
            return expression;
        } else if (operator.equals("-")) {
            double expression = op1 - op2;
            return expression;
        }
    }
    
    public String display(TreeNode t, int level) {
        // *** Student task ***  
        /* 
        Display tree structure. Plese refer to GA2 if you need to refresh your knowledge
            *** Enter your code below ***
        */

        
    }
    
    public String infix() { 
        // *** Student task ***  
        /* 
        Infix is characterized by the placement of operators between operands; 
            *** Enter your code below ***
        */


    }

    public String prefix() {
        // *** Student task ***  
        /* 
        Prefix expression notation requires that all operators precede the two operands that they work on; 
            *** Enter your code below ***
        */


    }
    
    public String postfix() {
        // *** Student task ***  
        /* 
        Postfix requires that its operators come after the corresponding operands
            *** Enter your code below ***
        */


    }
}
