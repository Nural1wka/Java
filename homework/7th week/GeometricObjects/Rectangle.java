package GeometricObjects;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;
    public Rectangle(double width, double length){
        if(width < 0) this.width = 0;
        else    this.width = width;
        if(length < 0) this.length = 0;
        else    this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[ width = " + width + ", length = " + length + " ]";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
