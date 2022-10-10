package stringpackage;

public class String2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		// charAt(), length(),endsWith(" "),startsWith(),replace(),split(" "),trim(),subString(),contains(),equals(),
				//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		
		String str = "Welcome to KTCTC";
		String str1 = "Welcome to KTCTC2211";
		
		for (int i=0; i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}                                        
		
		int length = str.length();
		System.out.println(length);
		
		char ch = str.charAt(2);
		
		System.out.println(ch);
		
	boolean ss = str.endsWith("TC");
		
	System.out.println(ss);
	
	boolean ss1 = str.startsWith("W");
	
	
	System.out.println(ss1);
	
	String str3 = str.replace("o", "q");
	System.out.println(str3);
	
	String[] str4 = str.split(" ");
	System.out.println(str4[1]);
	
	String str5 = str1.trim();
	
	System.out.println(str5);
	
	String str6 = str.substring(3,10);
	
	System.out.println(str6);
	
	boolean flag2 = str.contains("Welcome to KTCTC");
	
	System.out.println(flag2);
	
	boolean flag3 = str.equals("Welcome to KTCTC" );
	System.out.println(flag3);
	
	
	String str7 =str.concat(str1);
	
	
	System.out.println(str7);
	
	
	
	
	}
S
}
