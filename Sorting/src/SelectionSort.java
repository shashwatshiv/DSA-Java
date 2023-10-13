import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        int[] nums = {2,4,1,3,7,5,8,0};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            int last = nums.length-i-1;
            int maxIndex = maxOfArray(nums,last);
            swap(nums,maxIndex,last);
        }
    }
    public static int maxOfArray(int[] nums,int last){
        int max =0;
        for (int i = 0; i <= last; i++) {

            if (nums[i]> nums[max] ){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] nums,int maxIndex , int last){
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last]= temp;
    }


    public static void selection(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[minPos]>nums[j]){
                    minPos = j;
                }
                //swap
                int temp = nums[minPos];
                nums[minPos] = nums[i];
                nums[i]= temp;
            }
        }
    }
}
