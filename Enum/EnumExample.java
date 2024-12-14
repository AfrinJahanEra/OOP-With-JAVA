// Example 1: Enum Declaration
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Example 2: Enum Declaration with Additional Methods
enum Direction {
    NORTH {
        @Override
        public void showDirection() {
            System.out.println("North Direction");
        }
    },
    EAST {
        @Override
        public void showDirection() {
            System.out.println("East Direction");
        }
    },
    SOUTH {
        @Override
        public void showDirection() {
            System.out.println("South Direction");
        }
    },
    WEST {
        @Override
        public void showDirection() {
            System.out.println("West Direction");
        }
    };

    // Abstract method to be implemented by each enum constant
    public abstract void showDirection();
}

// Main class to demonstrate usage
public class EnumExample {
    public static void main(String[] args) {
        // Example 1: Enum Usage
        Day today = Day.MONDAY; // This is valid

        // Example 2: Enum Usage with Additional Methods
        Direction.NORTH.showDirection();
    }
}
