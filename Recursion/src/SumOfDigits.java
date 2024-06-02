public class SumOfDigits {
    public static void main(String[] args){
        System.out.println(sum(1010,0));
        System.out.println(sum1(1010));
    }
    static int sum(int n,int s){
        if(n ==0) return s;
        return sum(n/10, s = s+(n%10));

    }
    static int sum1(int n){
        if(n ==0) return 0;
        return sum1(n/10)+n%10;

    }
}
