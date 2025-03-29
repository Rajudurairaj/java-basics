package java25;
import java.util.Scanner;
public class p14 {
public void fp14(int[] n) {
	for(int i : n) {
		System.out.println(i);
	}
}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[5],i;
	for(i=0 ;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
	
	p14 op14 = new p14();
	op14.fp14(arr);
	}

}
