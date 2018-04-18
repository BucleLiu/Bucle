package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String args[]){
        People [] people = {new People("A",21),
                            new People("B",19),
                            new People("C",20)};
        System.out.println("排序前：");
        for (People p: people) {
            System.out.println(p.getName()+","+p.getAge());
        }
        Arrays.sort(people,new PeopleComparator());
        System.out.println("排序后：");
        for (People p: people) {
            System.out.println(p.getName()+","+p.getAge());
        }
    }
}

class PeopleComparator implements Comparator<People>{

    @Override
    public int compare(People o1, People o2) {
        if(o1.age > o2.age)
            return 1;
        else if(o1.age < o2.age)
            return -1;
        else
            return 0;
    }
}

class People{
    String name;
    int age;
    public People(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
