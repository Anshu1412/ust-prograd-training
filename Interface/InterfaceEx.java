
    interface Tv{
        public default void display(){
            System.out.println("Sony");
        }
    }
    interface Tv1{
        public default void display(){
            System.out.println("Samsung");
        }
    }
    public class InterfaceEx implements Tv,Tv1 {
        public static void main(String[] args) {
            InterfaceEx Tv = new InterfaceEx();
            Tv.display();
        }

        public void display() {
            Tv.super.display();
            Tv1.super.display();
        }
    }
