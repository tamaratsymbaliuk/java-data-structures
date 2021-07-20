package mapInterface_HashMap;

import java.util.*;

public class MapView {
    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();
        //String - key, Integer - value
        scoreMap.put("Adam", 90);
        scoreMap.put("John", 92);
        scoreMap.put("Mary", 100);
        scoreMap.put("Diana", 88);
        scoreMap.put("Alex", 78);

        //-----Map View----Map is not iterable, so we use map view to get something iterable
        // Set<K> keySet() ---get all keys
        Set<String> keys = scoreMap.keySet();
        System.out.println(keys);

        for (String eachKey: keys){
            System.out.println("key is: " + eachKey + " value: " + scoreMap.get(eachKey));
        }

        // Collection<V> values()  ---get all values
        Collection<Integer> allScores = scoreMap.values();
        System.out.println(allScores);

        // Set<Entry<K,V>> entrySet()
        //Entry: an interface embedded in Map interface
        // represent a Map entry (key-value pair).

        //methods available:  getValue(), setValue(), getKey()
        System.out.println("______________________");
        Set<Map.Entry<String, Integer>> allEntries = scoreMap.entrySet();

        for (Map.Entry<String, Integer> eachEntry: allEntries){
            System.out.println(eachEntry);
            System.out.println("key: " + eachEntry.getKey() + "| value: " + eachEntry.getValue());

            if (eachEntry.getValue() < 90){
                eachEntry.setValue(95);
            }
        }
        System.out.println(scoreMap);







        

    }
}
