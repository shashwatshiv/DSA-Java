public class LargestInArray {
    public static void main(String[] args) {
        System.out.println("Hello");
    int[] numbers = {1,2,3,4,7,3,9,6,56,34,1,2,7};
        int max=0;
        max= Integer.MIN_VALUE;
 //if comparing the smallest number use Integer.MAX_VALUE
// instead of max=0 , one can also assign max = Integer.MIN_VALUE
        System.out.println(max);
        for (int i = 0; i < numbers.length ; i++) {

            if (numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
