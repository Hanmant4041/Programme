package datatype.packagee;

public class VariableType {
	/* 1.local variable
                   2. instance variable
                   3.static variable
	 */
	int abcd=5;                        //instance variable
	static float ftvar;             //static variable



	public static void main(String[] args) {
		System.out.println(ftvar);
		VariableType obj = new VariableType();
		VariableType obj1 = new VariableType();
		
		VariableType.ftvar=33;
		VariableType.sampleMethodStatic1();
		
		ftvar=11;
		sampleMethod();
		
		
		obj1.abcd=4;
		
		obj1.ftvar=5;
		
		obj.ftvar=10;
		
		
		
		obj.sampleMethod();
		
		obj.sampleMethodStatic1();



	}

	public static void sampleMethod() {

		int ab=10;

		System.out.println(ab);
		
 VariableType obj1 = new VariableType();
		 
		 obj1.ftvar=77;
		 
		 System.out.println(ftvar);

		 
		 
		 obj1.abcd=44;
		 
		 
		 
		 System.out.println(obj1.ftvar);
		 
		System.out.println(ftvar);
		 
		 
		 System.out.println(obj1.abcd);
		 
		  //System.out.println(abcd);

	
		
		
		
		
		

	}



	public static void sampleMethodStatic1() {

		double dd= 12.23d;



	}
}
