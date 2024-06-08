class A {
    void input() {
        System.out.println("Enter Your Name:");
    }
}

class B extends A {
    void Show() {
        System.out.println("My name is Era");
    }
}

class C extends A {
    void Disp() {
        System.out.println("My name is Afrin");
    }
}

class HierachiacalInheritance {
    public static void main(String[] args) {
        B r = new B();
        C r1 = new C();
        r.input();
        r.Show();
        r1.input();
        r1.Disp();
    }
}
