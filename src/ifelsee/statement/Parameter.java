package ifelsee.statement;

public class Parameter {


	int f=10;
	static int d=22;
	public static void main(String[] args) {

		Parameter obj = new Parameter ();
		obj.addition(5, 2,5);
		Parameter.sbstraction(88, 99);
	

	}

	public void addition (int a,int b,int c) {

		d= a+b+f;
		System.out.println(d);


	}


	public static void sbstraction(int x,int y) {

		Parameter obj1=new Parameter ();
		obj1.d=15;
		d=x-y+obj1.d;
		System.out.println(d);
obj1.f=10;



	}




}
