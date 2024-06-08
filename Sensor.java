public class Sensor{
    private boolean activated;

    public Sensor(){
        this.activated=false;
    }
    public void activated(){
        activated=true;
        System.out.println("Sensor activated");
    }
    public static void main(String[] args){
        Sensor s=new Sensor();
        s.activated();
    }
}