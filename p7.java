package java25;

public class p7 {

	public static void main(String[] args) {
		// implicit
		int ia=1;
		float ib=ia;
		char ic= 'A';
		int id = ic;
		System.out.println(ia);
		System.out.println(ib);
		System.out.println(ic);
		System.out.println(id);
		//explicit
		double ea=1.0;
		int eb=(int)ea;
		int ec=65;
		char ed=(char)ec;
		System.out.println(ea);
		System.out.println(eb);
		System.out.println(ec);
		System.out.println(ed);

	}

}
