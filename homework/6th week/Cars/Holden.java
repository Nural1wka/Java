package Cars;

class Holden extends Car {
    Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Holden's engine is starting!";
    }

    @Override
    String accelerate() {
        return "Holden is accelerating!";
    }

    @Override
    String brake() {
        return "Holden is braking!";
    }
}
