package Lab5;

public class Fish extends AquaticAnimal {
    private String waterType;

    public Fish(String name, String species, int age, double finLength, String boneType, String waterType) {
        super(name, species, age, finLength, boneType);
        this.waterType = waterType;
    }

    // Getter for fish-specific attribute

    public String getWaterType() {
        return waterType;
    }

    // Fish-specific behaviors
    public void eatZooplankton() {
        System.out.println(getName() + " is eating zooplankton.");
    }
}
