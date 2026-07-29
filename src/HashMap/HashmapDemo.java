package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Vivek");
        map.put(2,"Gian");
        map.put(3,"Tiger");
        map.put(2,"Nobita");
        System.out.println(map);
        String s = map.get(2);
        System.out.println(s);
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("Vivek"));
        for(int i :map.keySet()){
            System.out.println(i);
        }
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
       boolean b =  map.remove(2,"Gian");
        System.out.println(b);

    }
}
