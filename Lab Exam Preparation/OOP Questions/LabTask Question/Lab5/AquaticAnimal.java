package Lab5;

public class AquaticAnimal extends Animal {
    private double finLength;
    private String boneType;

    public AquaticAnimal(String name, String species, int age, double finLength, String boneType) {
        super(name, species, age);
        this.finLength = finLength;
        this.boneType = boneType;
    }

    // Getters for aquatic animal-specific attributes

    public double getFinLength() {
        return finLength;
    }

    public String getBoneType() {
        return boneType;
    }

    // Aquatic animal-specific behaviors
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}
 
