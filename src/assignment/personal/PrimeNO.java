package assignment.personal;

public class PrimeNO {
	public static void main(String[] args) {

		int n=5;
		boolean flag = false;

		for(int i=2;i<n;++i) {


			if(n%i==0) {

				flag=true;
				break;
			}}
			if(!flag) {

				System.out.println("prime no");

			}
			else {

				System.out.println("not prime");
			}
		}





	}




