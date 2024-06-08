// class A {
//     void Show() {
//         System.out.println("Super Class");
//     }
// }

// class B extends A {
//     void Show() {
//         System.out.println("Sub Class");
//     }
// }

// class polymoverrideannotation {
//     public static void main(String[] args) {
//         B r = new B();
//         r.Show();
//     }
// }

class A{
    void Show(){
        System.out.println("Super Class");
    }
}
class B extends A{
    @Override
    void Show(){
        System.out.println("Sub Class");
    }
    void Disp(){
        System.out.println("Sub Class 2");
    }
}
class polymoverrideannotation{
    public static void main(String[] args){
    B r=new B();
    r.Show(); r.Disp();
    }
}