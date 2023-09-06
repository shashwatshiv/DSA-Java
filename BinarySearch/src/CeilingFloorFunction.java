public class CeilingFloorFunction {
    public static void main(String[] args){
        int[] arr ={1,3,7,9,23,34,37,56,58,78,96,99};
        System.out.println(Ceiling(arr,4));
        System.out.println(Floor(arr, 55));
    }
        static int Ceiling (int[]arr , int target){
        int start =0;
        int end = arr.length -1;
        while (start <=end){
           int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]) {
                end = mid-1;
            }
            else  {
                return arr[mid];
            }
        }
        return arr[start];
        }
        static int Floor(int[] arr, int target){
        int start =0;
        int end = arr.length -1;
        while (start <=end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
        }
    }
