package Exceptions;

// public class Throws {
//     public static void main(String[] args) throws InterruptedException{
//         for(int i=1;i<=10;i++){
//             System.out.println(i);
//             Thread.sleep(1000);
//             // try{
//             //     System.out.println(i);
//             //     Thread.sleep(1000);
//             // }catch(InterruptedException e){
//             //     System.out.println(i);
//             // }
//         }
//     }
// }
public class Throwss {

    void div(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Throwss t = new Throwss();
        try {
            t.div(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Can't divided by 0");
        }
    }
}
// public class Throwss {

// void div(int a,int b)throws ArithmeticException{
// if(b==0){
// throw new ArithmeticException();
// }
// else{
// System.out.println(a/b);
// }
// }give to caller fun
// public static void main(String[] args) throws ArithmeticException {
// Throwss t=new Throwss();
// t.div(10,0);
// }
// }if the caller fun main then give to jvm to handle
