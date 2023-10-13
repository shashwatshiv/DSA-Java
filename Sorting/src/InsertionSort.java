import java.util.*;

public class InsertionSort {
    public static void main (String[] args){
        int[] arr = {21,0,1,9,67,-8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int current = arr[i];
            int previous = i-1;
            while(previous >=0 && arr[previous]>current){
                arr[previous+1]= arr[previous];
                previous--;
            }
            //Insertion
            arr[previous+1] = current;

        }
    }
}
