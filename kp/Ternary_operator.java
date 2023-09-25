package kp;

public class Ternary_operator {

	public static void main(String[] args) {
		int c = 60;
		int d = 70;
		int e = 80;
		
		if(c>d&&c>e){
			System.out.println(c+ "it is the greatest");
		}
		else if(d>c&&d>e){
			System.out.println(d+ "it is the greatest");
		}
		else {
			System.out.println(e+ "it is the greatest");
		}
	}

}
