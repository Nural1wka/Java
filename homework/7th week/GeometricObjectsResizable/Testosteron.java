package GeometricObjectsResizable;

public class Testosteron {
    public static void main(String[] args){
        Circle circle = new Circle(22);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        ResizableCircle donGelik777 = new ResizableCircle(21);
        donGelik777.resize(50);
        System.out.println(donGelik777);
        System.out.println(donGelik777.getPerimeter());
        System.out.println(donGelik777.getArea());
    }
}
