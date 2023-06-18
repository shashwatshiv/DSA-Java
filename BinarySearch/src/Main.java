public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {-45,0,1,2,6,8,10,45,65,69};
        int ans = BinarySearch(arr,46);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while( start <=end ){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid;
            }
            else if (target > arr[mid]){
                start = mid;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}