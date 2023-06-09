package Cars;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        if (cylinders < 0) this.cylinders = 0;
        else this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    String startEngine() {
        return "Car's engine is starting!";
    }

    String accelerate() {
        return "Car is accelerating!";
    }

    String brake() {
        return "Car is breaking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}
