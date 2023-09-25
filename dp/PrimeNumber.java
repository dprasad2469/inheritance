package dp;

public class PrimeNumber {
	public static void Primenumber() {
		for(int t = 1; t <=100; t++)	{
			int count = 0;
			
			for (int s = 1; s <=t; s++) {
				if(t % s==0) {
					count++;
				}
			}
			if (count ==2) {
				System.out.println(t);
			}
		}
	}

	public static void main(String[] args) {
		Primenumber();
	}

}
