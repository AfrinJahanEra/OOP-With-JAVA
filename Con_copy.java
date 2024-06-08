//copy constructor

class A{
	int a;
	String str;
	A(){
		a=10;
		str="ERA";
		System.out.println(a+" "+str);
	}
	A(A ref){
		a=ref.a;
		str=ref.str;

		System.out.println(a+" "+str);
	}
}
class Con_copy{
	public static void main (String[] args){
		A r=new A();
		new A(r);
	}
}