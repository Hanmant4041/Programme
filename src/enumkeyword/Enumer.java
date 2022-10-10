package enumkeyword;

public class Enumer {
	
	enum WeekDay{ SUN,MON,TUE,WEND,THI,FRI,SAT}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeekDay ab = WeekDay.TUE;
		System.out.println(ab);
		
		for(WeekDay each:WeekDay.values())
		System.out.println(each);
	}
	static {
		
		
		System.out.println("sttc bc");
	}

	
	}


