import java.util.*;

class ain {
    public static void main (String[] args){
        System.out.println("Hello World");
//      int ans =  func1(8);
//      System.out.println(ans);
//      System.out.println("Function 2");
//      func2(5);
//      System.out.println("factorial");
//      int fact = factorial(4,1);
//      System.out.println(fact);
tail(5,1);
        System.out.println(factorialTail(5,1));
    }
     static void func3(int n){
         if (n==0)
          return;
         System.out.println("gfg");
         func1(n-1);
     }
    static int func1(int n){
 if (n==1) return 0;
 else return 1+ func1(n/2);
    }

    static void func2(int n){
        if (n ==0) return; 
        System.out.println(n);
        func2(n-1);
        
    }

    static void tail(int n,int k){
        if (n==0) return;
        System.out.println(k);
        tail(n-1,k+1);
    }
    static int factorialTail(int n, int k){
        if( n ==0 || n==1){
            return k;
        }
        return factorialTail(n-1,k*n);

    }
}