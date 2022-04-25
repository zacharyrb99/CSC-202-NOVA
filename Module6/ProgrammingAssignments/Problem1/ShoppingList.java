package Problem1;

import java.util.Arrays;

public class ShoppingList {
    private Item[] list;
    private int numberOfItems;
    
    public ShoppingList(int initialSize) {
        list = new Item[initialSize];
        numberOfItems = 0;
    }

    public void bubbleSort(Item[] items, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if ((items[i].getName()).compareTo(items[i + 1].getName()) > 0) {
                Item temp = items[i];
                items[i] = items[i + 1];
                items[i + 1] = temp;
            }
        }

        bubbleSort(items, n - 1);
    }
    
    public void insert(Item item) {
        // *** Student task #1 ***  

        /* 
        Requirements: 
    
            1. if null item is not allowed: do nothing if null
            2. if the list is full, double the array size-dynamic array allocation
            3. No duplicated items-all items' names must be unique. If an item with the same name
            already exists in the list, simply add quantity to the existing item in the list
            4. insert the item to the array to maintain sorted-items are sorted based on item names.

            *** Enter your code below *** 
        */

        if (item == null) {
            return;
        } 
        
        if (numberOfItems >= list.length) {
            doubling();
        } 
        
        if (indexOf(item.getName()) != -1) {
            int idx = indexOf(item.getName());
            Item newItem = list[idx];
            newItem.setQuantity(newItem.getQuantity() + item.getQuantity());
            list[idx] = newItem;
            return;
        }

        list[numberOfItems] = item;
        numberOfItems++;
        bubbleSort(list, numberOfItems);
    }
    
    public void remove(Item item) {
        // *** Student task #2 ***  

        /* 
        Requirements: 
    
            1. If item not found(item name), display the item does not exists in the list
            otherwise, remove the item from the list.
            2. Hint: You do need to shift all items after removed one.

            *** Enter your code below *** 
        */

        if (indexOf(item.getName()) == -1) {
            System.out.println("Item does not exist.");
            return;
        } else {
            int idx = indexOf(item.getName());
            Item lastItem = list[numberOfItems - 1];
            list[idx] = lastItem;
            list[numberOfItems] = null;
            numberOfItems--;
            bubbleSort(list, numberOfItems);
        }
    }
    
    // remove item by its name
    public void remove(String name) {		
        // *** Student task #3 ***  

        /* 
        Requirements: 

            1. If item not found(item name), display the item does not exists in the list
            otherwise, remove the item from the list.
            2. Hint: You do need to shift all items after removed one.

            *** Enter your code below *** 
        */

        if (indexOf(name) == -1) {
            System.out.println("Item does not exist.");
            return;
        } else {
            int idx = indexOf(name);
            Item lastItem = list[numberOfItems - 1];
            list[idx] = lastItem;
            list[numberOfItems] = null;
            numberOfItems--;
            bubbleSort(list, numberOfItems);
        }
    }
    
    private void doubling(){
        //Double the list size but keep all items in the list.
        Item[] tmp = new Item[list.length * 2];
        
        for(int i = 0; i < list.length; i++) {
            tmp[i] = list[i];
        }

        list = tmp;
    }
    
    public int indexOf(Item item) {
        // return the index of the item that has the same item name in the list array, return -1 if not found
        for(int i = 0; i < numberOfItems; i++) {
            if(list[i].compareTo(item) == 0) {
                return i;
            }
        }

        return -1; // not found
    }

    public int indexOf(String name) {
        // return the index of the item that has the same item name in the list array, return -1 if not found
        name = name.toLowerCase();
        
        for(int i = 0; i < numberOfItems; i++){
            if(list[i].getName().toLowerCase().compareTo(name) == 0) {
                return i;
            }
        }

        return -1; // not found
    }

    public boolean isFull() {
        return numberOfItems == list.length;
    }

    public boolean isEmpty() {
        return numberOfItems == 0;
    }

    public int size() {
        return numberOfItems;
    }

    public void printNames() {
        System.out.print("[");

        for(int i = 0; i < numberOfItems; i++) {
            System.out.print(list[i].getName());
            
            if(i < numberOfItems - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
    
    public void print(){
        for(int i = 0; i < numberOfItems; i++) {
            System.out.println((i+1)+". " + list[i].toString());
        }
    }
}
