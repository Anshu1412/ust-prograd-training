
import java.util.LinkedList;
public class Linkedlist{
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();
        System.out.println("Student names:");
        ll.add("Abhi");
        ll.add("Rahul");
        ll.add("Kumar");
        System.out.println(ll);
        ll.add(1,"Ramesh");
        ll.lastIndexOf("Kumar");
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        System.out.println(ll.lastIndexOf("Ramesh"));
    }
}