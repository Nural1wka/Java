package MovingMoving;

public class Test {
    public static void main(String[] args){
        MovablePoint mcQueen = new MovablePoint(2, 3, 4, 5 );
        System.out.println(mcQueen);
        mcQueen.moveUp();
        mcQueen.moveDown();
        mcQueen.moveLeft();
        mcQueen.moveRight();
    }
}
