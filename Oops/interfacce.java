package Oops;
interface A{
	void a();
	void b();
	void c();
	void d();
	
}
class B implements A{
	public void a() {
		System.out.println("i am a");
	}
	public void b() {
		System.out.println("i am b");
	}
	public void c() {
		System.out.println("i am c");
	}
	public void d() {
		System.out.println("i am d");
	}
}

public class interfacce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.a();
		a.b();
		a.c();
		a.d();

	}

}
