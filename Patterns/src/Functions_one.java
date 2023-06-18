public class Functions_one {

    public static int multiply(int a, int b){
        return a*b;
    }
    public static int factorial(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        return num;
    }
    public static boolean prime(int n){
        if (n<2) return false;
        if (n==2) return true;
        int i =2;
        boolean isPrime = true;
        while(Math.sqrt(n) >= i ){
            if ( n% i ==0) {
                isPrime = false;
                break;}
            i++;
        }
      return isPrime;}
    public static void primePrint(int n){
        for (int i = 2; i <=n ; i++) {
            if (prime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Hello");
//        System.out.println(multiply(5,4));
//        System.out.println(factorial(0));
        System.out.println(prime(0));
   
        primePrint(15);
    }
}
