
import java.util.ArrayDeque;

class Jdequeue {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        System.out.println("Random cards:");
        dq.add("queen");
        dq.addFirst("King");
        dq.add("joker");
        dq.add("Ace");
        System.out.println(dq);
        dq.remove("joker");
        System.out.println(dq);
    }
}