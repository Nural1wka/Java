package GeometricObjectsResizable;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + " ]";
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
