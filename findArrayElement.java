package InterviewPrepration;

public class findArrayElement {
	
	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int target = 6;
		
		for(int i : arr) {
			if(i == target) {
				System.out.println("Target is: "+target);
				break;
			}
			System.out.println("Checking: "+i);
		}
		
		for(int j : arr) {
			if(j % 2 == 0) {
				continue;
			}
			System.out.println("Odd Number: "+j);
		}
		
	}
}
