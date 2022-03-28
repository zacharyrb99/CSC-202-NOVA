package Problem1;
import java.util.Arrays;
import java.util.Random;

/**
* @author EMILIA BUTU
* version 1.0
* since   2020-07
*
* Student name:  Zachary Boudreaux
* Completion date: 03/23/2022
*
* ArrayCommonOperations.txt - template file. Save as 
ArrayCommonOperations.java
*
* This program performs common operations on the elements of an one-
dimensional array
* The elemenst of the array are random numbers of type integer, with 
values between 1 and 100.
* The calculated values are stored, and displayed at the end of the 
program
*
* Student tasks: complete tasks specified in the file
*/

public class ArrayCommonOperations {
    public static void main(String[] args) {
        //*** Task #1: Define and instantiate an array of integer numbers, with 10 elements
        int[] nums = new int[10];

        //*** Task #2: Fill in the array with integer numbers from 1 to 100
        Random rand = new Random();

        for(int i = 0; i < 10; i++) {
            nums[i] = (rand.nextInt(100) + 1);
        }

        //*** Task #3: define another array, named temp, and copy the initial array in it.
        int[] temp = nums.clone();

        //*** Task #4:  Define the variables you need to calculate the following values, and initialize them with appropriate values.
        int sum = 0;
        int countEven = 0;
        int min = 100;
        int max = 0;


        //*** Task #5: Print the original array
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(nums));
        
        //*** Task #6: Calculate the sum of all values
        for (int val : nums) {
            sum += val;
        }
        
        //*** Task #7: Count the number of even values
        for (int val : nums) {
            if (val % 2 == 0) countEven++;
        }

        //*** Task #8: Calculate the minimum value in the array
        for (int val : nums) {
            if (val < min) min = val;
        }

        //*** Task #9: Calculate the maximum value in the array
        for (int val : nums) {
            if (val > max) max = val;
        }

        //*** Task #10: Replace the elements that are divisible by 3, with their value plus 2
        System.out.print("New Array: ");
        for (int i = 0; i < nums.length; i++ ){
            if (nums[i] % 3 == 0) temp[i] = (nums[i] + 2);
        }

        //*** Task #11: Display the new array after replacement
        System.out.println(Arrays.toString(temp));

        //*** Task #12: Display the calculated values.
        System.out.print("Sum of values: ");
        System.out.println(sum);

        System.out.print("Count of even values: ");
        System.out.println(countEven);

        System.out.print("Minimum Value: ");
        System.out.println(min);

        System.out.print("Maximum Value: ");
        System.out.println(max);
    }
}