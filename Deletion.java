package Array;

public class Deletion {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int n = arr.length - 1;
		
		System.out.println("Array Before Deletion....");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		System.out.println("Array After Insertion....");
		for (int i = 0; i <arr.length; i++) {
			arr[i] = i + 1;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		System.out.println("Array After Deletion....");
		for (int i = 0; i < n; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}
