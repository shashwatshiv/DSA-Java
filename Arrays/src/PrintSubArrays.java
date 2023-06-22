public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,3};
    subarray(arr);
    }
    static void subarray (int[] arr){
        // for loop to select starting element of sub-array
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // for loop to select last element of sub array
            for (int j = i; j < arr.length ; j++) {
            // for loop to print the sub-array
                int sum =0;
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+",");
                    sum += arr[k];
                }
                System.out.print("  ");
                System.out.print(sum);
                System.out.print("  ");
                // to give out the maximum and minimum of an array
                if (sum> min) min =sum;
                if(sum < max) max = sum;
            }
            System.out.println();
        }
        System.out.println(max);
        System.out.println(min);}

}
