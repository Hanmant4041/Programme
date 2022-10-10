package collectiona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ArrayListd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> obj = new ArrayList<Integer>();

		Integer obj1 = new Integer(22);

		obj.add(11);
		obj.add(12);
		obj.add(23);
		obj.add(1);
		obj.add(58);

		int c = obj.get(2);

		System.out.println(c);
		int b= obj.get(4);

		System.out.println(b);
		int d = obj.get(0);
		System.out.println(d);

		obj.remove(0);


		obj.add(22);
		obj.add(0, 111);
		obj.add(null);
		obj.add(null);
		for (int i=0;i<obj.size();i++)
		{System.out.println(obj.get(i));
		}
		try {

			Collections.sort(obj);} //null value to cause cant handle the sorting
		catch (Exception e) {
			System.out.println("hii");
			// TODO: handle exception
		}
		Iterator <Integer> itr =obj.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
			
			
			
			
		}
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	
	hm.put("mohan", 12);
	
	}}
