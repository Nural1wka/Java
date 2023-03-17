package CylinderAndCircle;

import java.util.Scanner;

public class CylinderAndCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the radius of the circle: ");
        Circle krug = new Circle(sc.nextDouble());
        System.out.println("Type the radius and height of the cylinder: ");
        Cylinder apparat = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("The area of this circle is: " + krug.getArea());
        System.out.println("The volume of this cylinder is: " + apparat.getVolume());
        System.out.println("The radius of the circle is: " + krug.getRadius());
        System.out.println("The radius of the cylinder is: " + apparat.getRadius());
        System.out.println("The height of the cylinder is: " + apparat.getHeight());
    }
}

