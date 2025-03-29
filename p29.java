package java25;
import java.util.*;
public class p29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str =sc.nextLine();
int count=0;
char ch;
System.out.println(str);
for(int i=0;i<str.length();i++) {
	ch=str.charAt(i);
	if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
		count++;
	}
}

System.out.println(count);
	}}

