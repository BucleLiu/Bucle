package collocation;

import java.util.*;

public class TestList {
    public static void main(String args[]){
        //ArrayList特点：异步执行、由于是存储的是数组，增删时会影响所有数据的下标索引，故增删速度慢；但是查询速度快
        List<String> list_a = new ArrayList<>();
        list_a.add("哈哈1");
        list_a.add("哈哈2");
        list_a.add("哈哈3");
        list_a.add("哈哈4");
        System.out.println("ArrayList Test:");
        Iterator<String> iterator_a = list_a.iterator(); //实例化Iterator
        while (iterator_a.hasNext()){
            System.out.println(iterator_a.next());
        }

        //LinkedList特点：功能与arrayList区别不大，由于其存储的是链表结构，对数据进行增删操作效率更高，但是查询效率较低
        List<String> list_l = new LinkedList<>();
        list_l.add("哈哈1");
        list_l.add("哈哈2");
        list_l.add("哈哈3");
        list_l.add("哈哈4");
        System.out.println("LinkedList Test:");
        Iterator<String> iterator_l = list_l.iterator(); //实例化Iterator
        while (iterator_l.hasNext()){
            System.out.println(iterator_l.next());
        }

        //Vector特点：同步执行，效率较低
        List<String> list_v = new Vector<>();
        list_v.add("哈哈1");
        list_v.add("哈哈2");
        list_v.add("哈哈3");
        list_v.add("哈哈4");
        System.out.println("ArrayList Test:");
        Iterator<String> iterator_v = list_v.iterator(); //实例化Iterator
        while (iterator_v.hasNext()){
            System.out.println(iterator_v.next());
        }
    }
}
