package java25;
import java.util.Scanner;
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]=new int[5],b[]=new int[5],min,max,j=0,k;
System.out.print("Enter a number :");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
min=a[0];
max=a[0];
for(int i=0;i<a.length;i++) {
	if(min>a[i]) {
		min=a[i];
	}
	else {
		max=a[i];
	}
	if((a[i]&1)==0) {
		b[j]=a[i];
		j++;
	}
}
k=j;
System.out.println("min "+min);
System.out.println("max "+max);
for(k=0;k<j;k++) {
	System.out.println(b[k]);
}
	}

}
