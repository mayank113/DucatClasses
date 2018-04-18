package Programs;

public class program2_garbag {

	//Remove the garbage from the String
	public static void main(String[] args) {

		String s = "Mayank;893;;'saffsdf;?))(##@";
		
			
			String p =s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("Value:"+p);

	}
}
