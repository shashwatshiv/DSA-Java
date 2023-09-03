import java.util.*;
public class triplet {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = {-1,0,1,2,-1,-4,};
       twice(nums);
    }
    public static void twice (int[] nums){
        int n = nums.length;
        int[] triplet = new int[3];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for (int k=j+1;k<n;k++){
                    if (nums[i]+nums[j]+nums[k] == 0){
                        triplet[0] = nums[i];
                        triplet[1] = nums[j];
                        triplet[2] = nums[k];
                        System.out.println(Arrays.toString(triplet));
                    }
                }
            }
        }

    }
}
