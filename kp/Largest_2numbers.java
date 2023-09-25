package kp;

public class Largest_2numbers {

	public static void main(String[] args) {
		int m = 44;
		int n = 55;
		int p = 66;
		
		int i = (m>n && m>p)? m:((n>p && n>m)?n:p);
		System.out.println(i);

	}

}
