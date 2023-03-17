package GeometricObjects;

public class Test {
    public static void main(String[] args){
        Circle krug = new Circle(7);
        System.out.println(krug);
        System.out.println(krug.getArea());
        System.out.println(krug.getPerimeter());
        Rectangle kvadrat = new Rectangle(3.3, 2.0);
        System.out.println(kvadrat);
        System.out.println(kvadrat.getArea());
        System.out.println(kvadrat.getPerimeter());
    }
}
