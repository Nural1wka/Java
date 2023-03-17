package MovingMovingWithMovableCircle;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }
}
