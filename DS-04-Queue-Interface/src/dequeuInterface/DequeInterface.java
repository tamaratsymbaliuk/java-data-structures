package dequeuInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
    public static void main(String[] args) {
        /**
         * Collection
         * Queue
         * Deque
         *
         * LinkedList,ArrayDeque
         */

        /*
         *  Deque methods
         *                Head    |    Tail
         * Insert : addFirst(e)   |  AddLast(e)
         *          offerFirst(e) |  offerLast(e)
         *          push(e)
         * Remove : removeFirst() |  removeLast(e)
         *          pollFirst()   |  pollLast()
         *          pop()
         * Examine: getFirst()    |  getLast()
         *          peekFirst()   |  peekLast()
         **/

        Deque<Integer> dque = new ArrayDeque<>();
        dque.push(1);
        dque.push(3);
        dque.push(4);
        dque.push(6);
        dque.push(8);
        dque.push(20);

        System.out.println(dque); //20, 8, 6, 4, 3, 1

        System.out.println(dque.pop()); //20

        System.out.println(dque); //8, 6, 4, 3, 1

        //provides Last-In-First-Out structure

        while( !dque.isEmpty()){
            System.out.println(" removing items: " + dque.pop());
        }




    }
}
