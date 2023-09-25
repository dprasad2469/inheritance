package dp;

public class ForLoop {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
		
		for (int count : numbers)	//for(dataType iteratorVariable : IterableObject)
		{  
			System.out.println("Count is : "+count);
		}
	}
}