package Problem1;

public class ShoppingListDriver {
    public static void main(String[] args) {
        ShoppingList sl=new ShoppingList(3);
        sl.insert(null);
        sl.insert(new Item("Bread", 2, 2.99));
        sl.insert(new Item("Seafood", -1, 10.99));
        sl.insert(new Item("Rice", 2, 19.99));
        sl.insert(new Item("Salad Dressings", 2, 19.99));
        sl.insert(new Item("Eggs", 2, 3.99));
        sl.insert(new Item("Cheese", 2, 1.59));
        sl.insert(new Item("Eggs", 3, 3.99));
        sl.printNames();
        sl.print();
        
        System.out.println("After removing Eggs:");
        sl.remove("Eggs");
        sl.printNames();
    }
}
