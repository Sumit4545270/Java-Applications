package Array;
public class Updation {
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		System.out.println("Array Before Updation....");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		System.out.println("Array After Updation....");
		arr[0] = 11;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}
