package Problem2;

import java.util.Random;

public class MergeSort {
    public static void main (String[] args) {
        Random rand = new Random();
        int N = Integer.parseInt(args[0]);
        int A = Integer.parseInt(args[1]);
        int B = Integer.parseInt(args[2]);

        int[] arr = new int[N];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (rand.nextInt(B - A + 1) + A);
        }

        // To get time spent on sorting:
        // 1. set timeStarted variable to System.currentTimeMillis();
        // 2. run sorting method
        // 3. set timeEnded variable to System.currentTimeMillis();
        // 4. print timeEnded - timeStarted 
       
        long timeStarted = System.currentTimeMillis();
        mergeSort(arr);
        long timeEnded = System.currentTimeMillis();
        System.out.println("Array Length: " + arr.length + " elements");
        System.out.println("Time spent sorting: " + (timeEnded - timeStarted) + "ms");        
    }

    public static void mergeSort(int[] arr){
        mergeSortRec(arr, 0, arr.length-1);
    }

    private static void mergeSortRec(int[] arr, int first, int last){
        if(first < last){
            int mid=(first + last) / 2;
            mergeSortRec(arr, first, mid);
            mergeSortRec(arr, mid + 1,last);
            merge(arr, first, mid, mid + 1, last);
        }
    }

    private static void merge(int[] arr, int leftFirst, int leftLast, int rightFirst, int rightLast){
        int[] aux = new int[arr.length];
        //extra space, this is downside of this algorithm
        int index = leftFirst;
        int saveFirst = leftFirst;

        while(leftFirst <= leftLast && rightFirst <= rightLast){
            if(arr[leftFirst] <= arr[rightFirst]){
                aux[index++] = arr[leftFirst++];
            } else {
                aux[index++] = arr[rightFirst++];
            }
        }

        while(leftFirst <= leftLast){
            aux[index++] = arr[leftFirst++];
        }

        while(rightFirst <= rightLast) {
            aux[index++] = arr[rightFirst++];
        }

        for(index = saveFirst; index <= rightLast; index++) {
            arr[index] = aux[index];
        }
    }
}
