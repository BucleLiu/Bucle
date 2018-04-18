package comparable;

import java.util.Arrays;

public class TestComparable {
    public static void main(String args[]){
        Person [] person = {new Person("A",21),new Person("B",19),new Person("C",20)};
        for (Person p: person) {
            System.out.println(p.getName()+","+p.getAge());
        }
        Arrays.sort(person);
        for (Person p: person) {
            System.out.println(p.getName()+","+p.getAge());
        }
    }
}

class Person implements Comparable<Person>{
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age > o.age)
            return 1;
        else if(this.age < o.age)
            return -1;
        else
            return 0;
    }
}
