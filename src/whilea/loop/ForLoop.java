package whilea.loop;

public class ForLoop {

	public static void main(String[] args) {
		
		
		/*int s =3;
		
		for(s=1;s<=3;s++) {
			
			System.out.println(s);
		
		}*/
		
		
		
		
		    //index
		
		/*outer: for(int i=ar.length-1;i>=0;i--) {
			
			System.out.println(ar[i]);
		inner:	
			{
				for(int j=0;j<ar.length;j++) {
			
				
				System.out.println(ar[j]);
			}	
		}

	}*/

		
		/*int ar[]= {2,4,8,9,11,23}; 
		for (int each:ar) {
			
			System.out.println(each);
		}
		
		
		int f=6;
		do
		{
			System.out.println("hii");
			f++;
		}
			while(f<9) ;
				
			*/
		
		
		
		int ar[]= {2,4,8,9,11,23}; 
		
		float add=0;
		for(int i=0;i<ar.length;i++) 
		{
			add=add+ar[i];
			//System.out.println("sum= "+add);
			
			
			float avg=add/ar.length;
			
			System.out.println("average "+avg);
		}
		
		char arry[]= {'a','b','c','i','o','u'};
		
		
	}}
