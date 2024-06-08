package Lab5;

class Bird extends Animal {
    private double wingspan;
    private String wingColor;

    public Bird(String name, String species, int age, double wingspan, String wingColor) {
        super(name, species, age);
        this.wingspan = wingspan;
        this.wingColor = wingColor;
    }

    // Getters for bird-specific attributes

    public double getWingspan() {
        return wingspan;
    }

    public String getWingColor() {
        return wingColor;
    }

    // Bird-specific behaviors
    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    public void buildNest() {
        System.out.println(getName() + " is building a nest.");
    }
}
