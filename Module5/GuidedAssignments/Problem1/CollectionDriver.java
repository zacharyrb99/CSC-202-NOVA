package Problem1;

public class CollectionDriver {
    public static void main(String[] args) {
        CollectionT<Integer> intCollection = new CollectionT<Integer>(10);
        System.out.println("Before adding any elements, the collection is empty: " + intCollection.isEmpty());
        intCollection.add(10);
        intCollection.add(50);
        intCollection.add(100);
        intCollection.add(150);
        intCollection.print();
        System.out.println("Collection size = " + intCollection.size());
        System.out.println("After calling remove(1):");
        intCollection.remove(1);
        intCollection.print();
        System.out.println("After calling remove(150)");
        Integer ele = 150;
        intCollection.remove(ele);
        intCollection.print();
    }
}
