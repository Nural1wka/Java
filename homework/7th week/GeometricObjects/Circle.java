package GeometricObjects;

public class Circle implements GeometricObject{
    private double radius;
    public Circle(double radius){
        if(radius < 0)      this.radius = 0;
        else    this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + " ]";
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

}
