import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("dev", 22);
        map.put("raj", 1);
         map.put("hault", 02);
        map.put("hex", 03);
         map.put("text", 03);
        map.put("keep", 04);
        
        System.out.println(map);
        System.out.println();
        map.get("keep");
        int i = map.size();
        map.replace("rex",33);
        System.out.println(map);
        System.out.println("Size of map is "+ i);
       boolean b = map.containsKey("commit");
        System.out.println(b);
    }
}
