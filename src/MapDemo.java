import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {


//        Map<Integer,String> map = new HashMap();
//        map.put(1,"Amol");
//        map.put(2,"Pratik");
//        map.put(3,"Akshita");
//
//        System.out.println(map.get(2));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        System.out.println(entries);
//
//
//        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, String> next = iterator.next();
//
//
//         System.out.println(next.getKey()+"**********"+next.getValue());

        Map<String, Integer> map = new HashMap<>();
        map.put("Amol",1);
        map.put("Pratik",2);
        map.put("Akshita",3);

        System.out.println(map);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();

            System.out.println(next.getKey()+" :::::: " + next.getValue());
//            System.out.println(next);
        }

    }
}
