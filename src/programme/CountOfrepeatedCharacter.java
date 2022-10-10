package programme;

public class CountOfrepeatedCharacter {

	public static void main(String[] args) {
		
		int [] arr = {8,59,5,6,6,2};
		int max=arr[0];

		for (int i=1;i<arr.length;i++)
		{

			int ab = arr[i];
			
			if(ab>=max)
			{
				max=ab;
			}


		}
		System.out.println(max);


	}

}
