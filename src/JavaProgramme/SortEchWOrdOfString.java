package JavaProgramme;

public class SortEchWOrdOfString {

	public static void main(String[] args) {

		String st1="i am hanmant  d dadan";
		String st []=st1.split(" ");
		int min;
		String temp="";
		for (int i=0; i<st.length;i++)
		{
			min=i;
			for (int j =i+1;j<st.length;j++)
			{
				if(st[j].compareTo(st[min])>0)
				{
					min = j;
				}}
				temp=st[i];
				st[i]=st[min];
				st[min]=temp;
			}
			
			for(int k=0;k<st.length;k++)
			{
				System.out.println(st[k]);
			}
		

	}

}
