package assignment.personal;

public class arrayl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr [] = {'a','2','B','q','4','F','#'};
		
		int count=0;
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]=='a'&& arr[i]== 'z') {
				count++;
				System.out.println("small case letter"+count);
			}
		}
	}

}
