package setInterfaceSortedSet;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedSet_NavigableSet {
    public static void main(String[] args) {


        NavigableSet<Long> longTreeSet = new TreeSet<>();
        longTreeSet.add(3L);
        longTreeSet.add(20L);
        longTreeSet.add(39L);
        longTreeSet.add(27L);
        longTreeSet.add(20L);


        longTreeSet.addAll(Arrays.asList(66L,55L,44L,22L));
        System.out.println(longTreeSet);

        /** --_NavigableSet methods on top of SortedSet ---
         * E lower();
         * E higher();
         * E floor();
         * E ceiling();
         * E pollFirst();
         * E pollLast();
         * Iterator<E> descendingIterator();
         * NavigableSet<E> descendingSet();
         * NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);
         * NavigableSet<E> headSet(E toElement, boolean inclusive);
         * NavigableSet<E> tailSet(E fromElement, boolean inclusive);
         **/

        System.out.println(" lower(15L): " + longTreeSet.lower(15L));
        System.out.println(" higher 15L: " + longTreeSet.higher(15L)); //20, gives just one number
        System.out.println("floor 20L: "+ longTreeSet.floor(20L));
        System.out.println(" ceiling 15L: "+ longTreeSet.ceiling(15L));

        //longTreeSet.clear();
        System.out.println("before: "  + longTreeSet);
        System.out.println(longTreeSet.pollFirst()); //check if it has item and removes it, if not just prints - null
        System.out.println(longTreeSet.pollLast());
        System.out.println("after: " + longTreeSet);

        System.out.println("descending: " + longTreeSet.descendingSet()); //it doesn't change the original order though

        System.out.println("15L inclusive and 39L exclusive: " + longTreeSet.subSet(15L, false, 39L, true));


        System.out.println(longTreeSet);
        //Iterate the longTreeSet
        Iterator<Long> descIter  = longTreeSet.descendingIterator();
        while(descIter.hasNext()){
            System.out.println(descIter.next());
        }








    }
}

