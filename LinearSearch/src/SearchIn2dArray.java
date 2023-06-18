import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        System.out.println("hello");
        int arr[][] = {
                {1,4,2,8,5},
                {45,76,23,11,12,69},
                {4,-6,-32,0},
                {0,3,-69}
        };
     LinearSearch(arr,12);
     System.out.println(Arrays.toString(LinearArraySearch(arr,12)));
        System.out.println(MaxElement(arr));

    }
    public static void LinearSearch(int arr[][],int num){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if (num == arr[i][j]){
                    System.out.println(i +","+j);}
            }

        }

    }
    public static int[] LinearArraySearch(int arr[][],int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (num == arr[i][j]) {
                    return new int[]{i, j};
                }

            }

        }
        return new int[]{-1, -1};
    }
    public static int MaxElement(int arr[][]){
        int max = arr[0][0];
        for (int[] array :arr) {
            for (int arrayElement : array){
                if (max<arrayElement){
                    max =arrayElement;
                }
            }
        }
return max;
    }
}