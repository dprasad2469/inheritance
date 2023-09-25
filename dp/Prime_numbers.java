package dp;

public class Prime_numbers {

	public static void PrimeNumber() {
		
		for (int dp = 1; dp <=50; dp++) {		//outer forloop
			int count = 0;						//declare the empty variable
			
			for (int kp = 1; kp <=dp ; kp++) {	//inner forloop
				if(dp % kp==0) {				//Arthimetic operators
					count++;					//To increase the count and store to the count variable
				}
			}
			if (count ==2) {					//check the conditions
				System.out.println(dp);			//if condition pass print the value
			}
		}
	}
	public static void main(String[] args) {
		PrimeNumber();
	}
}
