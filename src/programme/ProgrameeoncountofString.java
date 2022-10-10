package programme;

public class ProgrameeoncountofString {

	public static void main(String[] args) {
		/// find mx no f,rom array 
		int [] arr = {1,8,6,2,3,9};
		int max =arr [0] ;
		for (int i = 1;i<arr.length;i++)
		{
			if (arr[i]> max)
			{
				max = arr[i];

			}


		}
		System.out.println("maximum no is:"+max);



		int [] ar = {9,3,2,4,76,8};
		int min = ar[0];
		for (int j = 1; j<ar.length; j++)
		{
			if(ar[j]<min)
			{      min =ar[j];

			}

		}

		System.out.println("minimum no is : "+ min);

		char ch ='a';

		for(int i =1; i<=3;i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(" "+ ch);

			}
			ch++;
			System.out.println();
		}

		System.out.println("zyx triangle for five no");

		char cr='z';
		for (int i=1; i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(cr);
				cr--;
			}
		
			System.out.println();
		}
		
		System.out.println("rev char prgramme");
		
		char cd='z';
		for (int i =5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			
			{
				System.out.print(" "+cd);
			cd--;
			}
			System.out.println();
		}
		
		System.out.println("code is running for number");
		int a =1;
		for (int i =5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+a);
				a++;
			}
			System.out.println();
		}
		
		int str  =1;
		for (int i =1;i<=5;i++)
		{
			for(int j=1;j<=str;j++)
			{
				System.out.print(" " +"*");
			}
			System.out.println();
			if (str<3)
		{
				str++;
				
		}
			else 
			{
				str--;
			}
		}
		
		
		

	}
}