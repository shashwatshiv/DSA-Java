import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr ={4,5,9};
        update(arr);
        //Printing an Array using toString Method

        System.out.println(Arrays.toString(arr));
        // Printing an Array using Enhanced For Loop
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    // Updating an Array using Loops
    public static void update(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+5;
        }
    }
}