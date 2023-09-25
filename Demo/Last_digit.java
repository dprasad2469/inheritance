package Demo;
 
public class Last_digit {

	public int last(int num) {
		int r=num%10;
		return r;
	}
	public static void main(String[] args) {
		Last_digit d = new Last_digit();
		int r = d.last(6789);
		System.out.println(r);
	}

}
