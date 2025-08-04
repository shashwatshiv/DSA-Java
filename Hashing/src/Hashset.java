import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main (String[] args){

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        boolean setChecker = set.contains(1);
        System.out.println(setChecker);
        setChecker = set.contains(5);
        System.out.println(setChecker);
        setChecker = set.add(1);
        System.out.println(setChecker);
        System.out.println(set.size());
        set.remove(3);
        set.add(5);
        set.add(7);

        System.out.println(set.toString());
        Iterator it = set.iterator();

       // loop to iterate over hashset using iterator
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
