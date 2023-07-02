public class StockPrice {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
//        System.out.println(maxProfit(arr));
        System.out.println(maxProfit2(arr));
    }
    // Brute Force Method , Time Complexity O(n^2)
    public static int maxProfit(int[] arr){
        int profit =0;
        int profitMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                profit = arr[j]-arr[i];
                if (profit > profitMax) profitMax = profit;
            }

        }
        if (profitMax >0) return profitMax;
        else return 0;
    }
   // Optimized Solution for time complexity of O(n) i.e. 1 loop
    public static int maxProfit2(int[] arr){
        int buyPrice =arr[0];
        int sellPrice =arr[0];
        int profit = 0;
        int profitMax =Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            buyPrice = Math.min(buyPrice,arr[i]);
            sellPrice = Math.max(buyPrice, arr[i]);
                    profit = sellPrice - buyPrice;
            if (profit > profitMax) profitMax = profit;
        }
        return  profitMax;
    }
}
