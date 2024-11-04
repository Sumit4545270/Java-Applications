package Array;

public class Display {
	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println("Array Elements are Displayed: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}
