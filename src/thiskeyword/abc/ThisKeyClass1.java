package thiskeyword.abc;

public class ThisKeyClass1 {

	int a;                                   
	String Name;
	float f;
	static byte b;
	//costructor name should be like class name

	public ThisKeyClass1() {
		this(12);
		System.out.println("default");
		//this.staticMethod();


	}

	public ThisKeyClass1 (int a)
	{
		a=50;
		this.a=a;
		System.out.println("parameterized");
	}

	public ThisKeyClass1(int a,float b) {


		this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ThisKeyClass1 obj = new ThisKeyClass1();
		
		obj.staticMethod();
		obj.a=10;

		ThisKeyClass1 cc = new ThisKeyClass1(23, 77.77f);



		// System.out.println(cc.a);

	}

	public void ThisKeyMethod(int a) {

		this.staticMethod();

		this.ThisKeyMethod(this.a);

		System.out.println(a);
		System.out.println(this.a);
		System.out.println(Name);
		System.out.println(f);
		System.out.println(b);


	}
	public static void staticMethod() {


		ThisKeyClass1 obj2 = new ThisKeyClass1();
		obj2.b=5;
		obj2.a=6;
		obj2.f=5.5f;
		obj2.Name="md";


		System.out.println(obj2.a);
		System.out.println(obj2.Name);
		System.out.println(obj2.f);
		System.out.println(obj2.b);

	}


}
