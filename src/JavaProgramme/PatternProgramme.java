package JavaProgramme;

public class PatternProgramme {

	public static void main(String[] args) {
		
		//star 6*6
		char ch='a';
		int cha =1;
		for (int i=1; i<=5;i++)
		{
			for(int j=1;j<=cha;j++)
			{
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println();
			if (i<=2)
			{
				cha++;
			}
			else
			{
				cha--;
			}	
		}
			
		
		
		
	}

}
