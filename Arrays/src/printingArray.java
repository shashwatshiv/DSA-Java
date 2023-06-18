import java.util.Arrays;

public class printingArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Array
        int[] arr ={4,5,9,3,89,68};
        int[] arr2 ={41,53,91,36,89,68};
        // Function to update the array
        updateArray(arr);
        //Printing an Array using toString Method
        System.out.println(Arrays.toString(arr));
        // Printing an Array using Enhanced For Loop
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }


    // Printing an Array using Loops
    public static void updateArray(int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i]+1;
        }
    }
}