
public class StringSubset {
    public static void main(String[] args) {
        String str = "ABC";
        int index = str.length()-1;
        subset(str,"",index);
    }
    static void subset(String str,String curr,int index){
        if (index ==-1){
            System.out.println(curr);
            return;
        }
        subset(str,curr,index-1);
        subset(str,curr+str.charAt(index),index-1);
    }
}
