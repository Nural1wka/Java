package PoolArea;

class Rectangle {
    double width;
    double length;

    Rectangle(double width, double length) {
        if (width < 0) this.width = 0;
        else this.width = width;
        if (length < 0) this.length = 0;
        else this.length = length;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return length;
    }

    double getArea() {
        return width * length;
    }
}
