package PatternPrinting;

public class udLeftyPiramid {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int x = 5; x >= i; x--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int g = 1; g <= 5; g++) {
			for(int j = 1; j <= g; j++) {
				System.out.print(" ");
			}
			for(int x = 5; x >= g; x--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
