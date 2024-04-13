public class Palindrome {
    public static void main(String[] args){
        System.out.println("Namaste World");
        String str = "abba";
//        pal(str);
        int n =3;
        int x = (2*n)-1;
        for(int i = n;i>= 1; i--){

            for(int j=1;j<= x;j++){
                if(j > i-1 && j <= x-i+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    static void pal(String str){
        String original = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.length());
            original = original + str.charAt(i);
        }
        System.out.println(original);
        if (str.equals(original)) System.out.println( "true");
        else System.out.println("false");
    }

}
