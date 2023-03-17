package CylinderAndCircle;

class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        super(radius);
        if (height <= 0) this.height = 0;
        else this.height = height;
    }

    double getHeight() {
        return height;
    }

    double getVolume() {
        return getArea() * height;
    }
}
