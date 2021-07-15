package subList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SpecialListIterator {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //list Iterator
        ListIterator<Integer> listIterator = lst.listIterator();

        //hasNext()
        System.out.println("listIterator.hasNext(): " + listIterator.hasNext());

        //nextIndex()
        System.out.println("listIterator.nextIndex(): " + listIterator.nextIndex());

        //iterate through each List

        while(listIterator.hasNext()){
            System.out.print("listIterator.nextIndex(): " + listIterator.nextIndex());
            Integer item = listIterator.next();
            System.out.println("| Item is " + item);

            if(item < 7){
                listIterator.remove();
                //because we removed item index stays at 0 (nextIndex() : 0
            }

        }
        System.out.println("final :" + lst);

        System.out.println("listIterator.hasPrevious(): "+ listIterator.hasPrevious());
        System.out.println("listIterator.previousIndex(): "+ listIterator.previousIndex());
        //System.out.println("listIterator.previous(): "+ listIterator.previous());

        while(listIterator.hasPrevious()){
            System.out.println("listIterator.previousIndex(): "+ listIterator.previousIndex());
            Integer item = listIterator.previous();
            System.out.println("| Item is " + item);

            if( item < 8){
                listIterator.remove();
            }
            if(item >8){
                listIterator.set(666);
            }

        }
        System.out.println(lst);








    }
}
