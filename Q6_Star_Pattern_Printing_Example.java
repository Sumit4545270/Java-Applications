public class Q6_Star_Pattern_Printing_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0; 
		
		for (int i = 5 ; i >= a; i--) {
			for (int j = 1; j <= i;j++)  {				 
					System.out.print("*");								
			}
			System.out.println();
		}
	}
}