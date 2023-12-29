import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("devnagri", 22);
        map.put("Rishikesh", 1);
         map.put("Ram Janam Bhumi", 02);
        map.put("Aayodhya", 03);
         map.put("Bolenath ki nagri", 03);
        map.put("Varanasi", 04);
        
        System.out.println(map);
        System.out.println();
        map.get("devnagri");
        int i = map.size();
        map.replace("Aayodhya",33);
        System.out.println(map);
        System.out.println("Size of map is "+ i);
       boolean b = map.containsKey("Varanasi");
        System.out.println(b);
    }
}
