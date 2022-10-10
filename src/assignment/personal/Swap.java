package assignment.personal;

public class Swap {

	public static void main(String[] args) {
		/*char ab ='e';
		
		switch (ab) {
		case 'a':
			System.out.println("vovul");
			break;
		case 'e':
			System.out.println("vovul");
			break;
		case 'i':
			System.out.println("vovul");
			break;
		case 'o':
			System.out.println("vovul");
			break;

		default:
			break;
		}
		*/
		
		String str="HaNMant";
		str=str.toLowerCase();
		for (int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				
				System.out.println("vowels "+ch);
			}
			else {
				System.out.println("consonent "+ch);
			}
		}
	}

}
