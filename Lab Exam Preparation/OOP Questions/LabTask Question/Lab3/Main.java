package Lab3;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Equipment, AudioEquipment, and VideoEquipment
        AudioEquipment audio1 = new AudioEquipment("Sony", 100.0, 2020, "SN123", "CD player");
        VideoEquipment video1 = new VideoEquipment("Samsung", 200.0, 2018, "SN456", "VHS");

        // Printing details and calculating depreciation
        System.out.println("Audio Equipment Details:");
        audio1.printDetails();
        System.out.println("Depreciated Value: $" + audio1.calculateDepreciation(2024));

        System.out.println("\nVideo Equipment Details:");
        video1.printDetails();
        System.out.println("Depreciated Value: $" + video1.calculateDepreciation(2024));
    }
}
 
