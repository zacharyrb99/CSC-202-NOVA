package Problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VocabularyDensity {
    public static void main(String[] args) {
        try {
            File file = new File("Problem1/" + args[0]);
            Scanner scanner = new Scanner(file);
            LinkedCollectionT<Word> col = new LinkedCollectionT<Word>();

            while (scanner.hasNext()) {
                Word word = new Word(scanner.next());
                if (col.isEmpty()) col.add(word);

                LLNode<Word> head = col.getHead();
                boolean found = false;

                while (head.getNext() != null) {
                    if (head.getData().equals(word)) {
                        head.getData().increaseFrequency();
                        found = true;
                    }

                    head = head.getNext();
                }

                if (found == false) {
                    col.add(word);
                }
            }

            System.out.println("Before sorting: ");
            col.print();
            System.out.println("After sorting: ");
            col.sort();
            col.print();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
