package Problem1;

public class GA1Driver {
    public static void main(String[] args) {
        MyIntBSTree tree = new MyIntBSTree();
        
        tree.add(8);
        tree.add(30);
        tree.add(28);
        tree.add(12);
        tree.add(1);
        tree.add(6);
        
        System.out.println("Number of elements: " + tree.size());
        tree.printInOrder();
    }
}
