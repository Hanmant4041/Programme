package JavaProgramme;

public class ReverseString {

	public static void main(String[] args) {
		String str="mada";
		String rev= "";
		String temp=str;
				for(int i=str.length()-1;i>=0;i--)
				{
					rev = rev+ str.charAt(i);
				}
		System.out.println(rev);
		if(temp.equals(rev))
		{
			System.out.println("given string is Pallindrome");
		}
		else {
			System.out.println("given string is not Pallindrome");
		}
	}

}
