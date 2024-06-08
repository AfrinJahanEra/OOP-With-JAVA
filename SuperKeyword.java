// class A{
    // int a=10;
// }
// class B extends A{
    // int a=20;
    // void show(){
        // System.out.println(a);
        // System.out.println(super.a);
    // }
// }
// class SuperKeyword{
    // public static void main(String[] args){
        // B r= new B();
        // r.show();
    // }
// }




// class A{
    // void show(){
        // System.out.println("Hello Era");
    // }
// }
// class B extends A{
    // void show(){
        // super.show();
        // System.out.println("Hello Learner");
    // }
// }
// class SuperKeyword{
    // public static void main(String[] args){
        // B r= new B();
        // r.show();
    // }
// }



// class A{
    // A(){
        // System.out.println("Hello Era");
    // }
// }
// class B extends A{
    // B(){
        //super();writing this to call a non parameterized is not nessesary(default)
        // System.out.println("Hello Learner");
    // }
// }
// class SuperKeyword{
    // public static void main(String[] args){
        // B r= new B();
    // }
// }



// class A{
    // A(int a){
        // System.out.println("Hello Era"+a);
    // }
// }
// class B extends A{
    // B(){
        // super(132);writing this to call a parameterized is nessesary
        // System.out.println("Hello Learner");
    // }
// }
// class SuperKeyword{
    // public static void main(String[] args){
        // B r= new B();
    // }
// }