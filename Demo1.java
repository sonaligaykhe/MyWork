public class Demo1{

class A
{
	A()
	{
		System.out.println("Class A");
	}

	A(int x){
	 this(100);
	 System.out.println(x);
	}

	void show(){

	}
}

class B extends A
{
	B()
	{
		System.out.println("Class B");
	}

	void show(){
		super.show();
	}
}

	public static void main(String[] args){
		B b1= new B();
		b1.show();


		
	}
}