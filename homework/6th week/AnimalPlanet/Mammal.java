package AnimalPlanet;

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "AnimalPlanet.Mammal[" + super.toString() + "]";
    }
}

