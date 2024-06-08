package Exceptions;


// class Test {

//     public static void main(String[] args){
//         System.out.println("main method started");
//         int a=10,b=0,c;
//         try{
//             c=a/b;
//             System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println("main method ended");
//         }
//     }
// }
// class Test {

//     public static void main(String[] args) {
//         System.out.println("main method started");
//         int a = 10, b = 0, c;
//         try {
//             c = a / b;
//             System.out.println(c);
//         } catch (ArithmeticException e) {
//             System.out.println("Can't devide by zero");
//         }
//         System.out.println("main method ended");
//     }
// }
class Test {

    public static void main(String[] args) {
        System.out.println("main method started");
        int a = 10, b = 0, c;
        try {
            if (b != 0) {
                c = a / b;
                System.out.println(c);
            } else {
                System.out.println("Can't divide by zero");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        System.out.println("main method ended");
    }
}
