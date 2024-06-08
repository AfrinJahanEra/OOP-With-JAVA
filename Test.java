class Demo{
		int a=10;
		String str="Era";
		void show (){
			System.out .println(a+" "+str+"B");
		}
}
class Test{
	public static void main(String[] args){
		Demo r=new Demo();
		r.show();
		int x=r.a;
		System.out .println(x);

	}
}
