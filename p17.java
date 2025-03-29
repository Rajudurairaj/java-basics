package java25;
import java.util.Scanner;
public class p17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		arr[i][j]=sc.nextInt();
	}
}
for(int j[]:arr) {
	for(int k:j) {
	System.out.print(k);
}
System.out.println();	
}
}}
