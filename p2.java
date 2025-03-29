package java25;
import java.util.Scanner;
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(((num/2)*2)==num) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}

}
