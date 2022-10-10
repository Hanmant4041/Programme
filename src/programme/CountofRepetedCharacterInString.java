package programme;

public class CountofRepetedCharacterInString {

	public static void main(String[] args) {
		
		String str = "aaaajd";
		str = str.toLowerCase();
		String ss = "";
		char prev =' ';
		String n="";
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			
			{
				if (prev!=str.charAt(i))
				{
					n=n+str.charAt(i);
					prev=str.charAt(i);
					
				}
				count++;
				
				/*if (str.charAt(i)!=str.charAt(j))
				{
					ss=ss+str.charAt(i);
				}*/
			}
			System.out.println(str.charAt(i) +"  =  "+count);
		}
		System.out.println(n);
		
		
	}

}
