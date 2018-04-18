package Programs;

public class int_reverse {

	public static void main(String[] args) {
	int value =1234;
	int rev =0;
while(value !=0) {
	
	rev = value%10+rev*10;
	value = value/10;
	
}

System.out.println(rev);
	}

}
