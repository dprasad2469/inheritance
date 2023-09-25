package dp;

public class if_else_if {

	public static void main(String[] args) {
		int mark = 90;
		
		if (mark<=34)	{
			
			System.out.println("Failed");
}
		else if (mark>=35 && mark <=50)	{
			System.out.println("Pass");
		}
		else if (mark > 50 && mark <= 75) {
			System.out.println("3rd class");	
		}
		else if (mark > 75 && mark <= 90) {
			System.out.println("2nd class");
		}
		else if(mark > 90 && mark <=100) {
			System.out.println("1st class");
		}
		else {
			System.out.println("Invalid mark");
			
		}
	}

}
