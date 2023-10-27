package J_collection;

import java.util.HashMap;
import java.util.Map;

public class j_map {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"nani");
        map.put(2,"siva");

        System.out.println(map);
        map.replace(2,"kishore");
        System.out.println(map);
        System.out.println(map.get(2));
    }
}
