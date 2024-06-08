package Lab5;

public class Whale extends AquaticAnimal {
    private boolean livesInSaltWater;

    public Whale(String name, String species, int age, double finLength, String boneType, boolean livesInSaltWater) {
        super(name, species, age, finLength, boneType);
        this.livesInSaltWater = livesInSaltWater;
    }

    // Getter for whale-specific attribute

    public boolean livesInSaltWater() {
        return livesInSaltWater;
    }

    // Whale-specific behaviors
    public void eatOtherAnimals() {
        System.out.println(getName() + " is eating other animals.");
    }
}
