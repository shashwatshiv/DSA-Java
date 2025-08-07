import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hashmap{
    public static void main (String[] args){
        // NEETCODE
        String[] names = {"alice", "brad","alice"};
        // Hashmap<key,value>
        HashMap<String,Integer> countMap = new HashMap<>();
        for (String name : names) {
            if (!countMap.containsKey(name)) {
                countMap.put(name, 1);
            } else {
                countMap.put(name, countMap.get(name) + 1);
            }
        }
        System.out.println(countMap.toString());
        // HashMaps Once Again
        // .put(key,value?) , .containsKey(key) = bool , .get(key) = value || null (if key doesnt exist)

        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 123);
        map.put("china", 128);
        map.put("usa", 129);
        System.out.println(map);
        map.put("india",45);
        System.out.println(map);
        System.out.println(map.put("russia",38));
        System.out.println(map.containsKey("India".toLowerCase()));

        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
       Collection<Integer> value = map.values();
        System.out.println(value);
        Integer yo = map.remove("india");
        System.out.println(yo);
        System.out.println(map);
    }
    }
