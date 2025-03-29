package java25;

public class p37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="HeLLo worLD";
		StringBuilder result = new StringBuilder();
		for(char c : st.toCharArray()) {
			if(Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
			}
			else {
				result.append(c);
			}
		}
		System.out.println(st);
		System.out.println(result);
	}

}
