package Problem1;

import java.util.Stack;
import java.util.StringTokenizer;

public class BXT {
    //declare local variables
    private int count;
    private TreeNode root;

    public BXT() {
        count = 0;
        root = null;
    }

    public BXT(Object obj) {
        count = 1;
        root = new TreeNode(obj, null, null);
    }

    public void buildTree(String str) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        StringTokenizer token = new StringTokenizer(str);
        while(token.hasMoreTokens()) {
            String temp = token.nextToken();
            if(!isOperator(temp)) {
                 stack.push(new TreeNode(temp));
            } else {
                TreeNode tree1 = (TreeNode)stack.pop();
                TreeNode tree2 = (TreeNode)stack.pop();
                TreeNode tree = new TreeNode(temp, tree2, tree1);
                stack.push(tree);
            }
        }
        root = (TreeNode)stack.pop();
    }

    public double evaluateTree() {        

        return evaluateNode(root);
    }

    private double evaluateNode(TreeNode root) {
        double term,term2=0;
        if(isOperator((String)root.getValue())) {
            term=computeTerm(root.getValue().toString(),
            evaluateNode(root.getLeft()), evaluateNode(root.getRight()));
            return term;
        } else {
            term2=Double.parseDouble(root.getValue().toString());      
            return term2;
        }

    }

    private double computeTerm(String operator, double opr1, double opr2) {
        if(operator.equals("+")) {
            double expr=opr1+ opr2;
            return expr;
        } else if(operator.equals("-")) {
            double expr=opr1 - opr2;
            return expr;
        } else if(operator.equals("*")) {
            double expr=opr1 * opr2;
            return expr;
        } else {        
            double expr=opr1 / opr2;
            return expr;
        }   

    }

    private boolean isOperator(String s) {
        String lisOperators = "+-*/";
        return lisOperators.contains(s) && s.length() == 1;
    }

    public void display() {

        display(root, 0);
    }

    public static void display(TreeNode t, int level) {
        if(t == null) return;
        display(t.getRight(), level + 1);
        for(int k = 0; k < level; k++) {
            System.out.print("\t");
        }
        System.out.println(t.getValue());
        display(t.getLeft(), level + 1);
    }

    public void preorderTraverse() {
        preorderTraverse(root);
    }

    public static void preorderTraverse(TreeNode t) {
        if(t == null) return;
        System.out.print(t.getValue() + " ");
        preorderTraverse(t.getLeft());
        preorderTraverse(t.getRight());      

    }

    public void inorderTraverse() {
        inorderTraverse(root);
    }

    public static void inorderTraverse(TreeNode t) {
        if(t == null) return;

        inorderTraverse(t.getLeft());
        System.out.print(t.getValue() + " ");
        inorderTraverse(t.getRight());
    }
}
