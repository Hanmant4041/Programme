package supera.keywordaa;

public class B extends A{

	public B() {
		super();
		System.out.println("cont b class b");
	}

	public B(int a,int d) {
		this();
		System.out.println("par const b class b");


	}


	public B(int i) {
		this(9,6);
		System.out.println("parametarized const at method at B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A bb= new B(20);


		bb.staticMetod();
		bb.nonStaticMetod();
	}


	int a=10;
	static int b=10;


	public static void staticMetod() {

		System.out.println("static method class B");
	}

	public void nonStaticMetod() {

		super.nonStaticMetod();

		System.out.println("nonstatic method class B ");


		int c= super.a+super.b;


		System.out.println(c);


	}

}
