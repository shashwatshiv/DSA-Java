import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Select array length");
        int n = sc.nextInt();
        System.out.println("Select rotating key");
        int k = sc.nextInt();
        k %= n;
        System.out.println("Enter a array ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        bruteRotate(arr,k);
        System.out.println(Arrays.toString(arr));
        optimizedRotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void bruteRotate(int[] arr,int k){
        int n = arr.length;
        int[] ans  = new int[n];
        int j =0;

        for (int i = n-k ; i < n ; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }

        System.out.println(Arrays.toString(ans));
    }
    public static void optimizedRotate(int[] arr, int k){
        int n = arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr, int start , int end){
        while(start < end){
            swap(arr,start,end);
            start ++;
            end--;
        }
    }
    public static void swap (int[] arr ,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
