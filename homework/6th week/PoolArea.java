public class PoolArea {
    public static void main(String[] args){
        //Rectangle kvadrat = new Rectangle(2, 2);
        //System.out.println("The area of the pool is: " + kvadrat.getArea() + "\n" + "The width is: " + kvadrat.getWidth() + "\nThe length is: " + kvadrat.getLength());
        //Cuboid yakubovich = new Cuboid(3, 3, 7);
        //System.out.println("The volume of the pool is: " + yakubovich.getVolume() + "\nThe height of the pool is :" + yakubovich.getHeight());
    }
}
class Rectangle{
    double width;
    double length;
    Rectangle(double width, double length){
        if(width < 0)   this.width = 0;
        else    this.width = width;
        if(length < 0)  this.length = 0;
        else    this.length = length;
    }
    double getWidth(){
        return width;
    }
    double getLength(){
        return length;
    }
    double getArea(){
        return width * length;
    }
}
class Cuboid extends Rectangle{
    double height;
    Cuboid(double width, double length, double height){
        super(width, length);
        if (height < 0)    this.height = 0;
        else    this.height = height;
    }
    double getHeight(){
        return height;
    }
    double getVolume(){
        return getArea()*height;
    }
}
