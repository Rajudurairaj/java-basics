package java25;

public class p36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb =new StringBuilder("IPL");
sb.append(" Trophy");
System.out.println(sb);
sb.insert(10, " Wins");
System.out.println(sb);
sb.replace(11, 14, "starts");
System.out.println(sb);
sb.delete(12, 17);
System.out.println(sb);
System.out.println(sb.length());
sb.deleteCharAt(2);
System.out.println(sb);
sb.reverse();
System.out.println(sb);
	}

}
