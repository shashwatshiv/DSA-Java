public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = {1,2,3,4,5,78,89,99,234,456};
        System.out.println(linearSearch(arr, 24));
    }

    public static int linearSearch(int[] arr, int target) {
        if (arr.length ==0) return -1;
        int start =0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        System.out.println(start);
        System.out.println(end);

        return -1;
    }
}
