import java.util.*;

public class TwoPointerMethod {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0,1,0,0};
        int[] nums = {2,3,6,8,5,9,0};
        int[] list = {-10,-6,-2,0,4,9};
        sort0and1Array(arr);
        System.out.println(Arrays.toString(arr));
        sortEvenOdd(nums);
        System.out.println(Arrays.toString(nums));
        int[] ans = squareSort(list);
        System.out.println(Arrays.toString(ans));

    }
    public static void sort0and1Array(int[] arr){
       int start =0;
       int end = arr.length -1;
       while (start<end){
           if (arr[start] == 1 && arr[end] ==0){
               swap(arr,start,end);
               start++;
               end--;
           }
           else if(arr[start] ==0) start++;
           else if (arr[end] ==1) end --;
       }
    }
    public static void sortEvenOdd(int[] nums){
        int start =0;
        int end = nums.length -1;
        while (start<end){
            if (nums[start] % 2 !=0 && nums[end] % 2 == 0){
                swap(nums,start,end);
                start++;
                end--;
            }
            else if(nums[start] %2 ==0) start++;
            else if (nums[end] !=1) end --;
        }
    }
    static int[] squareSort (int[] list){
        int n = list.length;
        int[] ans = new int[n];
        int left =0;
        int right = n-1;
        int counter = n-1;
        while(left < right){
            if( Math.abs(list[left]) > Math.abs(list[right])){
                ans[counter--] = list[left]*list[left];
                left++;
            }
            else{
                ans[counter--] = list[right]*list[right];
                right--;
            }
        }
        return ans;
    }

    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
