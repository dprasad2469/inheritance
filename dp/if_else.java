package dp;

public class if_else {

	public static void main(String[] args) {
		int french=55, english=40, science=35, maths=60;
		if(maths>=50 && science>=45 && (english>=35 || french>=40))
		{
			System.out.println("students are promoted");
		}
		else
		{
			System.out.println("students are not promoted");
		}
	}

}
