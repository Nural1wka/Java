import java.util.Scanner;

public class CylinderAndCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Type the radius of the circle: ");
        //Circle krug = new Circle(sc.nextDouble());
        //System.out.println("Type the radius and height of the cylinder: ");
        //Cylinder apparat = new Cylinder(sc.nextDouble(), sc.nextDouble());
        //System.out.println("The area of this circle is: " + krug.getArea());
        //System.out.println("The volume of this cylinder is: " + apparat.getVolume());
        //System.out.println("The radius of the circle is: " + krug.getRadius());
        //System.out.println("The radius of the cylinder is: " + apparat.getRadius());
        //System.out.println("The height of the cylinder is: " + apparat.getHeight());
    }
}
class Circle{
    double radius;
    Circle(double radius){
        if(radius <= 0)    this.radius = 0;
        else    this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}
class Cylinder extends Circle{
    double height;
    Cylinder(double radius, double height){
        super(radius);
        if(height <= 0)    this.height = 0;
        else    this.height = height;
    }
    double getHeight(){
        return height;
    }
    double getVolume(){
        return getArea()*height;
    }
}