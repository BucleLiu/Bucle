package map;

import java.util.*;

public class TestCollocationTrans {
    public static void main(String args[]){
        List<String> list_a = new ArrayList<>();
        list_a.add("哈哈1");
        list_a.add("哈哈2");
        list_a.add("哈哈3");
        list_a.add("哈哈4");
        Set<String> set = new HashSet<>();
        set.addAll(list_a);
        Map<UUID,String> map = new Hashtable<>();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            map.put(UUID.randomUUID(),iterator.next());
        }
        Set<Map.Entry<UUID,String>> set1 = map.entrySet();
        Iterator<Map.Entry<UUID,String>> iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Map.Entry<UUID,String> m = iterator1.next();
            System.out.println(m.getKey()+","+m.getValue());
        }
    }
}
