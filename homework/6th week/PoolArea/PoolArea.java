package PoolArea;

public class PoolArea {
    public static void main(String[] args){
        Rectangle kvadrat = new Rectangle(2, 2);
        System.out.println("The area of the pool is: " + kvadrat.getArea() + "\n" + "The width is: " + kvadrat.getWidth() + "\nThe length is: " + kvadrat.getLength());
        Cuboid yakubovich = new Cuboid(3, 3, 7);
        System.out.println("The volume of the pool is: " + yakubovich.getVolume() + "\nThe height of the pool is: " + yakubovich.getHeight());
    }
}
