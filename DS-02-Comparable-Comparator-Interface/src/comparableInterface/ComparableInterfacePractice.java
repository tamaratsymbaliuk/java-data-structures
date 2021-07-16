package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableInterfacePractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Liza");
        list.add("Mike");
        list.add("Mary");
        list.add("Diana");
        System.out.println(list);
        //sortArray alphabetically
        Collections.sort(list);
        System.out.println(list);

        //sort reversed
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);


        //sorting custom data type
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 20));
        people.add(new Person("Adam", 32));
        people.add(new Person("Mary", 10));
        people.add(new Person("John",21));
        System.out.println(people);

        //created a Person class that implements Comparable interface and method override
        //override method is sorting by name and by age if name is equal

        Collections.sort(people);
        System.out.println(people);













    }

}
