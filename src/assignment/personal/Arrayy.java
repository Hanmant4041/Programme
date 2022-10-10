package assignment.personal;

public class Arrayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {34,44,56,17,13,12};
		
		int j=0;
		int l=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			
			j=j+arr[i];
			

		}
		int avg = j/l;
		
		System.out.println(avg);

	}

}
