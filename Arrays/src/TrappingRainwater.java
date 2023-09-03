import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args){
        int[] arr ={4,2,1,0,3,0,2,3};
        trapWater(arr);
    }
    public static void trapWater(int[] arr){
int n = arr.length;
        // Find left maximum height
        int[] maxLeft = new int[n];
        maxLeft[0] =arr[0];
        for (int i = 1; i < n ; i++) {
            maxLeft[i] = Math.max(arr[i],maxLeft[i-1] );
        }
        // Find right maximum height
        int[] maxRight = new int[n];
        maxRight[n-1] =arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            maxRight[i] = Math.max(arr[i],maxRight[i+1] );
        }
        //  calculate the minimum of both and subtract array height from it.
        // looping the result to calculate the final rainwater trapped
        int waterLevel = 0;
        int trappedRainwater = 0;
        for (int i = 0; i < n ; i++) {
            waterLevel = Math.min(maxRight[i],maxLeft[i]);
            trappedRainwater += waterLevel - arr[i];
        }
        System.out.println(trappedRainwater);
        System.out.println(Arrays.toString(maxRight));
    }
}
