package listPractice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        // List - Ordered collection(indexed), may contain duplicates
        List<Double> lst = new LinkedList<>(Arrays.asList(3d,5d,66d,67d,77d,3d,3d));
        System.out.println(lst);

        // accessing items using index
        System.out.println("first item: lst.get(0): " + lst.get(0));

        //adding items in certain index
        lst.add(1,99d);
        System.out.println(lst);

        //updating items in certain index

        lst.set(0,666d);
        System.out.println(lst);

        //getting indexes of certain items
        System.out.println("lst.indexOf(99.0): "+lst.indexOf(99.0) );
        System.out.println("lst.indexOf(3.0): "+lst.indexOf(3.0) );

        System.out.println("if item is not found, it gives us "+ lst.indexOf(1000.0));

        //remove(actual Object)

        //remove(index)
        System.out.println("remove second item: lst.remove(1): "+ lst.remove(1));

        System.out.println(lst);

        //addAll at certain index

        lst.addAll(2,Arrays.asList(88D,56D));
        System.out.println(lst);

        //replaceAll (Function: UnaryOperator)
        System.out.println("replace each item with new value increased by 5: ");
        lst.replaceAll(each -> each +5);
        System.out.println(lst);

        //sort, null(ascending order)
        lst.sort(null);
        System.out.println(lst);
        //lst.sort(Comparator.naturalOrder());
        lst.sort(Comparator.reverseOrder());
        System.out.println(lst);
    }
}
