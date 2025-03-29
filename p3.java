package java25;
import java.util.Scanner;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NUmber for Postive or Negative Or Zero");
		int num = sc.nextInt();
		System.out.println((num>0)?"Postive":(num<0)?"Negative":"Zero");
	}

}

