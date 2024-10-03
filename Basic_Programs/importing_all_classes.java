// Importing all classes from the java.util package
import java.util.*;

public class AllClassesImport {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        System.out.println("Fruits: " + list);
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        
        System.out.println("Map: " + map);
    }
}
