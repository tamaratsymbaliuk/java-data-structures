package setInterfaceSortedSet;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Interface {
    public static void main(String[] args) {

        //SortedSet is a type of set that maintain Sorted Order on top of uniqueness
        /**   Collection interface
         *    Set extends Collection interface
         *    SortedSet extends Set interface
         *    NavigableSet extends SortedSet interface
         *    TreeSet class implements NavigableSet interface
         */

        /** ---SortedSet Method ---
         * E first();
         * E last();
         * SortedSet<E> subSet(E fromElement, E toElement);
         * SortedSet<E> headSet(e toElement);
         * SortedSet<E> tailSet(E fromElement);
         **/

        SortedSet<Long> longTreeSet = new TreeSet<>();
        longTreeSet.add(3L);
        longTreeSet.add(3L);
        longTreeSet.add(39L);
        longTreeSet.add(30L);
        longTreeSet.add(30L);

        System.out.println(longTreeSet); //3,30,39

        System.out.println("first " + longTreeSet.first()); //3
        System.out.println("last " + longTreeSet.last()); //39

        longTreeSet.addAll(Arrays.asList(15L,18L,15L,18L,20L));
        System.out.println(longTreeSet); //3,15,18,30,39

        //SortedSet --> null is not allowed
        //longTreeSet.add(null); BAD!

        System.out.println("longTreeSet.subSet(15L,21L): "+ longTreeSet.subSet(15L,21L));

        System.out.println("from beginning to the 18L: "+ longTreeSet.headSet(18L));

        System.out.println("from 18L to the end: "+ longTreeSet.tailSet(18L));

        SortedSet<Long> tailView = longTreeSet.tailSet(18L);
        tailView.remove(20L);
        System.out.println(tailView);











    }

}
