package Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SortedCollectionTDriver {
    public static void main(String[] args) {
        try {
            File file = new File("Problem1/" + args[0]);
            Scanner scanner = new Scanner(file);
            SortedCollectionT<String> col = new SortedCollectionT<>();
            
            while (scanner.hasNext()) {
                col.add(scanner.next());
            }

            LLNode<String> head = col.getHead();
            String[] s = new String[col.size()];
            int i = 0;
            while (i < col.size()) {
                s[i] = head.getData();
                i++;
                head = head.getNext();
            }

            MergeSort<String> ms = new MergeSort<>();
            ms.mergeSort(s);
            
            SortedCollectionT<String> sortedCol = new SortedCollectionT<>();
            for (String val : s) {
                sortedCol.add(val);
            }

            sortedCol.print();
            sortedCol.remove("B");
            sortedCol.remove("h");
            System.out.println("After removing 'B' and 'h': ");
            sortedCol.print();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
