package PoolArea;

class Cuboid extends Rectangle {
    double height;

    Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) this.height = 0;
        else this.height = height;
    }

    double getHeight() {
        return height;
    }

    double getVolume() {
        return getArea() * height;
    }
}
