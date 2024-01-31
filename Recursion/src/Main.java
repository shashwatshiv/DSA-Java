import java.util.*;

class Main {
    public static void main (String[] args){
        System.out.println("Hello World");
      int ans =  func1(8);
      System.out.println(ans);
      System.out.println("Function 2");
      func2(5);
      System.out.println("factorial");
      int fact = factorial(4,1);
      System.out.println(fact);
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

    static int factorial(int n, int k){
        if (n==0) return k;

        return factorial(n-1, n*k);

    }
}