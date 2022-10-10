package assignment.personal;

public class EvenOdd {

	public static void main(String[] args) {

		EvenOdd obj1 = new EvenOdd();

		//obj1.parameter(10, 1, 100);
		int result = obj1.parameter(10, 1, 100);
		
		System.out.println(result);
		
		
		/// Even odd no
		int a=11;

		//a=Integer.parseInt(args[0]);

		if(a%2==0) 
			System.out.println("even no");
		else 
			System.out.println("odd no");


		// Leap Year

		int year=2019;

		if (year%4==0)
			System.out.println("leap year");

		else
			System.out.println("regular year");

		//
		int c=2;
		int d=4;

		if (c>d)
			System.out.println("greater no "+c);
		else
			System.out.println("greater no "+d);


		int f=-10;

		if(f<0)
			System.out.println("no is negative "+f);

		else
			System.out.println("positive "+f);

		int age = 16;

		if (age<=2) {
			System.out.println("infont");
		}
		else if (age>=3 && age<=18) 
			System.out.println("child");
		//System.out.println("leap year");

		else if (age>=19 && age <= 50)
			System.out.println("young");

		else 
			System.out.println("senior citizen");




		int x=2;
		int y=3;
		int z=6;

		if (x>y && x>z ) 
			System.out.println("x is greater "+x);
		else if(y>x && y>z)

			System.out.println("y is greater "+y);
		else if (z>x && z>y)	
			System.out.println("z is greater "+z); 

	}


	int parameter(int p,int q,int r) {

		if (p>q && p>r)
		{
			return p;

		}


		else if (q>p && q>r)
		{
			return q;

		}
		else
		{
			return r;

		}

		
		
		
		
		
		
		
		
	}

}























