package assignment.personal;

public class Febonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//febonacciprogram

		int n1=0,n2=1,n3,i,count=100;    

		 System.out.print(n1+" "+n2);//printing 0 and 1    

		 for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3; 

		  if(n3>=89) {

			  break;
		  }
	}
		int a=100;

		for(int i=0;i<a;i++) {

			if(i%2==0) {

				System.out.println("even"+i);
			}
			else if(i%2!=0){
				
				System.out.println(i);
			}
		}
		
		int n=0;
		
		boolean flag=false;
		
		for(int i=2;i<n;i++) {
			
			if (n%i==0) {
				flag=true;
				break;
			}
			
			
			
		}
		if(!flag) {
			System.out.println("no is prime");
		}
		else {
			System.out.println("no is not prime");
		}
	}
}
