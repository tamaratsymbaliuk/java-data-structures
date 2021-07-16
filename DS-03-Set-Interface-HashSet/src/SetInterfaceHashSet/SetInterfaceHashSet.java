package SetInterfaceHashSet;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceHashSet {
    public static void main(String[] args) {
        //Collection of unique items, can't contain duplicates, has no Index comparing to the List interface
        //Set interface -- HashSet is implementing class

        Set<Long> longSet = new HashSet<>();
        System.out.println(" longSet.add(7L) " + longSet.add(7L));
        System.out.println(" longSet.add(7L) " + longSet.add(7L));
        longSet.add(7L);
        longSet.add(7L);
        longSet.add(70L);
        longSet.add(70L);
        System.out.println(longSet.size());
        System.out.println(longSet);

        for (Long each: longSet){
            System.out.print(each + " -> ");
        }
        System.out.println();
        System.out.println("___________________");

        longSet.addAll(Arrays.asList(2L,3L,4L,5L,5L));
        System.out.println(longSet);

        //UPDATE AN ITEM --> check whether it already exists if so, remove it and add another item
        longSet.add(null);
        System.out.println(longSet);
        if( !longSet.add(null)){
            longSet.remove(null);
            longSet.add(0L);
        }
        System.out.println(longSet);





    }
}
