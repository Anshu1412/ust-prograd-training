import java.util.Vector;

public class Jvector{
    public static void main(String[] args) {
        Vector<String> vector= new Vector<>();
        vector.add("Fun");
        vector.add("is");
        vector.add("with");
        vector.add("Java");
        System.out.println(vector);
        vector.remove("with");
        System.out.println(vector);
    }
}