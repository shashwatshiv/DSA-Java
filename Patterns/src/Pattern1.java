import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner in = new Scanner(System.in);
        char ch = 'A';
        for (int i = 0; i <= 7; i++) {

            for (int j = 0; j <= i ; j++) {

                System.out.print(ch);
                ch++;
            }
            System.out.println();
            
        }

    }
}