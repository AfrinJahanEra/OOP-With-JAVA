//Constructor overloading

class A{
	int a;
	double b;
	String str; 
	A(){
		a=100; b=45; str="ERA";
	}
	A(int x){
		a=x;
	}
	A(double y, String z){
		b=y; str=z;
	}
}
class Con_overloading{
	public static void main(String[] args){
		A r1=new A();
		A r2=new A(10);
		A r3=new A(23.89,"ERA");
		System.out.println(r1.a+" "+r1.b+" "+r1.str);
		System.out.println(r2.a);
		System.out.println(r3.b+" "+r3.str);

	}
}