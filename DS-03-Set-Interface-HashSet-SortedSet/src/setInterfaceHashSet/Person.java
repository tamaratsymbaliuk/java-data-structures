package setInterfaceHashSet;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return 1000;
    }


    @Override
  public boolean equals(Object obj){
       Person p = (Person) obj;
       if(this.name.equals(p.name) && this.age ==p.age){
        return true;
       }
       return false;

    }

}
