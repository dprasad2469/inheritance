package object;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int d=0;
			int e=1;
			int f=0;
			System.out.println(d+" "+e);
			for(int k=2;k<10;k++)
			{
				f=d+e;
				System.out.print(" "+f);
				d=e;
				e=f;
			}
	}

}