package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineList {
    private Node head;
   
    public LineList() {   //constructor  
        head = null;
    }
    //Don't modify anything before this line. 
    //Do not add any other instance variables.
    

    // *** Student tasks: implement the following methods *** 
    
    public void empty() {
        // delete all lines in the editor
        head = null;
    }

    public void load(String fileName, boolean append) {
        // append is true, read lines and add to existing list, 
        // otherwise, create new list.
        // Each line is stored in a Node.
        // You may need to handle exception within this method
        // or throw runtime exception only.
        if (append == false) {
            head = null;
        }

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            Scanner scan = new Scanner(inputStream);

            while (scan.hasNextLine()) {
                addLine(scan.nextLine());
            }

            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
    public void save(String fileName) {
        // Save all lines represented with Nodes to a file. 
        // Each line (Node) occupies a line in the saved file.
        // You may need to handle exception within this method
        // or throw runtime exception only.
        try {
            Node temp = head;
            if (temp != null) {
                FileWriter fw = new FileWriter(fileName);
                while (temp != null) {
                    fw.write(temp.getLine());
                    temp = temp.getNext();
                }

                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    
    public void addLine(String line) {
        //append the line to the end of the list
        if (head == null) {
            head = new Node(line);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(line));
        }
    }

    public void addLine(String line, int n) {
        //insert new line to nth line, if n > total number of line, 
        //append to the end of the list.
        int currIdx = 1;
        Node temp = head;

        if (temp == null) {
            head = new Node(line);
        } else {
            while (temp.getNext() != null && currIdx < n - 1) {
                temp = temp.getNext();
                currIdx += 1;
            }

            if (n == 1) {
                Node newNode = new Node(line);
                newNode.setNext(head);
                head = newNode;
            } else if (currIdx == n - 1) {
                Node nextNode = temp.getNext();
                Node newNode = new Node(line);
                temp.setNext(newNode);
                newNode.setNext(nextNode);
            } else {
                temp.setNext(new Node(line));
            }
        }
    }
    
    public int words() {
        // count number of words, word may be separated with 
        // \t,;.?!-@spaces ' * and "
        int totalWords = 0;
        Node temp = head;
        while (temp != null) {
            String currentLine = temp.getLine();
            String[] words = currentLine.split("[\\t\\s,:.;?!-'*\"]+");
            totalWords += words.length;
            temp = temp.getNext();
        }
        return totalWords;
    }

    public int lines() { 
        // count number of lines, which is the same as the number of
        // nodes in the list.
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count += 1;
            temp = temp.getNext();
        }
        return count;
    }

    public void delete(int n) {
        //delete nth line if exists. Otherwise do nothing.
        int currIdx = 1;
        Node temp = head;

        if (temp == null) {
            return;
        }

        while (temp.getNext().getNext() != null && currIdx < n-1) {
            currIdx += 1;
            temp = temp.getNext();
        }

        if (n == 1) {
            head = head.getNext();
        } else if (currIdx == n - 1) {
            temp.setNext(temp.getNext().getNext());
        } else {
            temp.setNext(null);
        }
    }

    public String toString() {
        // Return all lines represented by Nodes in the list. All lines
        // are in the same order as their corresponding nodes in the list.
        // All lines are separated with \n. No newline character should be 
        // added after the last line.
        StringBuilder result = new StringBuilder();
        Node temp = head;

        if (temp == null) {
            return result.toString();
        }

        while (temp.getNext() != null) {
            result.append(temp.getLine()).append("\n");
            temp = temp.getNext();
        }

        result.append(temp.getLine());
        return result.toString();
    }

    public void print() {
        // Print each line. Each line is proceeded with its corresponding line 
        // numbers. Please refer to sample output.
        if (head != null) {
            int lineNumber = 1;
            Node temp = head;

            while (temp != null) {
                System.out.printf("%d. %s\n", lineNumber, temp.getLine());
                temp = temp.getNext();
                lineNumber += 1;
            }
        }
    }
    
    public void replace(String s1, String s2) {
        // Replace all occurrences of s1 with s2.
        Node temp = head;

        while (temp != null) {
            temp.replace(s1, s2);
            temp = temp.getNext();
        }
    }
    
    public void line(int n) {
        // Print nth line in the document. (The nth node in the list)
        // If nth line does not exists, print “Line n does not exist.”
        if (n > lines()) {
            System.out.printf("Line %d does not exist.\n", n);
        } else {
            Node temp = head;
            int currIdx = 1;

            while (temp != null && currIdx != n) {
                temp = temp.getNext();
                currIdx += 1;
            }

            assert temp != null;
            System.out.println(temp.getLine());
        }
    }
}
