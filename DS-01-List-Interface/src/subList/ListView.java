package subList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListView {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        //getting view out of list object
        //view is part of your original list object
        //subList(from,to)
        List<Integer> subList = list.subList(2, 5);
        System.out.println("from 2 to 5: "+ subList);
        subList.set(0, 199);
        System.out.println("sublist : " + subList);
        System.out.println("original list: " + list);
    }
}
