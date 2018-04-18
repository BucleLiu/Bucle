package map;

import java.util.*;

public class TestMap {
    public static void main(String args[]) throws Exception{
        //HashMap特点：异步执行，效率高，允许null为key，遍历时查询的顺序随机
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(3,"张三");
        map.put(2,"李四");
        map.put(4,"王五");
        map.put(0,"赵六");
        //map.put(null,"空值");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> m = iterator.next();
            System.out.println(m.getKey()+','+m.getValue());
        }

        //Hashtable特点：同步执行，效率低，不允许为null的key
        Map<Integer,String> map_t = new Hashtable<>();

        //LinkHashMap特点：异步执行，保存的数据保存进去的顺序，所以在遍历的时候按序输出，故效率较低；支持双向列表；
        Map<Integer,String> map_l = new LinkedHashMap<>();

        //保存的记录能够根据key排序，默认升序；不允许键值为空，异步执行；
        Map<Integer,String> map_tree = new TreeMap<>();
    }
}
