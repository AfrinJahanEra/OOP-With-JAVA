package Exceptions;
public class TryCatchVSThrows {

    public void waitMethod() throws InterruptedException {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
            // Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        TryCatchVSThrows obj = new TryCatchVSThrows();
        try {
            obj.waitMethod();
            System.out.println("Hello");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException handled...!");
        }
        System.out.println("main method Ended");
    }
}
//if there are two exception happens then throws cant handle two it only can one while try catch can handle multiple exception

