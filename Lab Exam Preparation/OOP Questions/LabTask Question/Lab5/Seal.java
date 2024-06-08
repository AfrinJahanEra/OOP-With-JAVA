package Lab5;

public class Seal extends AquaticAnimal {
    private boolean livesInSaltWater;

    public Seal(String name, String species, int age, double finLength, String boneType, boolean livesInSaltWater) {
        super(name, species, age, finLength, boneType);
        this.livesInSaltWater = livesInSaltWater;
    }

    // Getter for seal-specific attribute

    public boolean livesInSaltWater() {
        return livesInSaltWater;
    }

    // Seal-specific behaviors
    public void eatOtherAnimals() {
        System.out.println(getName() + " is eating other animals.");
    }
}
