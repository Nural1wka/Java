package Cars;

class Ford extends Car {
    Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Ford's engine is starting!";
    }

    @Override
    String accelerate() {
        return "Ford is accelerating!";
    }

    @Override
    String brake() {
        return "Ford is braking!";
    }
}
