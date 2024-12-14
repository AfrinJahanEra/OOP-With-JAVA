package Exceptions;

// Define your custom exception class
class CannotVoteException extends Exception {
    public CannotVoteException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public void canVote(int age) throws CannotVoteException {
        if (age < 18) {
            throw new CannotVoteException("Cannot Vote");
        } else {
            System.out.println("Can vote");
        }
    }

    public static void main(String[] args) {
        int a = 12;
        UserDefinedException obj = new UserDefinedException(); // Create an instance of your class
        try {
            obj.canVote(a); // Call the method using the instance
        } catch (CannotVoteException c) { // Catch the custom exception
            System.out.println("Caught CannotVoteException: " + c.getMessage());
        }
    }
}
// // Define your custom exception class
// class InvalidAgeException extends Exception {
//     public InvalidAgeException(String message) {
//         super(message);
//     }
// }

// // Create a class to demonstrate the use of the custom exception
// public class UserDefinedExceptionExample {
//     public void checkAge(int age) throws InvalidAgeException {
//         if (age < 0 || age > 150) {
//             throw new InvalidAgeException("Invalid age provided: " + age);
//         } else {
//             System.out.println("Valid age: " + age);
//         }
//     }

//     public static void main(String[] args) {
//         UserDefinedExceptionExample example = new UserDefinedExceptionExample();
//         try {
//             example.checkAge(25);
//             example.checkAge(-5); // This will throw an InvalidAgeException
//         } catch (InvalidAgeException e) {
//             System.out.println("Exception caught: " + e.getMessage());
//         }
//     }
// }
