package Problem3;

/**
* @author YINGJIN CUI
* @version 1.0
* since   2020-02
*
* Student name:  xxxxx
* Completion date: xxxx
*
* RecursiveMethodsArrays.txt: the template file of 
RecursiveMethodsArrays.java
* Student tasks: implement tasks #1, #2 and #3 as specified in this file
*/

public class recursiveMethodsArrays{
    public static void main(String[] args){
        // int[] arr={5, 6, 90, 1, 8, 2, 9};
        // System.out.println(smallest(arr));
        // int[][] ar={{1,2,3}, {0, -9, 5,1}};
        //System.out.println(smallest(ar, ar.length-1));
        // System.out.println(smallest(ar));
        // System.out.println(repeat("I",8));

        int[] arr = {2, 4, 3, 89, 0, -9};
        System.out.println(smallest(arr));
        int[][] ar={{1,2,3,4,1,0},{0,-8,-90}};
        System.out.println(smallest(ar));
        System.out.println(repeat(args[0], Integer.parseInt(args[1])));
    }

    public static int smallest(int[] arr){
        // *** Student task #1 ***
        /*
        Requirements:
        This method finds and returns the smallest value in an int array.
        To get credit, it MUST be implemented as a recursive method. N
        No credit if implemented with loop.
        *** Enter your code below ***
        */
  
        if (arr.length == 1) return arr[0];

        int[] recursiveValues = new int[arr.length - 1];

        System.arraycopy(arr, 0, recursiveValues, 0, recursiveValues.length);

        return Math.min(arr[arr.length - 1], smallest(recursiveValues));
    }

    public static int smallest(int[][] arr){
        // *** Student task #2 ***
        /*
        Requirements:
        This method finds and returns the smallest value in a 2D int array.
        To get credit, it MUST be implemented as a recursive method. N
        No credit if implemented with loop.
        *** Enter your code below ***
        */
        
        int[] arrOfMins = new int[arr.length];
        int i = 0;
        
        for (int[] a : arr) {
            int [] recursiveVals = new int[a.length - 1];
            System.arraycopy(a, 0, recursiveVals, 0, recursiveVals.length);
            arrOfMins[i] = Math.min(a[a.length - 1], smallest(recursiveVals));
            i++;
        }

        if (arrOfMins.length == 1) return arrOfMins[0];
        int[] recursiveVals = new int[arrOfMins.length - 1];
        System.arraycopy(arrOfMins, 0, recursiveVals, 0, recursiveVals.length);
        return Math.min(arrOfMins[arrOfMins.length - 1], smallest(recursiveVals));
    }

    public static String repeat(String s, int n){
        // *** Student task #3 ***
        /*
        Requirements:
        It accepts a string s and an integer n as parameters and
        that returns a String consisting of n copies of s.
        For example:
        Call                       Value Returned
        repeat("hello", 3)        "hellohellohello"
        repeat("this is fun", 1)   "this is fun"
        repeat("wow", 0)           ""
        repeat("hi ho! ", 5)       "hi ho! hi ho! hi ho! hi ho! hi ho! "
        *** Enter your code below ***
        */

        if (n == 0) return "";
        if (n < 0) return "Negative number is invalid.";

        return s + repeat(s, n - 1);
    }
}