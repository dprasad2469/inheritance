package dp;

public class Assignment_operator {

	public static void main(String[] args) {
		int c = 100;
		int d = 50;
		
		c = d;
		System.out.println("Output of c = d is "+ c);
		
		c += d;
		System.out.println("Output of c = c+d is "+ c);

		c -= d;
		System.out.println("Output of c = c-d is "+ c);
		
		c *= d;
		System.out.println("Output of c = c*d is "+ c);
		
		c /= d;
		System.out.println("Output of c = c/d is "+ c);
		
		c %= d;
		System.out.println("Output of c = c%d is "+ c);
	}

}
