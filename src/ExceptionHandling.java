
public class ExceptionHandling {
	public static int d;
	public static void main(String[] args) {
		// TODO Auto-generated method st
		int a=10;
		int b =0;
		int c;
		String data = "abc123";




		try {
			d = Integer.parseInt(data);
		} catch (NumberFormatException e1) {
			System.out.println(d);
		}



		try {
			c=a/b;
		} 
		catch (Exception e) {


			System.out.println("catch"); 
		}
		finally {
			System.out.println("fnl");
		}
	}

}
