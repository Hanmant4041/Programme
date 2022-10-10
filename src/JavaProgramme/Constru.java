package JavaProgramme;

public abstract class Constru {
	int z=12;
	static int e=11;
	
	public Constru()
	{
		int k = this.e;
		int a=10;
		int b =12;
		b=a+e;
		System.out.println(b);
	}

	public static void main(String[] args) {
		Constru c = new Constru();
		

	}
	public abstract void ab();
	public static abstract void qq();
	

}
