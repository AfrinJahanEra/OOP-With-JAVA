class InstanceBlock{
    int a,b;
    void show(){
        a=50;
        b=60;
        System.out.println(a+" "+b);
    }
    InstanceBlock(){
        a=30;
        b=40;
        System.out.println(a+" "+b);
    }
    {
        a=10;
        b=20;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args){
        InstanceBlock r= new InstanceBlock();
        r.show();
        // r.show();
        // InstanceBlock r= new InstanceBlock();
        // then 50 60 will print first
    }
}