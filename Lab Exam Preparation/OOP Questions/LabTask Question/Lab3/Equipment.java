package Lab3;

public class Equipment {
    String manufacturer;
    double cost;
    int datePurchased;
    String serialNumber;

    // Default constructor
    Equipment() {}

    // Constructor with parameters
    Equipment(String manufacturer, double cost, int datePurchased, String serialNumber) {
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.datePurchased = datePurchased;
        this.serialNumber = serialNumber;
    }

    double calculateDepreciation(int currentYear) {
        int age = currentYear - datePurchased;
        double depreciationRate = 0.2; // 20% depreciation per year
        return cost * Math.pow((1 - depreciationRate), age);
    }

    void printDetails() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Cost: $" + cost);
        System.out.println("Date Purchased: " + datePurchased);
        System.out.println("Serial Number: " + serialNumber);
    }
}
