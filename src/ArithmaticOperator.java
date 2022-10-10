
public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// +,-,*,/,%

		// Addition

		int a=10;
		int b=6;
		byte e =3;
		float d=3.3f;

		int c = a+b+e;

		System.out.println(c);

		String st="hello";
		String st1="hii";


		String st3 = st+st1;

		String st4 = b+st+st1+a+b;

		String st5 = b+a+st1+st;


		System.out.println(st3);

		System.out.println(st4);


		System.out.println(st5);


		// mod 

		int j = a%b;


		System.out.println(j);

		// Relational operator(<,>,<=,>=,==,!=)

		int pq= 33;

		int rs=11;


		boolean dd=(pq!=rs);
		System.out.println(dd );
		boolean flag = a!=b;


		System.out.println(flag);


		// Binery operator(++exp,--exp.exp++,exp--,~,!)


		int l = --a;


		System.out.println(l);
		System.out.println(a);

		// ~
		int m= ~a;

		System.out.println(m);

		// !


		boolean flag1=!(a<b);


		System.out.println(flag1);


	}

}
