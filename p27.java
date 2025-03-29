package java25;
import java.util.*;
public class p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[]=new int[5],left,right,temp;
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
left=0;
right=arr.length-1;
while(left<right) {
	temp=arr[left];
	arr[left]=arr[right];
	arr[right]=temp;
	left++;right--;
}
for(int i:arr) {
System.out.println(i);}
	}

}
