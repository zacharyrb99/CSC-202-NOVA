package Problem1;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortPA {
    public static void main (String[] args) {
        Random rand = new Random();
        int N = Integer.parseInt(args[0]);
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(arr) + "\n");
        System.out.println("Is the array sorted? " + isSorted(arr) + "\n");
        selectionSort(arr);
        System.out.println("\nThe array after calling Selection Sort: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    public static Boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]) return false;
        }

        return true;
    }
}
