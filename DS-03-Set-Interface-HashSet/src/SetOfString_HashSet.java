import java.util.HashSet;
import java.util.Set;

public class SetOfString_HashSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        //HashSet - deciding uniqueness using hashCode and equals methods

        System.out.println(new String("John").hashCode());//returns same number
        System.out.println(new String("John").hashCode());//returns same hashcode

        strSet.add("John");
        strSet.add("Dan");
        strSet.add("John");
        /*
         * HashCode   |  Value
         * 2314539    |  John
         * 68465      |  Dan
         */
        System.out.println(strSet.size());
    }
}
