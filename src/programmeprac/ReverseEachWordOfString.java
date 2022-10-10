package programmeprac;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str ="i am indian and i respect to india";
		String [] str1 = str.split(" ");
		
		String revef="";
		for(int i= 0;i<str1.length;i++)
		{
			String word = str1[i];
			String rev = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev=rev+word.charAt(j);
			}
			
			revef=revef + "  "+ rev;
			
		}
System.out.println(revef);
	}

}
