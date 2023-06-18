public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-45,0,1,2,6,8,10,45,65,69};
        int [] arr2 = {99,67,34,23,12,5,-7};
        int ans = BinarySearch(arr,45);
        System.out.println(ans);
        int ans2 = BinarySearch(arr2,2);
        System.out.println(ans2);
    }
    static int BinarySearch(int[]arr , int target){
        int start = 0;
        int end = arr.length - 1 ;
        boolean isAsc = arr[start] < arr[end];
        while( start <=end ){
            int mid = start + (end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid-1;
                }
                else if (target > arr[mid]){
                    start = mid+1;
                }
            }

            else {
                if (target > arr[mid]){
                    end = mid-1;
                }
                else if (target < arr[mid]){
                    start = mid+1;
                }
            }
        }





        return -1;
    }

}
