package ifelsee.statement;

public class IfElsesta {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		
		
		if(a>b) {
			
			System.out.println(a+ " Is greater than " +b);

		}
		else {
			System.out.println("i am in else when condition is false");
		}
		
		
		System.out.println("...............if else ladder start");
		
		
		int marks=5;
		
		if(marks>35) 
			System.out.println("student pass");
		
		 {if(marks>35 && marks<60 ) {
			System.out.println("student second clss");

		}
		else if(marks>60 && marks <75 ) {
			
			
			System.out.println("student first class");

		}
		 else if (marks>75) {
			System.out.println("student distinction");

			
			
		}
		else {
			
			System.out.println("student fail");}

		}
		 
		 
		 
		 
		 
		
		
		

	}

}
