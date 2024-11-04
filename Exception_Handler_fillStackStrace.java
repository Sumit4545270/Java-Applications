package Exception_Handler;

public class Exception_Handler_fillStackStrace {
	public static void main(String[] args) {
		
		try {
			ex();
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
			e.printStackTrace();
		}
		
	}
	public static void ex() throws Exception {
		throw new Exception("Initialise Exception...!");
	}
}