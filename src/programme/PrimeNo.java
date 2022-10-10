package programme;

public class PrimeNo {

	public static void main(String[] args) {
		
		int n=10;
		boolean flag =false;
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
if(!flag)
{
	System.out.println("prime no");
}
else {
	System.out.println("not prime");
}
	
	
	//febonnacci series
int a=5;
int n1=0;
int n2=1;
int n3;
System.out.println(n1+" "+n2);

for(int i=2;i<a;i++)
{
	n3=n1+n2;
	System.out.println(n3);
	
	n1=n2;
	n2=n3;
}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
