package mapInterface_HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapInterface_HashMap {
    public static void main(String[] args) {
        //Map - a collection of Key-Value Pair, not Iterable

        Map<String, Integer> scoreMap = new HashMap<>();
        //map has 2 data types, string is key data type, int is value

        /*
        * An object that maps keys to values
        * A map cannot contain duplicate keys
        * each key can map to at most one value
        *
        * Map General Implementation -- HashMap
        *
        * SortedMap  extends Map interface
        * NavigableMap extends SortedMap interface
        * TreeMap implements NavigatableMap
        *
        * Legacy class Hashtable
        *
         */

        //-------------------Map Interface Methods----------

        //V put(K key, V value)
        scoreMap.put("Adam", 99);
        scoreMap.put("John", 96);
        scoreMap.put("Mary", 100);
        System.out.println(scoreMap);
        // int size()
        System.out.println(scoreMap.size());

        //boolean isEmpty()
        System.out.println("map is empty ? " + scoreMap.isEmpty());

        //boolean containsKey(Object key) --- is key sensitive
        System.out.println("is John in this Map? " + scoreMap.containsKey("John"));

        //adding duplicate key: - just gets ignored
        scoreMap.put("Mary", 100);
        System.out.println(scoreMap);

        //boolean containsValue(Object value)
        System.out.println("is value 100 in this scoreMap ? " + scoreMap.containsValue(100));

        //V get(Object key);  --get value from a key
        System.out.println("Mary's score is " + scoreMap.get("Mary"));
        System.out.println("Adam's score is " + scoreMap.get("Adam"));

        //V remove(Object key)
        System.out.println("removing key: Adam " + scoreMap.remove("Adam"));

        System.out.println(scoreMap); //John=96, Mary=100

        //void putAll(Map<? extends K, ? extends V> m)
        Map<String, Integer> scoreMap2 = new HashMap<>();

        scoreMap2.put("Diana", 80);
        scoreMap2.put("Alex", 92);
        scoreMap2.put("Brian", 70);
        System.out.println("scoreMap 2: " + scoreMap2);

        scoreMap2.putAll(scoreMap); //combine 2 maps
        System.out.println(scoreMap2);

        //void clear()
        scoreMap2.clear();
        System.out.println("is cleared " + scoreMap2 );


        //--Java 8 addition

        //V putIfAbsent(K key, V value)
        scoreMap2.putIfAbsent("Mary", 34); //--will not update value to 34 for Mary because putIfAbsent will only run if key doesn't exist
        System.out.println(scoreMap);// Mary is still 100


        //V getOrDefault(Object key, V defaultValue) -- if key not found, pass default value
        System.out.println("Get Alex's score " + scoreMap.get("Alex")); //null
        System.out.println("Get Alex's score, if not found return 66 " + scoreMap.getOrDefault("Alex", 66));

        //boolean remove(Object key, Object value) -- will only remove if key and value match
        System.out.println(scoreMap);
        System.out.println("remove John's score " + scoreMap.remove("John"));
        System.out.println("scoreMap " + scoreMap);

        //boolean replace(K key, V oldValue, V newValue)  --if they exist, remove old value and insert new

        System.out.println("Replace Mary score from 100 to 82 " + scoreMap.replace("Mary", 100,82));


        //V replace(K key, V value) --same as previous but without passing old value





    }
}
