package Exceptions;

// public class Throw {
//     public static void main(String[] args) {
//         throw new ArithmeticException("/by Zero");
//     }
// }
public class Throwww {

    void div(int a,int b){
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a/b);
        }
    }
    public static void main(String[] args) {
        Throwww t=new Throwww();
        t.div(10,2);
    }
}