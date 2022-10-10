package returnstatement;

public class returntype {

	static int b = 23;

	public static void main(String[] args) {


		returntype.sampleMethod(15,20);
		returntype obj = new returntype();


		obj.sampleNonStaticMethod();
	}


	public static int sampleMethod(int c,int d) {

		System.out.println("abcd");
		int a = 12;
		System.out.println(a);

		int f=c+d;
		System.out.println(f);
		return a;


	}


	public returntype sampleNonStaticMethod() {

		returntype obj1 =new returntype();
		short a = 18;
		String bb="hbd";
		System.out.println(a);
System.out.println(obj1);
		return obj1;


	}

	public int returnMethod() {
		
		int a =10;
		System.out.println(a);
		return 11;
		
		
	}
	
	
	
}
