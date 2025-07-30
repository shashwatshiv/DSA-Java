import java.util.HashMap;
public class Hashmap{
    public static void main (String[] args){
        String[] names = {"alice", "brad","alice"};
        HashMap<String,Integer> countMap = new HashMap<>();
        for (String name : names) {
            if (!countMap.containsKey(name)) {
                countMap.put(name, 1);
            } else {
                countMap.put(name, countMap.get(name) + 1);
            }
        }
        System.out.println(countMap.toString());
        }
    }
