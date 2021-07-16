package comparatorInterface;

import comparableInterface.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacePractice {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 20));
        people.add(new Person("Adam", 32));
        people.add(new Person("Mary", 10));
        people.add(new Person("John",21));

        Collections.sort(people);

        //Collections.sort(people,comp
        Comparator<Person> comp = new PersonNameComparator();
        Collections.sort(people, comp);
        System.out.println("compare by name: " + people);

        //Compare by age
        Comparator<Person> ageComparator = Comparator.comparing(p -> p.age);

        Collections.sort(people, ageComparator);
        System.out.println("compare by age: " + people);


        //compare by name using lambda expression
        Comparator<Person> nameComparator = (o1, o2) -> o1.name.compareTo(o2.name);

        Comparator<Person> nameReverseComparator = (o1, o2) -> o2.name.compareTo(o1.name);
        Collections.sort(people, nameReverseComparator);
        System.out.println("Reverse Comparator: " + people);


        //compare both reversed age and reverseComparator
        Comparator<Person> nameRTheAgeComp = nameReverseComparator.thenComparing(ageComparator.reversed());
        Collections.sort(people, nameRTheAgeComp);
        System.out.println("compare both reversed age and reverseComparator "+ people);




    }
}
