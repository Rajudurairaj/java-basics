package java25;
import java.util.Scanner;
public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a[]=new int[6];

for(int i=0;i<a.length;i++) {
	System.out.print("Enter a Number :"+i+" :");
	a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++) {
	System.out.println("Number is "+a[i]);
}

	char c[]=new char[10];
	for(int j=0;j<c.length;j++) {
		System.out.print("Enter a character :"+j+" :");
		c[j]=sc.next().charAt(0);}
	for(int j=0;j<c.length;j++) {
		System.out.println("Character is "+c[j]);
	}

}}
