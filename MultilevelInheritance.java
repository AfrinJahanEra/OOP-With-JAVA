class A{
    int a,b,c;
    void add(){
        a=10;
        b=20;
        c=a+b;
        System.out.println("Sum of two Numbers:"+c);
    }
    void sub(){
        a=200;
        b=100;
        c=a+b;
        System.out.println("Sum of two Nmubers:"+c);
    }
}
class B extends A{
    void multi(){
        a=10;b=20;
        c=a*b;
        System.out.println("Multiplication of two Number:"+c);
    }
    void div(){
        a=20;b=4;
        c=a/b;
        System.out.println("Division of two Numbers:"+c);
    }
}
class C extends B{
    void rem(){
        a=10;b=3;
        c=a%b;
        System.out.println("Remainder of two Numbers:"+c);
    }
}
class MultilevelInheritance{
    public static void main(String[] args){
        C r=new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }
}