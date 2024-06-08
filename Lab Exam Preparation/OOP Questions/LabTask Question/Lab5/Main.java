package Lab5;


public class Main {
    public static void main(String[] args) {
        // Create instances of animals
        Bird sparrow = new Bird("Sparrow", "Bird", 2, 20.0, "Brown");
        Fish goldfish = new Fish("Goldfish", "Fish", 1, 5.0, "Light", "Freshwater");
        Whale humpbackWhale = new Whale("Humpback Whale", "Whale", 5, 150.0, "Spongy", true);
        Seal harborSeal = new Seal("Harbor Seal", "Seal", 3, 10.0, "Spongy", false);

        // Test behaviors
        sparrow.eat();
        sparrow.fly();
        sparrow.buildNest();

        goldfish.eat();
        goldfish.swim();
        goldfish.eatZooplankton();

        humpbackWhale.eat();
        humpbackWhale.swim();
        humpbackWhale.eatOtherAnimals();

        harborSeal.eat();
        harborSeal.swim();
        harborSeal.eatOtherAnimals();
    }
}

