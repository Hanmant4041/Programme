package thiskeyword.abc;

public class ThisKeyClass {
	
	int roll;
	int b;
	String n;
	
	public ThisKeyClass() {
		System.out.println("deault con");
	}
	
	public  ThisKeyClass(int a)
	{
		roll=a;
		
		System.out.println(roll);
	}
	public ThisKeyClass(int a,String strng)
	{
		
		roll=a;
		n="strng";
		System.out.println(roll+n);
	}
	
	
public static void main(String[] args) {
	
	ThisKeyClass obj = new ThisKeyClass();

ThisKeyClass obj2 = new ThisKeyClass(20);

ThisKeyClass obj3 = new ThisKeyClass(24, "hbd");

obj.b=10;
obj.n="mohan";

System.out.println(obj.b+obj.n);
}
}
