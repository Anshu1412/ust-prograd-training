public class Rectangle {
    double length;
    double breadth;

    Rectangle(double length,double breadth){
        if (length<= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Measurement won't be negative");
        }
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {


        return length * breadth;
    }
    public double perimeter(){

        return 2*(length+ breadth);

    }
}
