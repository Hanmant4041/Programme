package JavaProgramme;

public class ArrayToStringWithoutMethod {

	public static void main(String[] args) {

		String str="123";
		char [] cha = new char [str.length()];
		for(int i=0;i<str.length();i++)
		{
			cha[i] = str.charAt(i);
		}
		
		for(int j=0;j<cha.length;j++)
		{
			
			System.out.println(cha[j]);
		}

// Pallendrom no
		
		int a = 353;
		int rev=0;
		int temp=a;
		while (a!=0)
		{
			int k=a%10;
			rev= rev*10+k;
			
			a=a/10;
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("notPallindrome");
		}
		
		String str1="pune";
		String str2="mumbai";
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println(str1+"    "+ str2);
		
		

	}

}
