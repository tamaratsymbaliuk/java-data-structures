package comparableInterface;

public class Person implements Comparable<Person> {
    public String name;

    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";


    }


    @Override
    public int compareTo(Person o) {
        //if (this.name.charAt(0) > o.name.charAt(0)) {
        //   return 1;
        //  } else if (this.name.charAt(0) == o.name.charAt(0)) {
        //     if (this.age > o.age) {
        //        return 1;
        //     } else if (this.age == o.age) {
        //           return 0;
        //     } else {
        //         return -1;
        //    }
        // } else{
        //         return -1;
        //   }
        // }

        //there is easier solution: I'm also comparing age when name is equal
        return (this.name.compareTo(o.name) == 0 )
                ? Integer.compare(this.age, o.age): this.name.compareTo(o.name);

    }
}




