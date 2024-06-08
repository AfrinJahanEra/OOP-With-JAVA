class A {
    A() {
        System.out.println("I am Era");
    }

    {// Instance
        System.out.println("Who are you?");
    }
    int a = 20;
    static int b = 20;
    static {
        // System.out.println(a+" "+b); error it only take static variable
        System.out.println(b);
    }
}

class StaticVSInstanceBlock {
    public static void main(String[] args) {
        A r = new A();
    }
}