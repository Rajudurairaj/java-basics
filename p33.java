package java25;
import java.util.*;
public class p33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="csk",t="ksc";
		 if(s.length()==t.length()){
	            char [] sArray =s.toCharArray();
	            char [] tArray =t.toCharArray();
	            Arrays.sort(sArray);
	            Arrays.sort(tArray);
	            boolean isTrue=Arrays.equals (sArray,tArray);
	            System.out.println(isTrue);
	    }
	    else {
	        System.out.println("Invalid");
	    }
	}

}
