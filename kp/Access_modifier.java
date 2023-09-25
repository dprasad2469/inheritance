package kp;

public class Access_modifier {
	public void v1()
	{
		System.out.println("v1 has public access");
	}
	private void v2()
	{
		System.out.println("v2 has private access");
	}
	protected void v3()
	{
		System.out.println("v3 has protected access");
	}
	void v4()
	{
		System.out.println("v4 has default access");
	}

	public static void main(String[] args) {
		Access_modifier k=new Access_modifier();
		k.v1();
		k.v2();
		k.v3();
		k.v4();
		
	}

}
