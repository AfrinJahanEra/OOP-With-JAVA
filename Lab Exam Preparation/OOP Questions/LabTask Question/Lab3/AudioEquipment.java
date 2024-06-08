package Lab3;

class AudioEquipment extends Equipment {
    String equipmentType;

    // Default constructor
    AudioEquipment() {}

    // Constructor with parameters
    AudioEquipment(String manufacturer, double cost, int datePurchased, String serialNumber, String equipmentType) {
        super(manufacturer, cost, datePurchased, serialNumber);
        this.equipmentType = equipmentType;
    }
}

