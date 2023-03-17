package Cars;

class Holden extends Car {
    Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Cars.Holden's engine is starting!";
    }

    @Override
    String accelerate() {
        return "Cars.Holden is accelerating!";
    }

    @Override
    String brake() {
        return "Cars.Holden is braking!";
    }
}
