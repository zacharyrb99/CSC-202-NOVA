package Problem1;

import java.util.Arrays;
import java.util.Random;

public class MysterySort {
    public static void main (String[] args) {
        Random rand = new Random();
        int[] arr = new int[Integer.parseInt(args[0])];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(Integer.MAX_VALUE);
        }

        System.out.println("Array is sorted before calling sort method: " + isSorted(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println();
        mysterySort(arr);
        System.out.println("Array is sorted after calling sort method: " + isSorted(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static void mysterySort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int k = 0; k < arr.length - i - 1; k++){
                if(arr[k] > arr[k + 1]){ //swap
                    int hold = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = hold;
                }
            }
        }
    }

    public static Boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]) return false;
        }

        return true;
    }
}