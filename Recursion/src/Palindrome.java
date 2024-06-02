public class Palindrome {
    public static void main(String[] args){
        System.out.println("Namaste World");
        String str = "12321";
        pal(str);
        System.out.println(palRec(str,str.length()-1,""));
        System.out.println(palRec1(str, 0,str.length()-1));
    }


    static void pal(String str){
        StringBuilder original = new StringBuilder();
        for (int i = str.length()-1;i>=0; i--) {
            original.append(str.charAt(i));
        }
        System.out.println(original);
        if (str.contentEquals(original)) System.out.println( "true");
        else System.out.println("false");
    }

    static boolean palRec(String str,int n ,String newStr){
        newStr = newStr+str.charAt(n);
        if (n<=0){
            return str.equals(newStr);
        }
        return palRec(str,n-1,newStr);

    }
    static boolean palRec1(String str, int start , int end){
        if( start>= end){
            return true;
        }
        return palRec1(str, start+1,end-1 ) && str.charAt(start) == str.charAt(end);
    }
}
