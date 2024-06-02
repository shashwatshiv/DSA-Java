public class SumOfN {

    public static void main(String[] args) {
       int sum = func(10);
    System.out.println(sum);
        System.out.println(func1(10,0));
    }
    static int func(int n){
        if(n==0) return 0;
        return n + func(n-1);

    }

    public static int func1(int n,int k){
        if(n==0) return k;
        return func1(n-1,k+n);
    }
}   