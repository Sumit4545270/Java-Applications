package InterviewPrepration;

public class missingElementDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,5,3,4,6,8};
		int missingNum = findMissingNumber(arr, 8);
		System.out.println("Missing Number: "+missingNum);
	}
	
	private static int findMissingNumber(int[] arr, int n) {
		
		int total_cal = n*(n+1)/2;
		System.out.println("Total Cal: "+total_cal);
		
		int Num_sum = 0;
		for(int i : arr) {
			Num_sum += i;
		}
		System.out.println("Num sum: "+Num_sum);
		
		return total_cal - Num_sum;
	}
}
