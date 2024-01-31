public class SumOfN {

    public static void main(String[] args) {
       int sum = func(10);
    System.out.println(sum);

    }
    static int func(int n){
        if(n==0) return 0;
        return n + func(n-1);

    }
}   