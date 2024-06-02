public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("hello world");
//        int n1 =0,n2=1,n3,i,count=10;
//        System.out.print(n1+" "+n2+" ");
//        for(i=2;i<count;i++){
//            n3 = n1+n2;
//            System.out.print(n3+" ");
//            n1=n2;
//            n2=n3;
//        }
        System.out.println(fibn(6));
    }
    static int fibn(int n){
        if(n==0) return 0;
        if (n==1) return 1;

       return fibn(n-1)+fibn(n-2);
    }
}

