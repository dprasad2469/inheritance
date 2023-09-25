package object;

public class Duplicate_String {

	public static void main(String[] args) {
		
		String dp = "shimakhtechnology";
		int length = dp.length();
		char[] kp = dp.toCharArray();
		for(int k=0; k<length; k++)
		{
			for(int j=k+1; j<length; j++)
			{
				if(kp[k] == kp[j])
				{
					System.out.println("duplicate characters are:" +kp[j]);
				}
			}
		}
	}

}