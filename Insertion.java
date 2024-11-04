package Array;
public class Insertion {
	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println("Before Insertion...");
		for (int i=0;i<5;i++ ) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println("After Insertion...");
		for(int i=
				0; i<arr.length;i++) {
			arr[i] = i+1;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}
