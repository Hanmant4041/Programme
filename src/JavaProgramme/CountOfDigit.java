package JavaProgramme;

public class CountOfDigit {

	public static void main(String[] args) {
		
		String str= "india is my country 3454564 dfghrtherth 567678 drfhft BBCH";
		
		float sm=0f;
		float cp=0f;
		float digit=0f;
		
		
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		
			if(ch>='a'&& ch<='z')
			{
				sm++;
				//sm =(sm/str.length())*100;
			}
			else if(ch>='A'&& ch<='Z')
			{
				cp++;
			}
			else if (ch!=' ')
			{
				digit++;
			}
			
		}
		
		System.out.println(sm);
		System.out.println((cp/str.length())*100);
		System.out.println((digit/str.length())*100);
		
		
	}

}
