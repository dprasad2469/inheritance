package kp;

public class Sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,8,9};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum = "+sum);
	}

}