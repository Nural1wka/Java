public class AnimalPlanet {
    public static void main(String[] args) {
        Animal beast = new Animal("Mandarin");
        System.out.println(beast);
        Mammal cheetos = new Mammal("Aubergine");
        System.out.println(cheetos);
        Cat kisa = new Cat("TIGR");
        System.out.println(kisa);
        kisa.greets();
        Dog hot = new Dog("Rafael");
        Dog hotRod = new Dog("Jacobs");
        System.out.println(hot);
        hot.greets();
        hot.greets(hotRod);
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[ name = " + name + " ]";
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

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
        return "Dog[" + super.toString() + "]";
    }
}
