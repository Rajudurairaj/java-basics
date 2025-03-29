package java25;
import java.util.Scanner;
public class p10 {
	static void fp10(int n) {
		while(n!=0) {
			System.out.println(n--);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Number :");
int n=sc.nextInt();
p10 p = new p10();
pp10 pp=new pp10();
p.fp10(n);
pp.fpp10(n);

	}

}
class pp10{
	public void fpp10(int n) {
	do {
		System.out.println(n--);
	}while(n!=0);
}
	}
