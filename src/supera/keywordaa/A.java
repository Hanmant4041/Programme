package supera.keywordaa;

public class A {

	int a=12;
	static int b=22;

	public A() {
		this(12);
		System.out.println("const a");
	}


	public A (int a) {

		System.out.println("const A");

	}
	public static void staticMetod() {
		System.out.println("static method class A");
	}

	public void nonStaticMetod() {
		System.out.println("nonstatic method class A ");
	}


}
