import java.util.List;
import java.util.TreeSet;

public class TreeSetJ {
    public static void main(String[] args)
    {
        TreeSet<Integer> st = new TreeSet<>();
        st.add(101);
        st.add(102);
        st.add(106);
        System.out.println(st);
        st.addAll(List.of(103,104,105));
        System.out.println(st);
    }
}