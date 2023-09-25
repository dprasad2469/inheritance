package Methods;

public class Overloading {
	String name;
	int age;
	public void displayinfo(String name) 
	{
		System.out.print("name");
	}
	public void displayinfo(int age)
	{
		System.out.println(age);
	}
	public void displayinfo(String name, int age) {
		System.out.println("Name"+name+"\n"+"age"+age);
	}
	public static void main(String[] args) {
		Overloading kp = new Overloading();
		kp.displayinfo("Durga prasad",28);
	}
	}