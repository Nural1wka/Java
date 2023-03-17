package AnimalPlanet;

class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("MEOW,MF!");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}

