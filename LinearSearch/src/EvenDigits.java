public class EvenDigits {
    public static void main(String[] args) {
        int[] arr ={12,345,4573,10,4};
        System.out.println(EvenDigitsFinder(arr));
        System.out.println(StringLength(arr));
    }
    // Method 1 , by counting the number of digits.
    static int EvenDigitsFinder(int[] arr){
        int count =0;
        for (int num:arr) {
            int digitCounter = 0;
            while (num>0){
                num = num/10;
                digitCounter++;
            }
            if (digitCounter%2==0){
                count++;
            }
        }
        return count;
    }
    // Method 2 , converting num into String and taking its length
    static int StringLength(int[] arr){
        int count =0;
        for (int num:
             arr) {
                    String digits = Integer.toString(num);
                    if (digits.length() %2 ==0){
                        count++;
                    }
        }
        return count;
    }
    // with edge cases like if number is negative or 0

}

