import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Introduction to Wrapper Classes
//        Integer in = new Integer(4);
// this way to declare wrapper classes was deprecated in java 5;
        Integer in1 = Integer.valueOf(11); // this is also deprecated
        Integer inc ; // this is the correct method , it uses autoboxing to create object by itself.
        inc =9;
        Float f = 4.33f;
        Boolean bool = true;
        System.out.println(in1);
        System.out.println(inc);
        System.out.println(f);
        System.out.println(bool);

        // Declaring ArrayList
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Boolean> l2 = new ArrayList<>();

        // Adding Elements to ArrayList using util methods.
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(10);
        l2.add(true);
        l2.add(false);

        // Finding Elements through Index
        int yo = l1.get(2);
        System.out.println(yo);
        
        // Printing ArrayList using for loop
        //  l1.size() is used to get size of arraylist
        for (int i = 0; i < l1.size(); i++) {
            //  l1.size() is used to get size of arraylist
            System.out.print(l1.get(i));
        }
        System.out.println(); // added to make output look neat
        //Printing ArrayList without for loop
        System.out.println(l1);
        System.out.println(l2);

        // Add element to an index by shifting the array forward
        l1.add(1,69);
        System.out.println(l1);

        // Adding element to an index by replacing it at that index
        l1.set(1,59);
        System.out.println(l1);

        // removing an element from ArrayList if index is known
        l1.remove(3);
        System.out.println(l1);

        // removing element from a ArrayList of index is unknown
        l1.remove(Integer.valueOf(4));
        System.out.println(l1);
        // remove() method returns boolean
        System.out.println(l1.remove(Integer.valueOf(123)));

        // Check if element exists
        boolean con = l1.contains(59);
        System.out.println(con);

        // If no data type is declared Arraylist can store anything
        ArrayList arr = new ArrayList();
        arr.add("hello world");
        arr.add(47);
        arr.add(true);
        System.out.println(arr);

    }
}