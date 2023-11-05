import java.sql.SQLOutput;
import java.util.*;
public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(4);
        l1.add(9);
        l1.add(0);
        l1.add(19);
        l1.add(80);
        System.out.println("Reversing and sorting arraylist using method and collection framework");
        System.out.println(l1);
        reverseList(l1);
        System.out.println(l1);
        // Collections class in java.util have a method prebuilt to reverse a arraylist
        Collections.reverse(l1);
        System.out.println(l1);
        // Collections class in java.util have a method prebuilt to sort a arraylist
        Collections.sort(l1); // sorts in ascending order
        System.out.println(l1);
        // to sort in descending order, comparator method can be passed in port method.
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        System.out.println("Sorting and Reversing of arraylist of strings in lexical order");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Shashwat");
        l2.add("Shreyash");
        l2.add("Dev");
        l2.add("Rishi");
        Collections.sort(l2);
        System.out.println(l2);
        // Reversing the lexical order
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println(l2);
    }
    public static void reverseList(ArrayList <Integer> l1){
        int start =0;
        int end = l1.size()-1;
        while(start < end){
            Integer temp = l1.get(start);
            l1.set(start, l1.get(end)) ;
            l1.set(end,temp);
            start ++;
            end--;
        }
    }
}
