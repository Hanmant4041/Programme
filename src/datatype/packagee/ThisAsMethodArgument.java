package datatype.packagee;

public class ThisAsMethodArgument {
	int a;
	float fl;
	public static void main(String[] args) {
		
	
	ThisAsMethodArgument oo = new ThisAsMethodArgument();
	
	oo.a = 888;
	oo.fl=12;
	oo.sm();
	oo.ss(45);
	

}

public void sm()
{
	sampleMethod(this);
	System.out.println(this.fl);
}

public void sampleMethod(ThisAsMethodArgument obj)
{
	System.out.println(obj.fl);
	
}

public void ss(int a)
{
	System.out.println(a);
}
}
