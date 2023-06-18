public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr ={1,3,5,3,6,2323,545,231,57,23,15,45};
      int index =  LinearSearch(arr, 231);
        System.out.println(index);
    }
    public static int LinearSearch(int[] arr, int target){
        // if array length is zero or no array input
        if (arr.length ==0) return -1;
        // for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
        // check for each value of i for arr[i] and target
            }

        }
    // if both the above conditions fail, then the target does not exist in array
        return -1;


    }
}