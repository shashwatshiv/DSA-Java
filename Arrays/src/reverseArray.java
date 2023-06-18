import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,};
        Reverse(arr);
    }

     static void Reverse(int[] arr) {
         int temp =0;
         int lastindex = arr.length-1;
         for (int i = 0; i < arr.length/2; i++) {
             temp = arr[i];
             arr[i]= arr[lastindex];
             arr[lastindex] = temp;
             lastindex--;

         }
         System.out.println(Arrays.toString(arr));
    }
}
