package programme;

import java.util.Arrays;

public class StaarPatternProgramme {

	public static void main(String[] args) {

		// swap to string 
		String str1="hanmant";
		String str2 = "dadas";

		str1= str1+str2;
		str2 = str1.substring(0,(str1.length()-str2.length()));
		str1= str1.substring(str2.length());

		System.out.println(str1 + " "+str2);

		// string are anagram

		String st1="Brag";
		String st2="grab";
		st1=st1.toLowerCase();
		st2= st2.toLowerCase();

		if (st1.length()!=st2.length())
		{
			System.out.println("given string is not anagram");
		}
		else
		{

			char[] arr1 = st1.toCharArray();
			char[] arr2 = st2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("given string is anagram");
			}
			else {
				System.out.println("given string is not anagram");



			}
		}

	}
}