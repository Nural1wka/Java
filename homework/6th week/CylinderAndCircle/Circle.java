package CylinderAndCircle;

class Circle {
    double radius;

    Circle(double radius) {
        if (radius <= 0) this.radius = 0;
        else this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
