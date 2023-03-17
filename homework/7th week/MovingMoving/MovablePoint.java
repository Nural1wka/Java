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
        this.y = this.y - ySpeed;
        System.out.println(this.y);
    }

    @Override
    public void moveDown() {
        this.y = this.y + this.ySpeed;
        System.out.println(this.y);
    }

    @Override
    public void moveLeft() {
        this.x = this.x - this.xSpeed;
        System.out.println(this.x);
    }

    @Override
    public void moveRight() {
        this.x = this.x + this.xSpeed;
        System.out.println(this.x);
    }
}
