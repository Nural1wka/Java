package AnimalPlanet;

class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("WooF!");
    }
    public void greets(Dog another){
        System.out.println("Woooof!");
    }

    @Override
    public String toString() {
        return "AnimalPlanet.Dog[" + super.toString() + "]";
    }
}
