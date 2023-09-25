package object;

public class Ascii {

	public static void main(String[] args) {
		int j;
		System.out.println("Alphabets from (A-Z) are:");
		// ASCII value of A=65 and Z=90
		for (j = 65; j<= 90; j++) {
			System.out.print((char)j + " ");
		}
		System.out.println("\nAlphabets from (a-z) are:");
		// ASCII value of a=97 and z=122
		 for (j = 97; j<= 122; j++) {
			 System.out.print((char)j + " ");
		 }
	}
}