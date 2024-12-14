package Exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);

            int arr[] = { 10, 20, 30 };
            System.out.println(arr[3]);

            String str = "123";
            System.out.println(str.toUpperCase());
        } 
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Array exception");
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithematic Exception");
        }
        catch (NumberFormatException n) {
            System.out.println("all type Exception handled");
        }
        catch (Exception x) {
            System.out.println("All type Exception Handled");
        }
    }
}

