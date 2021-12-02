import java.util.PriorityQueue;

public class Hospitalqueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        System.out.println("Patients:");
        pq.add("Heart patient");
        pq.add("Head injury");
        pq.add("old man");
        pq.add("accident case");
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
    }



}
