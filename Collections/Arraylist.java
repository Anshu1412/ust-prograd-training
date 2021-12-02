
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Students ids:");
        arrayList.add(1001);
        arrayList.add(1002);
        arrayList.add(1003);
        arrayList.add(1005);
        arrayList.add(3,1004);
        System.out.println(arrayList);
    }
}