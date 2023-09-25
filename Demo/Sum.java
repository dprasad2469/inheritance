package Demo;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,8,7,6,5,4,3,2,1};
		int sum=0;
		for (int i = 0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("sum= "+sum);
	}

}
