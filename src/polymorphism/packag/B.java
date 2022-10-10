package polymorphism.packag;

public class B extends A {

	static int a = 40;
	static int b=10;
	int z=2;

	public static void addition() {
		System.out.println("Class B adddition static ");
		int c =a+b;
		System.out.println(c);
	}





	public void sustraction() {  
		System.out.println("Class B sub non static");
		int c =a-b;
		System.out.println(c);


	}
}


