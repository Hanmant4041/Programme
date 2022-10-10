package JavaProgramme;

public class OccuranceOfEachCharacterInString {

	public static void main(String[] args) {

		String str= "Bhagyashri";
		str = str.toLowerCase();
		
		for(char ch='a';ch<='z';ch++)
		{
			int c=0;
			for(int i=0;i<str.length();i++)
			{
				
				if(ch==str.charAt(i))
				{
					c++;
				}
				
			
			}
			if(c!=0)
			{
				System.out.println(ch+"     "+c);
			}
		}

	}

}
