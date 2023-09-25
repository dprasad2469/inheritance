package kp;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='7';
		if(Character.isAlphabetic(ch)) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U')
			{
				System.out.println("given character is vowel");
			}
			else {
				System.out.println("given character is consonant");
			}
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("given character is a number");
		}
		else {
			System.out.println("given character is a symbol");
	}

}
}
