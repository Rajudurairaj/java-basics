package java25;
import java.util.Scanner;
public class p16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5],ind;
		for(int i=0;i<(arr.length);i++) {
			System.out.print("Enter a number :");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter a index for deletion");
		ind=sc.nextInt();
		System.out.println("After deletion");
		for(int j=ind;j<(arr.length)-1;j++) {
			arr[j]=arr[j+1];
		}
		for(int k=0;k<(arr.length)-1;k++) {
			System.out.println(arr[k]);
		}

	}

}
