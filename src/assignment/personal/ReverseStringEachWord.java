package assignment.personal;

public class ReverseStringEachWord {
	
	
	
	
public static void main(String[] args) {
	

	String str = "My name is ajay ajay is boy ajay play cricket";

	String eachRev = "";

	String sarr[] = str.split(" ");
	for (int i=0; i<sarr.length;i++)
	{
		eachRev = eachRev+ " " +reverseProvidedString(sarr[i]);
	}
	System.out.println(eachRev);
	System.out.println(reverseProvidedString(str));


}



	public static  String reverseProvidedString(String ss)
	{
		String rev = "";
		for (int i = ss.length()-1;i>=0;i--)
		{

			rev = rev+ss.charAt(i);
		}

		return rev;
	}
}
