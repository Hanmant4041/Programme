package assignment.personal;

public class uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []array = {'a','2','B','q','4','F','#',' ',' ','Q','R'};


		int upper=0;
		int lower=0;
		int digit=0;
		int spl=0;
		int space=0;

		for(int i=0;i<array.length;i++)
		{
			if(array[i]>='A'&&array[i]<='Z')

			{

				upper++;
			}
			else if(array[i]>='a'&&array[i]<='z')

			{

				lower++;
			}

			else if(array[i]>='0'&&array[i]<='9')

			{

				digit++;
			}


			else if(array[i]==' ')

			{

				space++;
			}
			else {
				
				spl++;
			}

		}
		
		int perUPP=upper*100/array.length;
		System.out.println(perUPP+"%");
		
		
		
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(digit);
		System.out.println(space);
		System.out.println(spl);
		
		
	}

}
