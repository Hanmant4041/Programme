package polymorphism.packag;

public class C extends B {

	int z=3;
	
	
	
	public static void main(String[] args) {
		A aa = new A();
		B bb = new B();
		
		
		A ab = new B();
		ab.sustraction();
		ab.addition(); 
		
		C cc =new C();
		
	
		
		A ac = new C();
		ac.sustraction();
		ac.addition();
		
		System.out.println(ac.z);
		
		
		
		
	}
	


	
	




	

	}
	
	
	
	

