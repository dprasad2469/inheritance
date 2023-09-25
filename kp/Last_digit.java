package kp;
import java.util.Scanner;
public class Last_digit {

	public static void main(String[] args) {
		Last_digit.last();
	}
	public static void last(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=input.nextInt();
		int d=a%10;
		System.out.println("Last digit:"+d);
		input.close();
	}
	

}
