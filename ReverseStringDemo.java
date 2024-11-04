package InterviewPrepration;

public class ReverseStringDemo {
	public static void main(String[] args) {
		String originalString = "Sumit";
		String reverseString = "";
		
		for(int i = 0; i < originalString.length(); i++) {
			reverseString = originalString.charAt(i) + reverseString;			
		}
		System.out.println(reverseString);		
	}
}
