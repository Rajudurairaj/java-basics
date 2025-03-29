package java25;
import java.util.Scanner;
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[]=new int[5],in,ind,temp;
for(int i=0;i<(arr.length)-1;i++) {
	System.out.print("Enter a number : ");
	arr[i]=sc.nextInt();
}

System.out.print("Enter a number for insertion :");
in=sc.nextInt();

System.out.print("Enter index :");

ind=sc.nextInt();

for(int j=(arr.length)-2;j!=ind-1;j--) {
		arr[j+1]=arr[j];
	}

arr[ind]=in;

for(int k:arr) {
	System.out.println(k);
}


	}

}
