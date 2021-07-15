package iterator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>(Arrays.asList(3, 4, 5, 7, 8, 988));
        System.out.println(coll);

        //for(Integer each: coll){
        //    System.out.println(each);
        // if(each >10){    ===> will throw an exception, can't rempve item from ArrayCollection
        //     coll.remove(each);
        //      }

        Iterator<Integer> myIter = coll.iterator();

        // hasNext()
        System.out.println(myIter.hasNext());

        //next()
        System.out.println(myIter.next());//3
        System.out.println(myIter.next());//4 --> moves cursor by one

        //remove() --> 4 was removed because the current cursor was located there
        myIter.remove();
        System.out.println(coll);

        //loop through each

        while( myIter.hasNext()){
            Integer each = myIter.next();
            System.out.println("loop through each: " + each);
            //remove everything >10
            if(each >10){
                myIter.remove();
            }
        }
        System.out.println();
        System.out.println(coll);
        //System.out.println(myIter);






    }

    }

