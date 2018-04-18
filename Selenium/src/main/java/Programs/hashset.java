package Programs;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
String[] Name  = {"Java","Selenium","Ruby","Phyton","Java"};

Set<String> s =new HashSet<String>();

for(String n: Name) {
	if(s.add(n) == false) {
		System.out.println("duplicate"+n);
	}
}




	}

}
