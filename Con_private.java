class PrivateCon{
	int a;
	double b;
	String c;
	PrivateCon(){
		a=10;
		b=30.56;
		c="ERA";
		System.out.println(a+" "+b+" "+c);
	}
	/*public static void main(String[] args){
		Private_con r = new Private_con();
	} it will access*/
}
class Con_private{
	public static void main(String[] args){
		 new PrivateCon();
	}// nothing will print
}