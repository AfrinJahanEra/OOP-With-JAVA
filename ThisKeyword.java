// class ThisKeyword{
    // void show(){
        // System.out.println(this);
    // }
    // public static void main(String[] args){
        // ThisKeyword r=new ThisKeyword();
        // System.out.println(r);
        // r.show();
    // }
// }


// class ThisKeyword{
    // int a;
    // ThisKeyword(int a){
        // this.a=a;
    // }
    // void show(){
        // System.out.println(a);
    // }
    // public static void main(String[] args){
        // ThisKeyword r=new ThisKeyword(100);
        // r.show();
    // }
// }
// 

// class ThisKeyword{
    // ThisKeyword(){
        // System.out.println("Hello Era");
    // }
    // ThisKeyword(int a){
        //this();default
        // System.out.println(a);
    // }
    // public static void main(String[] args){
        // ThisKeyword r=new ThisKeyword(100);
    // }
// }


class ThisKeyword{
    ThisKeyword(){
        this(10);
    }
    ThisKeyword(int a){
        //this();
        System.out.println(a);
    }
    public static void main(String[] args){
        ThisKeyword r=new ThisKeyword();
    }
}

