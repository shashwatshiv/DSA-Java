import java.util.Arrays;

public class ReverseSorting {
    public static void main(String[] args){
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j <arr.length-i-1; j++) {
                if (arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minPos=0;
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[minPos] > arr[j]){
                    minPos =j;
                }
                //swap
                int temp = arr[minPos];
                arr[minPos]=arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
            }
        }
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] < cur){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
    }
    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }
        int[] count = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j=arr.length-1;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0) {
                arr[j] = i;
                count[i]--;
                j--;
            }
        }
    }

}
