package assignment.personal;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =121;
		int j=0;
		int temp =a;

		while(a!=0) {

			int k=a%10;
			j=(j*10)+k;
			a=a/10;

		}
		// System.out.println(j);
		if(temp==j) {
			System.out.println("pallindrome ");
		}
		else {
			System.out.println("Not pallindrome ");

		}


	}

}
