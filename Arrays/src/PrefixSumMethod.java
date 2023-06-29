import java.util.Arrays;

public class PrefixSumMethod {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9};
        subArraySum(arr);
    }
    static void subArraySum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        int sum,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        // for loop to create prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1]+ arr[i];
        }
        // for loop to select first element
        for (int i = 0; i < prefixSum.length; i++) {
            // for loop to select second element
            for (int j = i; j < prefixSum.length; j++) {
                if (i ==0){
                    sum = prefixSum[j];
                }
                else {
                    sum = prefixSum[j] - prefixSum[i-1];
                }
                if(sum > max) max = sum;
                if(sum < min) min = sum;
            }
        }
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(max);
        System.out.println(min);
    }
}
