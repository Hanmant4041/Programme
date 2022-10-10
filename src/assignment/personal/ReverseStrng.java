package assignment.personal;

public class ReverseStrng {
	static int ab =12;
static {System.out.println("sttic");}
	{
		int a=12;
		int b=25;
		int c=a+b;
		System.out.println("non static block"+c);
	}
	
	
	public static void main(String[] args) {
		
		//AssignmentSwitch obj = new AssignmentSwitch();
		//obj.method();
		//ReverseStrng obj1 = new ReverseStrng();
		
		/*String s1 = "Ini";
		String revrse="";
        for(int i=s1.length()-1;i>=0;i--)
            {
            revrse=revrse+s1.charAt(i);
            }
        if(s1.equalsIgnoreCase(revrse)) {
        	
        	System.out.println("pallendrom");
        }
        
        
        else {
        	System.out.println("not pallendrom");
        }
	}*/
	
		int arr[] = {34,44,56,17,13,12};
		
		int a=0;
		
		for(int i=0;i<arr.length;i++)
		{
			a=a+arr[i];
			
		}
		float avg=a/arr.length;
		System.out.println(avg);
		
		
		
		
		
	}
}
