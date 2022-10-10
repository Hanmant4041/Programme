package assignment.personal;

public class ABString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ABBBDFJGGDFABFJFHYDAB";
		
		int ab = str.indexOf("AB");
		int count=0;
		while(ab!=-1)
		{
			count++;
			str=str.substring(ab+1);
			ab=str.indexOf("AB");
		}
		System.out.println("no of occurance of AB "+count);
	}

}
