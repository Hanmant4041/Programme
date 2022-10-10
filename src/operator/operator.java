package operator;

public class operator {
int a=10;

int b=22;
int c=13;

public void m() {
	
	int d;
	int r;
	
	//d= a++ + b++;//
	//d= ~a+c;      //11+1= -12
	
	boolean flag = !(a<b);
	System.out.println(flag);
	
	//bitwise operator &,|,^

	d=a|b;     //0000 1010
	          // 0001 0110
	           //0001 1110
	
	System.out.println(d);
	
	r=a^b;     //0000 1010
               //0001 0110
               //0001 1100
	System.out.println(r);
	
	
	
	
	
	
	boolean flag2= (a<b)||(c>b);
	
	System.out.println(flag2);
	
	// <<,       >>
	
	
}

public static void main(String[] args) {
	operator oo = new operator();
	oo.m();
}
}




