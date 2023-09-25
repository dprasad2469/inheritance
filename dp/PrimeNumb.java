package dp;

public class PrimeNumb {

	public static void main(String[] args) {
		int m,n;
		for(m=1; m <=50; m++)	
		{
			for(n=2;n<m; n++)
			{
				if(m%n==0)
					break;
			}
			if(m==n)
			{
				System.out.println(m);
			}
		}
	}

}