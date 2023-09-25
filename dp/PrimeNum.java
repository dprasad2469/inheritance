package dp;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=100;

		for(int dp=2; dp<=p; dp++)
		{
			 int count=0;
			for(int kp=2; kp<dp; kp++)
			{
				if(dp % kp==0)
				{
					count++;
					
				}
			}
			if(count==0)
			{
				System.out.println(dp);
			}
	}
	}

}
