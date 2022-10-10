package programme;

public class AvgPercentage {

	public static void main(String[] args) {
		char [] arr= {'a','2','B','q','4','F'}; 
		int length = arr.length;
		int l=0;
		int c=0;
		int s=0;
		int n=0;
		
		for(int i=0;i<arr.length;i++)
		{
			char ch = arr[i];
			
			if(ch>='a' && ch<='z')
			{
				l++;
			}
			else if(ch>='A'&& ch<='Z')
			{
				c++;
			}
			else if (ch>='0' && ch<='9')
			{
				n++;
			}
			else
			{
				s++;
			}
				
		}
		System.out.println(l);
		
		System.out.println(l/length*100);
	}

}
