package PatternPrinting;

public class sequencePattern {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = i+i; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
