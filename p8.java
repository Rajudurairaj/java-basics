package java25;
import java.util.Scanner;
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");
		long num,i,sum=0;
		num=sc.nextInt();
		for(i=0;i<=num;i++){
			sum+=i;
		}
		System.out.println("Sum of is :"+sum);

	}

}
