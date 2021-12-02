import java.util.LinkedHashMap;
import java.util.Map;

public class LmapAge {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> age=new LinkedHashMap<>();
        System.out.println("Checking the entries of before entering into competition");
        System.out.println(age.size());
        age.put("Abhi",22);
        age.put("Ravi",21);
        age.put("Deepika",24);
        age.put("priya",18);
        age.put("surya",27);
        System.out.println("After Entries with their name and ages");
        System.out.println(age);
        age.remove("priya");
         System.out.println("Size of Entries");
        System.out.println(age.size());
        System.out.println(age);
        System.out.println("Names and Age groups entering the competition");
        for(Map.Entry<String, Integer> m : age.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}