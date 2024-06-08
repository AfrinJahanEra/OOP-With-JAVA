package Lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOperations {

    private ArrayList<Integer> numbers;

    public NumberOperations() {
        this.numbers = new ArrayList<>();
    }

    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            try {
                int num = scanner.nextInt();
                numbers.add(num);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine(); // Clear the buffer
                i--; // Decrement i to retake the input
            }
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public void accessInvalidIndex() {
        try {
            System.out.println("Number at index 8: " + numbers.get(8));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured.");
        }
    }

    public void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = Math.max(num1, num2) / Math.min(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured.");
        }
    }

    public void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers (textual): ");

        try {
            String text1 = scanner.nextLine();
            String text2 = scanner.nextLine();
            int num1 = Integer.parseInt(text1);
            int num2 = Integer.parseInt(text2);
            int product = num1 * num2;
            System.out.println("Product: " + product);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught.");
        }
    }

    public static void main(String[] args) {
        NumberOperations operations = new NumberOperations();
        operations.takeInput();

        System.out.println("Sum: " + operations.calculateSum());
        operations.accessInvalidIndex();
        operations.performDivision();
        operations.performMultiplication();
    }
}