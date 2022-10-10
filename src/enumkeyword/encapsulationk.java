package enumkeyword;

public class encapsulationk {

	private int a=22;
	
	
	public void setData(int b) {
		
		this.a=b;
		
		System.out.println(b);
	}
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getData() {
		
		return a;
		
	}
	
	
	public static void main(String[] args) {
		
		
		encapsulationk ab =new encapsulationk ();
		ab.setData(1);
	}
}

