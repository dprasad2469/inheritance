package Methods;
class A{
	public void dp()
	{
		System.out.println("print Dp");
	}
}
class B extends A{
	public void kp() {
		super.dp();
	}
	public void dp() {
		System.out.println("print Kp");
	}
}
public class Overriding extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding k = new Overriding();
		k.dp();
		k.kp();
	}
}
