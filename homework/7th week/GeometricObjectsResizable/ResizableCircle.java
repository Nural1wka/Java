package GeometricObjectsResizable;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }
    public void resize(int percent){
        this.radius = radius * (percent/100.0);
        System.out.println(this.radius);
    }
}
