package MovingMoving;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(" + x + " , " + y + "), speed = (" + xSpeed + ", " + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        int y = this.y - ySpeed;
        System.out.println(y);
    }

    @Override
    public void moveDown() {
        int y = this.y + ySpeed;
        System.out.println(y);
    }

    @Override
    public void moveLeft() {
        int x = this.x - xSpeed;
        System.out.println(x);
    }

    @Override
    public void moveRight() {
        int x = this.x + xSpeed;
        System.out.println(x);
    }
}
