package Cars;

class Mitsubishi extends Car {
    Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Mitsubishi's engine is starting!";
    }

    @Override
    String accelerate() {
        return "Mitsubishi is accelerating!";
    }

    @Override
    String brake() {
        return "Mitsubishi is braking!";
    }
}
