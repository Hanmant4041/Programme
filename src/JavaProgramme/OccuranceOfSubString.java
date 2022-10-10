package JavaProgramme;

public class OccuranceOfSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str = "My name is ajay ajay is boy ajay play cricket";
			String [] st = str.split(" ");
			int c=0;
			for(int i=0;i<st.length;i++)
				
			{					
					if (st[i].contains("ajay"))
					{
						c++;
					}
				
				
			}
			
			System.out.println(c);
			
			
			// reverse each word of string 
			
			String str1 ="India is my country";
			String []s = str1.split(" ");
			
			String revef="";
			
			for(int i=0;i<s.length;i++)
			{
				String word = s[i];
				
				String rev ="";
				for(int j=word.length()-1;j>=0;j--)
				{
					rev= rev+word.charAt(j);
				}
				 revef = revef+" "+rev;
				
			}
			System.out.println(revef);
			
	}

}
