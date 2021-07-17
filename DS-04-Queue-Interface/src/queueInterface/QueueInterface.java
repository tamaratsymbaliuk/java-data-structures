package queueInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {


        /**
         * Collection
         * Queue
         * Deque
         *
         * LinkedList,ArrayDeque
         */

        /*
         *  Queue methods
         *     Throw Exception    |    Return Special Value
         * Insert : add(e)        |    offer(e)
         * Remove : remove()      |    poll()
         * Examine: element()     |    peek()
         **/

        Queue<Integer> numQue = new LinkedList<>();
        numQue.offer(1);
        numQue.offer(3);
        numQue.offer(4);
        numQue.offer(6);
        numQue.offer(8);
        numQue.addAll(Arrays.asList(4,99,66));

        System.out.println(numQue);

        //remove first item in the queue
        System.out.println(numQue.remove());

     //select item on the current cursor, doesn't move it
        System.out.println(numQue.peek());
     // same as peek(), but throws an exception if queue is empty
        System.out.println(numQue.element());

        System.out.println(numQue);

        //while loop to remove every item in a queue

        while(!numQue.isEmpty()){
            System.out.println("Done with " + numQue.poll());
        }
        System.out.println(numQue.size());





    }


}
