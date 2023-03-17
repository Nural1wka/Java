package MovingMovingWithMovableCircle;

public class Test {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(2, 4, 5, 3);
        System.out.println(point);
        //point.moveUp();
        //point.moveDown();
        //point.moveLeft();
        //point.moveRight();
        MovableCircle circle = new MovableCircle(4, 3, 5, 7, 6);
        System.out.println(circle);
    }
}
