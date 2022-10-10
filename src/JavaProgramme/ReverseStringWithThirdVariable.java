package JavaProgramme;

public class ReverseStringWithThirdVariable {

	public static void main(String[] args) {
		
		
		
		String st1="thane";
		String st2="raigad";
		
		String st3=st1+st2;
		
		st1=st3.substring(st1.length());//raigad
		st2=st3.substring(0,(st3.length()-st2.length()));//thaneraigad(0,4)
		System.out.println(st1+"    "+ st2);

		
		
		
		
		String str ="ABBBDFJGGDFABFJFHYDAB";
		String[] s =str.split("AB");
		
		for (int i=0;i<s.length;i++)
		{
			String a= s[i];
			System.out.println(a);
		}
		
	}

}
