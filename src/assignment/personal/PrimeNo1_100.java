package assignment.personal;

public class PrimeNo1_100 {

	public static void main(String[] args) {
		//prime no

		/*int n=21;
		int temp=0;

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{ temp=temp+1;
			break;
			}

		}
		if (temp==0) 
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}*/


		//prime no 1-100
		/*	for (int n=1; n<=100;n++) 
		{

			boolean flag=false;
			for(int i=2;i<n;i++)

			{ if(n%i==0) {
				flag=true;
				break;
			}
			}

			if(!flag) {
				System.out.println(n);
			}
			}*/
		int n1=0,n2=1,n3,i,count = 15;    

		System.out.print(n1+" "+n2);//printing 0 and 1    
		
			for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
			{   
				n3=n1+n2; 
				
				if(n3>=100)
					
				{
					break;
					}
				
				System.out.print(" "+n3);    
				
				n1=n2;   
				
				n2=n3; 
				
			}
			
			String str1="a1";
			
			int a =Integer.parseInt(str1);
			System.out.println(a);
		}
	}





