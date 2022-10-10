package JavaProgramme;

import java.util.Arrays;

public class SortStringI {

	public static void main(String[] args) {
		
		String str="aendhfdkjhf";
		
		char []ch = new char[str.length()];
	for (int i=0;i<str.length();i++)
	{
		ch  [i] = str.charAt(i);
		
	}
	
	Arrays.sort(ch);
	
	for(int j=0;j<ch.length;j++)
	{
		System.out.print(ch[j]);
	}

	
	
	}

}
