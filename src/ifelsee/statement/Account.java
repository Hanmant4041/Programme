package ifelsee.statement;

public class Account {



	int a=15;

	String b= "mohan";

	public static void main(String[] args) {

		Account obj = new Account ();

		obj.personalLoan(0, 4, 12, 11000);
		obj.creditCard(0, 0, 0);
		obj.insurance("hii", 4, 1000, 10);

	}



	void personalLoan(float principle,int tenure,float ROI,double EMI) {
		principle=100000;
		tenure=24;
		ROI=principle/10000;
		EMI=principle/tenure;

		System.out.println(ROI);

		System.out.println(EMI);

	}

	void creditCard(int limitamount, int bill,float RoI) {

		limitamount=150000;
		bill=limitamount-50000;
		RoI=limitamount/bill;


	}


	void insurance(String product,int member,int amount,int age) {


		product="insurance";
		member= 4;
		amount=600000;


	}








}
