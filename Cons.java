//Java constructor

class A{
		int a;
		String name;
		/*A(){
			a=0;
			name=null;
		} constructor called dafaultly */
		void show(){
			System.out.println(a+" "+name);
		}
}
class Cons{
		public static void main (String[] args){
			A r=new A();
			r.show();
		}
}