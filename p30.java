package java25;

public class p30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Hello";
System.out.println(str1.indexOf('o'));
System.out.println(str1.indexOf("llo"));
String str2 = str1.replaceAll("[aeiouAEIOU]", "");
System.out.println(str2);
System.out.println(str1.length()-str2.length());
	}

}
