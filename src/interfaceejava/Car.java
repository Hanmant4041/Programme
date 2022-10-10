package interfaceejava;

public class Car implements Vehicle {

	int wheel = 4;
	
	
	public void tyre(){
		
		System.out.println("car wheel"+ wheel);
	}
	
	
		
		
		
	
	public static void main(String[] args) {
		
		
		Vehicle obj = new Car();
		obj.tyre();
	}


	public void wheel() {
		
		System.out.println("i am in class car method wheel ");
		
	}
}
