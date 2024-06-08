class StaticBlock{
    public static void main(String[] args){
        StaticBlock r=new StaticBlock();
    } 
    StaticBlock(){
        System.out.println("Please Study");
    }
    {
        System.out.println("Please Write");
    }
    static{
        System.out.println("Learn Coding");
    }
}
