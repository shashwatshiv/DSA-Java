import java.util.Scanner;

public class Function_two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        System.out.println(palindromeChecker(num));

    }

    public static boolean palindromeChecker(int num) {
        int a =0;
        int i = num;
        while (i>0){
            int reverse = i % 10;
            i /= 10;
            a = a*10 +reverse;
    }
    if (a==num) {return true;}
    else {return false;}
    }


}
