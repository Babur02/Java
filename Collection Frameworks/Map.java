import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Second", 20);
        map.put("First", 10);
        System.out.println("HashMap " + map);
        System.out.println("map.get(key) " + map.get("First"));
        System.out.println();

        // TreeMap (Sorted on Keys)
        TreeMap<String, Integer> tMap = new TreeMap<>();
        tMap.put("Second", 20);
        tMap.put("First", 10);
        System.out.println("TreeMap " + tMap);
        System.out.println("tMap.keySet() " + tMap.keySet());
        System.out.println("tMap.values() " + tMap.values());
    }
}
