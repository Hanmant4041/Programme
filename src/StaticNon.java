
class StaticNon {
	int a;
	static int b=3;
	
	
public  StaticNon()

{
		
	}

	public static void main(String[] args) {
	
		StaticNon s = new StaticNon();
		s.m();
		s.n();

	}
	
	
	public static void m( int p)
	{
		
		StaticNon n = new StaticNon();
		int c=n.a+b;
	}
	
	public void n()
	{
		
		int c=a+b;
	}

}
