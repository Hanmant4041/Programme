package thiskeyword.abc;

public class ThisKeyClass3 {

	int a;
	float f;
	
	
	public ThisKeyClass3() {
		this(22);
		System.out.println(a);
	}
	
	public ThisKeyClass3 (int a) {
		
		System.out.println(this.a);
		
		
	}
	
	
	public ThisKeyClass3 (int a,float f) {
		
		this();
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyClass3 obj = new ThisKeyClass3(20);
		
		ThisKeyClass3 obj1 = new ThisKeyClass3();
	
	
		
	}

}
