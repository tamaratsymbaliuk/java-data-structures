package collectioninterfacemethods;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.IntFunction;

public class CollectionMethodsPractice {
    public static void main(String[] args) {
        //Common Collection interface methods
        Collection <Integer> coll = new ArrayList<>();

        //adding items
        coll.add(3);
        coll.add(30);
        coll.add(13);

        System.out.println(coll);
       //adding multiple items in one shot
        coll.addAll(Arrays.asList(4, 5, 6, 7, 8, 9));
        System.out.println(coll);

        //getting size
        System.out.println("Coll size(): " +coll.size());
        //empty or not
        System.out.println(" coll.isEmpty(): "+ coll.isEmpty());

        //remove item
        coll.remove(13);
        System.out.println("13 was removed: "+ coll);

        //contains item
        coll.contains(7);
        System.out.println("coll contains 7 "+   coll.contains(7) );
        //contains All items
        System.out.println(coll.containsAll(Arrays.asList(4,5,6)));
        //remove All
        System.out.println("remove 4,5,6 "+ coll.removeAll(Arrays.asList(4,5,6)));
        System.out.println(coll);

        //retains All
        coll.retainAll(Arrays.asList(3,30,7,8));
        System.out.println(coll);

        //removeIf
        coll.removeIf(each -> each > 10);
        System.out.println(coll);

        //Turning into array
        Integer[] inArray = coll.toArray(new Integer[4]);
        System.out.println(Arrays.toString(inArray));




    }
}
