package sortedMap;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Practice {
    public static void main(String[] args) {
        /**
         *  An object that maps keys to values
         *  A map cannot contain duplicate keys
         *   each key can map to at most one value
         *         * Map General Implementation -- HashMap
         *
         *         * SortedMap  extends Map interface
         *         * NavigableMap extends SortedMap interface
         *         * TreeMap implements NavigatableMap
         */

        SortedMap<String, Integer>  scoreMap = new TreeMap<>();

        // V put(K key, V Value);
        scoreMap.put("Adam", 90);
        scoreMap.put("John", 92);
        scoreMap.put("Mary", 100);
        scoreMap.put("Jill", 70);
        scoreMap.put("Jack", 52);
        scoreMap.put("Dave", 93);

        System.out.println(scoreMap); //sorted by key

        //------SortedMap methods
        // K firstKey()
        System.out.println("first Key: " + scoreMap.firstKey()); //Adam

        // K lastKey()
        System.out.println("last Key: " + scoreMap.lastKey()); //Mary

        // ----view-----
        // SortedMap<K, V> subMap(K fromKey, K toKey)
        System.out.println(scoreMap.subMap("Dave", "Mary")); //mary is not included

        //SortedMap<K, V> headMap(K toKey)
        System.out.println("Everything before Jack, Jack not included: " + scoreMap.headMap("Jack"));
        //SortedMap<K, V> tailMap(K toKey)
        System.out.println("Everything after Jack, Jack included: " + scoreMap.tailMap("Jack"));
        SortedMap<String, Integer> tailView = scoreMap.tailMap("Jack");
        tailView.replace("Jack", 64);

        System.out.println(tailView);
        System.out.println(scoreMap); //Jack was also updated here


    }
}
