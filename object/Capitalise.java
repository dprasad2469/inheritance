package object;

public class Capitalise {
	public static void main(String[] args) {
		String str = "nothing is impossible in the world";
		String [] words=str.split("");
		for(String word:words) {
			char[] ch=word.toCharArray();
			char c=ch[0];
			String firstChar=String.valueOf(c).toUpperCase();
			String capitalizedWord=firstChar;
			for(int i=1;i<ch.length;i++)
			{
				 capitalizedWord= capitalizedWord+ch[i];
			}
			System.out.print(capitalizedWord+"");
		}
		
	}
}
