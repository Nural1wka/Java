package AnimalPlanet;

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