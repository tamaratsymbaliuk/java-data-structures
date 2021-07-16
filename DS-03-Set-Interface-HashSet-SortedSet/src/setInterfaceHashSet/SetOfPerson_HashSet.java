package setInterfaceHashSet;

import java.util.HashSet;
import java.util.Set;

public class SetOfPerson_HashSet {
    public static void main(String[] args) {


        Set<Person> pSet = new HashSet<>();

        Person p1 = new Person("Mike", 20);
        Person p2 = new Person("Mike", 20);
        Person p3 = new Person("Mike", 21);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        /*
         * HashCode   |  Value
         * 1456208737 |  new Person("Mike",20);
         * 288665596  |  new Person("Mike",20);
         * 13648335   |  new Person("Mike",20);
         */

        pSet.add(p1);
        pSet.add(p2);
        pSet.add(p3);


        System.out.println(pSet.size());
        System.out.println(p1.equals(p2)); //gives true because it's overridden in Person class



        /*
         * HashCode   |  Value
         * 1000 |  new Person("Mike",20); because it's overridden in Person class
         */
    }

}
