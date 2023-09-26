package Oops;

abstract class car{
	abstract void run();
}
class Wolkswagen extends car{
	public void run() {
		System.out.println("Wolkswagen car is safer");
	}
}

public class abstraction {

	public static void main(String[] args) {
		Wolkswagen w=new Wolkswagen();
		w.run();

	}

}