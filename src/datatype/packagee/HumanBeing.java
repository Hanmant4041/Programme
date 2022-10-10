package datatype.packagee;

public class HumanBeing {

	int height;
	float weight;
	String name;
	int std;

	public void submain() {

		System.out.println("...............submain method");

	}

public static void main(String[] args) {
	
	HumanBeing obj1 = new HumanBeing();
	obj1.submain();
	obj1.height= 10;
	obj1.weight=20.22f;
	
	System.out.println(obj1.height);
	System.out.println(obj1.weight);
	
	HumanBeing obj2 = new HumanBeing();
	obj2.height=30;
	obj2.std=3;
	
	 obj2.height=obj1.height;
	
	System.out.println(obj2.height);
	
	
	
	
	
	
	
}

}
