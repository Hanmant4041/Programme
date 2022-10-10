package collectiona;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<>();		

		Integer aobj = new Integer(23);
		Integer bobj = new Integer(33);
		data.add(aobj);
		data.add(111);
		data.add(aobj);
		data.add(aobj);
		data.add(bobj);	
		data.add(new Integer(23));
		data.add(new Integer(45));
		data.remove(aobj);
		data.add(777);// new Integer(777)
		data.add(2);		
		System.out.println(data);		
		Integer bbb = data.get(1);
		System.out.println(bbb);
		int cd = data.get(2);
		System.out.println(cd);
		data.add(567);
		int lng = data.size();
		System.out.println(lng);
		data.remove(2);// removing value at mentioned index location i.e. 2		
		data.remove(bobj);// 
		System.out.println(data);
		data.add(444);		
		data.add(0, 888);
		

		Collections.sort(data);
		System.out.println(data);

		for(int i = 0; i<data.size();i++)
		{
			System.out.println(data.get(i));
		}

		for (Integer each:data) 
		{
			System.out.println(each);
		}
	}
	}
