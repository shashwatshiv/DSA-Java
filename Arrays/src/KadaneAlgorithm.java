// Kadane's Algo is used to find sum of sub Array of an Array with time complexity of O(n) {1 loop}
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,7,1,-5,-3};
        KadaneAlgo(arr);
    }
public static void KadaneAlgo(int[] numbers){
        // Initialising currentSum and maxSum
        int currentSum =0;
        int maxSum = 0;
        // for loop to iterate over the array to update current sum
    for (int i = 0; i < numbers.length; i++) {
        // current sum is sum of all previous arrayElements
        currentSum += numbers[i];
        // if current sum goes -ve, it will reduce the sumSize for the next +ve number.
        // we Start fresh by making current Sum zero.
            if (currentSum <0 ) currentSum =0;
            // Max sum will only be updated if after getting zero as currentSum we are able to get a bigger Current Sum
        if (currentSum> maxSum) maxSum = currentSum;
        System.out.print(currentSum+"/"+maxSum +"\n");
    }

}
}

