class Shapes {
    public int l,b;
    public double area()
    {
        return l*b;
    }
}
class Cuboid extends Shapes{
    public int h;
    public double volume() {
        return area() * h;
    }
}
public class App {
    public static void main(String[] args)
    {
        Cuboid cuboid = new Cuboid();
        cuboid.l=2;
        cuboid.b=3;
        cuboid.h=4;
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
    }
}
