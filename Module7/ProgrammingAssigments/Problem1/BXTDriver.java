package Problem1;

import java.util.ArrayList;

public class BXTDriver {
    public static void main(String[] args) {
        ArrayList<String> postExp = new ArrayList<String>();
        postExp.add("14 -5 / ");
        postExp.add("20 3 -4 + * ");
        postExp.add("2 3 + 5 / 4 5 - *");
    
        for( String postfix : postExp ){
            System.out.println("Postfix Exp: " + postfix);
            BXT tree = new BXT();
            tree.buildTree( postfix );
            System.out.println("BXT: ");
            tree.display();
            System.out.print("Infix order: ");
            tree.inorderTraverse();
            System.out.print("\nPrefix order: ");
            tree.preorderTraverse();
            System.out.print("\nEvaluates to " + tree.evaluateTree());
            System.out.println( "\n------------------------");
        }
    }
}
