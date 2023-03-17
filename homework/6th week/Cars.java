
public class Cars {
    public static void main(String[] args){
        Mitsubishi yaponec = new Mitsubishi(3, "Asiat");
        Holden evropeikaMb = new Holden(20, "Pendos");
        Ford razboinik = new Ford(30, "Americanec");
        //System.out.println(yaponec.startEngine());
        //System.out.println(yaponec.accelerate());
        //System.out.println(yaponec.brake());
        //System.out.println(evropeikaMb.startEngine());;
        //System.out.println(evropeikaMb.accelerate());
        //System.out.println(evropeikaMb.brake());
        //System.out.println(razboinik.startEngine());
        //System.out.println(razboinik.accelerate());
        //System.out.println(razboinik.brake());

    }
}
class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders, String name){
        if(cylinders < 0)   this.cylinders = 0;
        else    this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    String startEngine(){
        return "Car's engine is starting!";
    }
    String accelerate(){
        return "Car is accelerating!";
    }
    String brake(){
        return "Car is breaking";
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }

}
class Mitsubishi extends Car{
    Mitsubishi(int cylinders, String name){
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
class Holden extends Car{
    Holden(int cylinders, String name){
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
class Ford extends Car{
    Ford(int cylinders, String name){
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
