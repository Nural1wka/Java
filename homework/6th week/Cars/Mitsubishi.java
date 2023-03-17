package Cars;

class Mitsubishi extends Car {
    Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Cars.Mitsubishi's engine is starting!";
    }

    @Override
    String accelerate() {
        return "Cars.Mitsubishi is accelerating!";
    }

    @Override
    String brake() {
        return "Cars.Mitsubishi is braking!";
    }
}
