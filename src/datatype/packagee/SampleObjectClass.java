package datatype.packagee;

public class SampleObjectClass {
	int penheight;
	int height;
	float penweight=10.2f;

	public static void main(String[] args) {

		SampleObjectClass obj3 = new SampleObjectClass();

		obj3.sampleClassMethod();
		obj3.sampleClassMethod2();


		HumanBeing obj = new HumanBeing();
		obj.submain();



		System.out.println(obj3.penweight);

		System.out.println(obj3.height);

		System.out.println(obj.height);



		System.out.println("...............main method");
	}

	public void sampleClassMethod() {

		System.out.println("..............samplemethod1");

		HumanBeing obj = new HumanBeing();
		
		obj.submain();
		
		
		System.out.println(obj.name);
	}


	public void sampleClassMethod2() {

		System.out.println("..............samplemethod2");
		
		
		
		ArithmaticCal obj7 = new ArithmaticCal();
		
		obj7.addition();
		
		obj7.subtraction();
		
		
	}


	
	
}
