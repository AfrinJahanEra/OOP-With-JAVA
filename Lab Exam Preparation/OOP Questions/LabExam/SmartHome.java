// Define the Light class
class Light {
    private boolean status;

    public Light() {
        this.status = false; // Initially off
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public boolean getStatus() {
        return this.status;
    }
}

// Define the Thermostat class
class Thermostat {
    private int temperature; // Private attribute

    public Thermostat(int initialTemperature) {
        this.temperature = initialTemperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }
}

// Define the Speaker class
class Speaker {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}

// Define the Room class (parent class for all rooms)
class Room {
    protected Light light;
    protected Thermostat thermostat;
    protected Speaker speaker;

    public Room() {
        this.light = new Light();
        this.thermostat = new Thermostat(20); // Default temperature
        this.speaker = new Speaker();
    }

    public Light getLight() {
        return this.light;
    }

    public Thermostat getThermostat() {
        return this.thermostat;
    }

    public Speaker getSpeaker() {
        return this.speaker;
    }
}

// Define specific rooms
class Bedroom extends Room {
    public Bedroom() {
        super();
        this.thermostat.setTemperature(20); // Initial temperature for bedroom
        this.speaker.setMessage("Welcome to your place of comfort!");
    }
}

class LivingRoom extends Room {
    public LivingRoom() {
        super();
        this.light.turnOn(); // Turn on light for living room
        this.thermostat.setTemperature(25); // Initial temperature for living room
        this.speaker.setMessage("Hope you had a great day!");
    }
}

class GuestRoom extends Room {
    public GuestRoom() {
        super();
        this.thermostat.setTemperature(18); // Initial temperature for guest room
        this.speaker.setMessage("Enjoy your stay!");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        Bedroom bedroom = new Bedroom();
        GuestRoom guestRoom = new GuestRoom();

        // Display light status
        System.out.println("Living room light status: " + (livingRoom.getLight().getStatus() ? "On" : "Off"));
        System.out.println("Bedroom light status: " + (bedroom.getLight().getStatus() ? "On" : "Off"));
        System.out.println("Guest room light status: " + (guestRoom.getLight().getStatus() ? "On" : "Off"));

        // Display temperatures
        System.out.println("Bedroom temperature: " + bedroom.getThermostat().getTemperature());
        System.out.println("Living room temperature: " + livingRoom.getThermostat().getTemperature());
        System.out.println("Guest room temperature: " + guestRoom.getThermostat().getTemperature());

        // Display speaker messages
        System.out.println("Bedroom speaker message: " + bedroom.getSpeaker().getMessage());
        System.out.println("Living room speaker message: " + livingRoom.getSpeaker().getMessage());
        System.out.println("Guest room speaker message: " + guestRoom.getSpeaker().getMessage());
    }
}
