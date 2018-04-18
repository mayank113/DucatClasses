package Programs;

import java.io.EOFException;
import java.sql.Array;

//how to reverse/palindrome a string 
public class program1_palindrome {

	public static void main(String[] args) {
		
		try {
			
		
		String s = "abcba";
		int lan = s.length();
		char[] br = s.toCharArray();
		String p ="";
		for (int i=lan-1;i>=0;i--) {

		p  = p+ br[i];
		
		}
		System.out.println(p);
		
		if (p.equals(s)) {
			
			System.out.println("String  is palindrome");
		}
		}
		catch(Exception e) {
					
			System.out.println(e);
		}
		
	}
}
