package Lab3;

class VideoEquipment extends Equipment {
    String equipmentType;

    // Default constructor
    VideoEquipment() {}

    // Constructor with parameters
    VideoEquipment(String manufacturer, double cost, int datePurchased, String serialNumber, String equipmentType) {
        super(manufacturer, cost, datePurchased, serialNumber);
        this.equipmentType = equipmentType;
    }
}