package java25;
import java.util.Scanner;
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.print("Enter a :");
a=sc.nextInt();
System.out.print("Enter b :");
b=sc.nextInt();
System.out.print("Enter c :");
c=sc.nextInt();
System.out.print("Biggest Number is :");
System.out.println((a>b&&a>c)?a:(b>c)?b:c);

	}

}
