package Problem4;

import java.io.*;

public class AreaFill {
    public static void main(String[] args) throws Exception{        
        // YOU ARE NOT SUPPOSED TO MAKE ANY CHANGES HERE
        char[][] matrix = buildMatrix(new File(args[0]));
        System.out.println("Original Matrix:");
        print(matrix);
        int row = Integer.parseInt(args[1]);
        int col = Integer.parseInt(args[2]);
        fill(matrix, row, col, matrix[row][col]);
        System.out.println("\nAfter filling area: ");
        print(matrix);
    }

    public static char[][] buildMatrix(File file){
        // *** Student task #1 ***
        /*
        Requirements:
        This method reads data from the file and build and return a 2D char 
        array.
        The first line in the data file contains two numbers R and C, 
        followed by R lines
        and each line contains C characters.
        *** Enter your code below ***
        */

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String str = br.readLine();
            String[] strSplit = str.split(" ");
            int rows = Integer.parseInt(strSplit[0]);
            int cols = Integer.parseInt(strSplit[1]);
            char[][] chars = new char[rows][cols];
            
            
            for (int i = 0; i < rows; i++) {
                String rowChars = br.readLine();

                for (int j = 0; j < rowChars.length(); j++) {
                    chars[i][j] = rowChars.charAt(j);
                }
            }
            
            return chars;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new char[0][0];
        } catch (IOException e) {
            e.printStackTrace();
            return new char[0][0];
        }
    }

    public static void fill(char[][] grid, int row, int col, char ch){
        // *** Student task #2 ***
        /*
        Requirements:
        This is a recursive method. It fills the cell at [row, col]
        with * if matrix[row][col] is ch, then recurs up, down, left, and 
        right,
        (but NOT diagonally) and replaces similar characters with *.
        *** Enter your code below ***
        */
        if (row >= 0 && col >= 0){
            if (grid[row][col] == ch) {
                grid[row][col] = '*';
                fill(grid, row + 1, col, ch);
                fill(grid, row - 1, col, ch);
                fill(grid, row, col + 1, ch);
                fill(grid, row, col - 1, ch);
            }
        }      
    } 

    public static void print(char[][] area){
        // *** Student task #3 ***
        /*
        Requirements:
        This method prints the matrix in a table format as shown below:
        ....00
        .0..00
        ..0000
        *** Enter your code below ***
        */

        for (char[] a : area) {
            String s = "";
            for (char c : a) {
                s += c;
            }
            System.out.println(s);
        }
    }
}
