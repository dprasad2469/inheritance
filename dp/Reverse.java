package dp;

public class Reverse {

	public static void main(String[] args) {
		
		int numbers = 2538;
		int rev = 0;
		while (numbers!=0)
		{
			rev=rev*10 + numbers%10;
			numbers=numbers/10;
		}
	        System.out.println("reverse number is "+rev); 
	             numbers++;
	}
}
