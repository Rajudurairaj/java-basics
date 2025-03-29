package java25;
import java.util.Scanner;
public class p9 {
void primenum(int n) {
	int i;
	boolean b= true;
	for(i=2;i<n/2;i++) {
		if(n%i==0) {
			b=false;
			break;
		}
	}
	if(b) {
		System.out.println("Prime Number :"+n);
	}
	else {
		System.out.println("Not Prime Number :"+n);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n = sc.nextInt();
		p9 pn = new p9();
		pn.primenum(n);
		
	}

}
