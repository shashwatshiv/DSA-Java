import java.util.Arrays;

public class CountingSort {
    public static void main (String[] args){
        int[] arr = {0,21,0,9,1,9,67,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        // finding the maximum range of array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        // array is made of largest+1 elements because we add zero to it as well in start.
        int[] count = new int[largest+1];
        // Creating count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
            }

        }

    }
}
