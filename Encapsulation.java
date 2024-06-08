// class A{
    // private int value;//data hiding
// 
    // public void setValue(int x){
        // value=x;
    // }
// 
    // public int getValue(){
        // return value;
    // }
// }
// class Encapsulation{
    // public static void main (String[] args){
        // A r=new r();
        // r.value=100;
        // System.out.println(r.value);
    // }
// }thois code will give a error

class A{
    private int value;//data hiding

    public void setValue(int x){
        value=x;
    }

    public int getValue(){
        return value;
    }
}
class Encapsulation{
    public static void main (String[] args){
        A r=new A();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}