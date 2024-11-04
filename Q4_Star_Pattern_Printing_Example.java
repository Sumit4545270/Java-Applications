
public class Q4_Star_Pattern_Printing_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 4;
		
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++){
				
				if (i == 1 || j == 1 || i == a || j == b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println( );
		}
		
		

	}

}
