import java.util.HashSet;
import java.util.List;
class HashSetJ {
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>();
        hs.add("ECE");
        hs.add("EEE");
        hs.add("CSE");
        System.out.println(hs);
        hs.addAll(List.of("MCA","MBA"));
        System.out.println(hs);
    }
}