import java.util.*;
public class  BubbleSort {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        // loop to check for each turn
        for(int i = 0;i<arr.length;i++){
            boolean swapped = false;
            // loop to check each value and swap
            for(int j = 1; j < arr.length - i;j++){
                if(arr[j] <arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
     break;
            }
        }
    }
}