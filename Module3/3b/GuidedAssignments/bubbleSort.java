import java.util.Arrays;

public class bubbleSort {
    public static void main (String[] args) {
        int[] arr = {100, 99, 98, 97, 96, 95, 94, 93, 92, 91};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[])
    {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                count++;
                
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println(count);
    }
}
