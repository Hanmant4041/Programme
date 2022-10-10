package assignment.personal;

public class OvelConsonent {

	public static void main(String[] args) {
		
		
		String str  = "aberixbnhoasu";
		int count =0;
		int cons =0;
		for(int i=0;i<str.length();i++) {
			
			
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u' ) {
				count++;
			}
			
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				cons++;
				
			}
		

		}
		System.out.println("no of vowels in string "+count);
		System.out.println("consonent"+cons);

	
	
	/*int arr[] = {34,44,56,17,13,12};
	
	int add = 0;
	float avg;
	for (int i=0;i<arr.length;i++) {
		add=add+arr[i];
		
	}
	
	avg=add/arr.length;
	System.out.println(avg);
	
	}*/
	
		
		
		
		
		
		
	}

	
}
