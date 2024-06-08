class student{//super
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter roll number & marks : ");
    }
}
class Era extends student {//sub-class
    void disp(){
        roll=220042132;
        name="Era";
        marks=90;
        System.out.println(roll+" "+name+" "+marks);

    }
}
class SimpleInheritance{
    public static void main(String[] args){
        Era r=new Era();
        r.input();
        r.disp();
    }
}