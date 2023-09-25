package dp;

public class Durga {
	static String var="prasad";
	public static void main(String[] args) {
		int d=10;
		System.out.println(d);
		System.out.println("walk in nature");
		System.out.println(var);
		
		One obj =new One();
		System.out.println(obj.d1);
		System.out.println(One.var1);
		obj.firstclass();
		
		Two sai =new Two();
		System.out.println(sai);
		System.out.println(Two.var2);
		sai.secondclass();
		
		Three nikhil =new Three();
		System.out.println(nikhil);
		System.out.println(Three.var3);
		nikhil.thirdclass();
		
	}
}
class One{
	int d1=30;
	static String var1="durga";
	public void firstclass() {
		int d=60;
		System.out.println(d);
		System.out.println("first class");
		
	}
}
class Two{
	int b=2;
	static String var2="pavan";
	public void secondclass() {
		int k=40;
		System.out.println(k);
		System.out.println("second class");
	}
}
class Three{
	int L=25;
	static String var3="naveen";
	public void thirdclass() {
		int m =55;
		System.out.println(m);
	}
}