
public class Objectc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = 90;
		Object arr[] = {23,90,67, "Hello", 'c', 45.23f};
		
		Object chh = arr[4];
		
		 Character ch = (Character) chh;
		 
		
		String str = (String)arr[3];
		System.out.println(str);
		
		Integer abc =(Integer) arr[0];
		System.out.println(abc);
		
		System.out.println(abc);
		
		new AB().aa = 23;
		
		new AB().sampleMethodA();
		
		AB oo = new AB();
		oo.aa = 34;
		
		
		
		AB abarr[] = {new AB(),new AB(), oo};
		
		AB ref = abarr[0];
		
		AB sam = abarr[2];
		System.out.println(sam.aa);
		System.out.println(abarr[2].aa);
		oo.sampleMethodA();

	}

}
