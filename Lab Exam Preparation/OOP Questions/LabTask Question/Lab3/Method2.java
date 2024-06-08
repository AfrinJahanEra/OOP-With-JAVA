// package Lab3;

// import java.util.Date;

// // Enum for Audio Equipment types
// enum AudioType {
//     CASSETTE_PLAYER,
//     CD_PLAYER,
//     RADIO
// }

// // Enum for Video Equipment types
// enum VideoType {
//     VHS,
//     EIGHT_MM,
//     VIDEO_DISK
// }

// // Base class for electronic equipment
// class ElectronicEquipment {
//     private String manufacturer;
//     private double cost;
//     private Date datePurchased;
//     private String serialNumber;

//     public ElectronicEquipment(String manufacturer, double cost, Date datePurchased, String serialNumber) {
//         this.manufacturer = manufacturer;
//         this.cost = cost;
//         this.datePurchased = datePurchased;
//         this.serialNumber = serialNumber;
//     }

//     // Getters and setters

//     public String getManufacturer() {
//         return manufacturer;
//     }

//     public double getCost() {
//         return cost;
//     }

//     public Date getDatePurchased() {
//         return datePurchased;
//     }

//     public String getSerialNumber() {
//         return serialNumber;
//     }
// }

// // Audio equipment class
// class AudioEquipment extends ElectronicEquipment {
//     private AudioType audioType;

//     public AudioEquipment(String manufacturer, double cost, Date datePurchased, String serialNumber, AudioType audioType) {
//         super(manufacturer, cost, datePurchased, serialNumber);
//         this.audioType = audioType;
//     }

//     // Getter for audio type
//     public AudioType getAudioType() {
//         return audioType;
//     }
// }

// // Video equipment class
// class VideoEquipment extends ElectronicEquipment {
//     private VideoType videoType;

//     public VideoEquipment(String manufacturer, double cost, Date datePurchased, String serialNumber, VideoType videoType) {
//         super(manufacturer, cost, datePurchased, serialNumber);
//         this.videoType = videoType;
//     }

//     // Getter for video type
//     public VideoType getVideoType() {
//         return videoType;
//     }
// }

// public class Method2 {
//     public static void main(String[] args) {
//         // Creating instances of Audio and Video equipment
//         AudioEquipment audioPlayer = new AudioEquipment("Sony", 49.99, new Date(), "123456", AudioType.CD_PLAYER);
//         VideoEquipment videoPlayer = new VideoEquipment("Samsung", 129.99, new Date(), "789012", VideoType.VHS);

//         // Displaying information
//         displayEquipmentInfo(audioPlayer);
//         displayEquipmentInfo(videoPlayer);
//     }

//     private static void displayEquipmentInfo(ElectronicEquipment equipment) {
//         System.out.println("Manufacturer: " + equipment.getManufacturer());
//         System.out.println("Cost: $" + equipment.getCost());
//         System.out.println("Date Purchased: " + equipment.getDatePurchased());
//         System.out.println("Serial Number: " + equipment.getSerialNumber());

//         // if (equipment instanceof AudioEquipment) {
//         //     System.out.println("Audio Type: " + ((AudioEquipment) equipment).getAudioType());
//         // } else if (equipment instanceof VideoEquipment) {
//         //     System.out.println("Video Type: " + ((VideoEquipment) equipment).getVideoType());
//         // }

//         System.out.println("---------------");
//     }
// }


