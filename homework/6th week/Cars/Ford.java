package Cars;

class Ford extends Car {
    Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    String startEngine() {
        return "Cars.Ford's engine is starting!";
    }

    @Override
    String accelerate() {
        return "Cars.Ford is accelerating!";
    }

    @Override
    String brake() {
        return "Cars.Ford is braking!";
    }
}
